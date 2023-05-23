package entitties;

public class Bank {

	private String holder;
	private int number;
	private double balance;
	
	public Bank(String holder, int number, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Bank(String holder, int number) {
		this.number = number;
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setName(String holder) {
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " +  number + ", Holder: " + holder + ", Balance: $" + String.format("%.2f", balance);
	}
	
	
}
