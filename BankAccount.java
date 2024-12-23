package Dec23;

public class BankAccount {

	long accno;
	String name;
	int balance;
	String address;
	String mobile;
	String Panno;
	public BankAccount(long accno, String name, int balance, String address, String mobile, String panno) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.mobile = mobile;
		Panno = panno;
		System.out.println("account got opened with amount "+this.balance);
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", name=" + name + ", balance=" + balance + ", address=" + address
				+ ", mobile=" + mobile + ", Panno=" + Panno + "]";
	}
	
	void deposit( int amt) {
	this.balance= this.balance+amt;
	System.out.println("Successfully deposited amount...."+amt);
	}
	
	
	void withdraw(int amt) {
		this.balance=this.balance-amt;
		System.out.println("Successfully withdrawn amount...."+amt);
	}
	void checkbalance() {
		
		System.out.println("avl balance.....>"+this.balance);
	}
	}

