package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date moment;
	private OrderStatus order;
	
	private List<Item> item = new ArrayList();
	
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus order) {
		this.moment = moment;
		this.order = order;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrder() {
		return order;
	}

	public void setOrder(OrderStatus order) {
		this.order = order;
	}
	
	public void addItem(Item item_){
		item.add(item_);
	}
	
	public void removeItem(Item item_){
		int i = item.indexOf(item_);
		item.remove(i);
	}
	
	public Item getIndexOfItem(int i){
		return item.get(i);
	}
	
	public Integer getLenghtOfItem(){
		return item.size();
	}
	
	
	

}
