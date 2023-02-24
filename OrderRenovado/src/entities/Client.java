package entities;

import java.time.LocalDate;

public class Client {
	
	private String name;
	private String email;
	private LocalDate birthay;
	
	public Client(String name, String email, LocalDate birthay) {
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

	public LocalDate getBirthay() {
		return birthay;
	}

	public void setBirthay(LocalDate birthay) {
		this.birthay = birthay;
	}
	
	
	
	

}
