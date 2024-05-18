package encapsulation;

public class BankAccountTest {
public static void main(String[] args) {
	BankAccount b1 = new BankAccount();
	//Before modification 
	b1.display();
	b1.setAccount_no(98765432);
	b1.setBalance(50000);
	
	System.out.println("*************************************");
	//After modification 
	b1.display();
}
}
