package appfix.tools;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.Message;
import quickfix.fix44.NewOrderSingle;

/**
 * Create message object form the XML string, or in another words, reverse toXML() method from QuickFixJ
 * 
 * @author wlopes
 *
 */

public class XmlMessage {
	private final String xml;
	private final String delimiter;
	
	
	
	public static void main(String []args) {
		
	  try {
		final DataDictionary dd = new DataDictionary("FIX44.xml");
		for(int i=0; i<dd.getOrderedFields().length;i++) {
			System.out.println(dd.getFieldName(i));
		}
		
	} catch (ConfigError e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
//		
//		Message nos = new Message();
//		
//		System.out.println(nos);
//		
//		
//		System.out.println(nos.toXML());
//		
//		
//		
//		XmlMessage xm = new XmlMessage(nos.toXML(), "|");
//		
//		try {
//			System.out.println(xm.toFixMessage());
//		} catch (IOException | SAXException | ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

	XmlMessage(final String xml, final String delimiter) {
		this.xml = xml;
		this.delimiter = delimiter;
	}

	public String toFixMessage() throws IOException, SAXException, ParserConfigurationException {
		
		final Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
				.parse(new ByteArrayInputStream(xml.getBytes()));

		final StringBuilder messageBuilder = new StringBuilder();
		build(messageBuilder, doc, "header");
		build(messageBuilder, doc, "body");
		build(messageBuilder, doc, "trailer");
		return messageBuilder.toString();
	}

	private void build(final StringBuilder messageBuilder, final Document doc, final String section) {
		final NodeList sectionRoot = doc.getElementsByTagName(section);
		final NodeList sectionChildren = sectionRoot.item(0).getChildNodes();
		build(messageBuilder, sectionChildren);
	}

	private void build(final StringBuilder messageBuilder, final NodeList nodeList) {
		final Set<String> numInGroupTags = getNumInGroupTags(nodeList);
		for (int i = 0; i < nodeList.getLength(); i++) {
			final Node node = nodeList.item(i);
			if (node.getNodeName().equals("field") && !numInGroupTags.contains(getTagNumber(node))) {
				messageBuilder.append(getTagNumber(node)).append('=').append(node.getTextContent()).append(delimiter);
			} else if (node.getNodeName().equals("groups")) {
				final NodeList groupElems = node.getChildNodes();
				messageBuilder.append(getTagNumber(node)).append('=').append(getGroupCount(groupElems))
						.append(delimiter);
				for (int j = 0; j < groupElems.getLength(); j++) {
					build(messageBuilder, groupElems.item(j).getChildNodes());
				}
			}
		}
	}

	private Set<String> getNumInGroupTags(final NodeList nodeList) {
		final Set<String> numInGroupTags = new HashSet<>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i).getNodeName().equals("groups")) {
				numInGroupTags.add(getTagNumber(nodeList.item(i)));
			}
		}
		return numInGroupTags;
	}

	private String getTagNumber(final Node node) {
		return node.getAttributes().getNamedItem("tag").getTextContent();
	}

	private int getGroupCount(final NodeList groupRoot) {
		int count = 0;
		for (int j = 0; j < groupRoot.getLength(); j++) {
			if (groupRoot.item(j).getNodeName().equals("group"))
				count++;
		}
		return count;
	}
}