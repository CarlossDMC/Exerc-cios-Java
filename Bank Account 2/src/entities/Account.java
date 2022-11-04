package entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double whitdrawLimit;
    
    public Account(Integer number, String holder, Double balance, Double whitdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.whitdrawLimit = whitdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWhitdrawLimit() {
        return whitdrawLimit;
    }

    public void setWhitdrawLimit(Double whitdrawLimit) {
        this.whitdrawLimit = whitdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;

    }

    public void withdraw (Double amount ) throws Exception{

        
        if(amount > this.balance){
            throw new Exception("Withdraw error: Not enough balance");

        }

        else if (amount > this.whitdrawLimit){
            throw new Exception("Withdraw error: The amount exceeds withdraw limit");
        }

        else{
            amount -= this.balance;
        }
    }

    



    

    
    
    
}
