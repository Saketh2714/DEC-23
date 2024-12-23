package Dec23;

public class BankDemo {


	public static void main(String[] args) {

		BankAccount bank = new BankAccount(14221, "Raju", 10000,"hyd","9845098450","NQP1964D");
		
		System.out.println(bank);
		
		bank.deposit(5000);
		bank.checkbalance();
		
		
		bank.withdraw(4000);
		bank.checkbalance();
	}

	}