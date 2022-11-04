package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private String name;
	private String email;
	private String birthay;
	private SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	private Date bday = new Date();
	
	public Client(String name, String email, String birthay) {
		super();
		this.name = name;
		this.email = email;
		this.birthay = birthay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthay() {
		return birthay;
	}

	public void setBirthay(String birthay) {
		this.birthay = birthay;
	}
	
	public void convertBday() throws ParseException {
		bday = sdf1.parse(this.birthay);
	}
	
	
	
	
	

}
