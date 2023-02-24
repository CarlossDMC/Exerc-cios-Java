package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	
	private String moment;
	private OrderStatus status;
	private Client client;
	
	ArrayList<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order(String moment, OrderStatus status, Client client){
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item_) {
		items.add(item_);
	}
	
	public ArrayList<OrderItem> getItem() {
		return items;
	}
	
	public void removeItem(OrderItem item_) {
		items.remove(item_);
	}
	
	public Double total() {
		Double total = (double) 0;
		for(int i=0; i < items.size(); i++) {
			total += items.get(i).subTotal();;
		}
		return total;
	}
	
	
}
