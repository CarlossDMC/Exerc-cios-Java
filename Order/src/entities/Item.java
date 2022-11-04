package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
	private String name;
	private Double price;
	private Integer quantity;
	private String moment;
	private Date moment_ = new Date();
	private SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Item() {
		
	}
	
	public Item(String name, Double price, Integer quantity, String moment) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.moment = moment;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getMoment() {
		return moment_;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}
	
	public void convertMoment() throws ParseException {
		moment_ = sdf1.parse(this.moment);
	}
	
	public Double getSubtotal() {
		return this.quantity * this.price;
	}
	
	
	
	
	
}

