package lab1_practice;

public class BankAcc {
	private String name;
	private double balance;
	private Date openDate;
	
	public BankAcc (String name) {
		this.name = name;
		this.balance = 0.0;
		this.openDate = getNowDate();
	}
	
	public BankAcc (String name, double amount, Date date) {
		this.name = name;
		this.balance = amount;
		this.openDate = date;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}
	
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	public void tranfer(BankAcc other, double amount) {
		if(this.withdraw(amount)) {
			other.deposit(amount);
		}
	}
	public double getBalance() {
		return this.balance ;
	}
	public String getInfo() {
		return "Account Name: " + this.name + ", Open Date: " + openDate.getDay() + "/" + openDate.getMonth() + "/" + openDate.getYear();
	}
	private Date getNowDate() {
        return new Date(19, 7, 2024);
    }
}
