package encapsulation;

public class BankAccount {

	private long account_no = 12345678l;
	private int balance = 10000;
	
	//Geeters and setters 
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("The account no is "+ account_no);
		System.out.println("The balance is "+ balance);
	}
}
