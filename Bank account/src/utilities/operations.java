package utilities;

public class operations {
	
	private int number_account;
	private String owner_name;
	private double balance;
	
	public operations(int number_account, String owner_name, double balance) {
		this.number_account = number_account;
		this.owner_name = owner_name;
		this.balance = balance;
	}

	public int getNumber_account() {
		return number_account;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
		
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw;
		balance -= 5;
		
	}


	
	
	
	
	

}
