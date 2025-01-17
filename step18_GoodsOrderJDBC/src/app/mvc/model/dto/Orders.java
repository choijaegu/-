package app.mvc.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Orders {
  private int orderId; //pk		//주문번호
  private String orderDate;		//주문날짜
  private String userId;//fk	//아이디
  private String address;		//주소
  private int totalAmount;		//orderline에서 amount들을 합친 것.
  
  //1 : 다  
  private List<OrderLine> orderLineList = new ArrayList<OrderLine>();
  
    public Orders() {}
	public Orders(int orderId, String orderDate, String userId, String address, int totalAmount) {
	super();
	this.orderId = orderId;
	this.orderDate = orderDate;
	this.userId = userId;
	this.address = address;
	this.totalAmount = totalAmount;
}


	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public List<OrderLine> getOrderLineList() {
		return orderLineList;
	}
	
	public void setOrderLineList(List<OrderLine> orderLineList) {
		this.orderLineList = orderLineList;
	}
  
  
  
}


