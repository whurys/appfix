package appfix;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "viewMessage")
@SessionScoped
public class ViewMessage {
	
	private List<String> listMessage;
	
	public ViewMessage() {
		listMessage  = new ArrayList<>();
		
		listMessage.add("wendel");
	}

	public List<String> getListMessage() {
		listMessage = Client.getListMsg();
		return listMessage;
	}


}
