package appfix;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import appfix.model.NewOrderSingleBean;
import quickfix.Message;

@ManagedBean(name = "messageView")
@SessionScoped
public class MessageView {

	private NewOrderSingleBean newOrderSingleBean;
	private List<NewOrderSingleBean> listOrder;
	
	
	public MessageView() {
		newOrderSingleBean = new NewOrderSingleBean();
		listOrder = new ArrayList<>();
	}
	
	
	
	//Create New Order 
	public void createNewOrder() {
		newOrderSingleBean = new NewOrderSingleBean(); // New message
	}
	
	//Submit New Order 
	public void submitNewOrder() {
		newOrderSingleBean.setTransactTime(LocalDateTime.now()); //Time Transaction
		listOrder.add(newOrderSingleBean);
		Message message = Converter.toMessage(newOrderSingleBean);
		System.out.println(message.toString());
	}

	public NewOrderSingleBean getNewOrderSingleBean() {
		return newOrderSingleBean;
	}

	public void setNewOrderSingleBean(NewOrderSingleBean newOrderSingleBean) {
		this.newOrderSingleBean = newOrderSingleBean;
	}


	public List<NewOrderSingleBean> getListOrder() {
		return listOrder;
	}


	public void setListOrder(List<NewOrderSingleBean> listOrder) {
		this.listOrder = listOrder;
	}
	
	
	
}
