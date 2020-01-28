package appfix;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import quickfix.Message;


@ManagedBean(name = "clientView")
@SessionScoped
public class ClientView {
	
	private List<String> listMsg;
	private List<Message> listMessage;
	

	public ClientView() {
		listMessage  = new ArrayList<>();
		listMessage  = new ArrayList<>();
	}

	public List<String> getListMsg() {
		listMsg = Client.getListMsg();
		return listMsg;
	}

	public List<Message> getListMessage() {
		listMessage = Client.getListMessage();
	
		return listMessage;
		
	}
}
