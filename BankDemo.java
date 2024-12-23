package Dec23;

public class BankDemo {

	public static void main(String[] args) {

		BankDemo bankAcc = new BankDemo(1000, "Raju", 5000,"hyd","9845098450","NQP1964D");
		
		System.out.println(bankAcc);
		
		bankAcc.deposit(5000);
		bankAcc.checkBalance();
		
		
		bankAcc.withDraw(4000);
		bankAcc.checkBalance();
	}
}