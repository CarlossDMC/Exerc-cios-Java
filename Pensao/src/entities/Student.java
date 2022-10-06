package entities;

public class Student {
	private String name;
	private String email;
	private int room_number;
	
	public Student(String name, String email, int room_number) {
		this.name = name;
		this.email = email;
		this.room_number = room_number;
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

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	
	
	
	

}
