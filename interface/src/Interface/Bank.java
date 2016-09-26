package Interface;

public interface Bank

{
	void deposit(double amt,Account a);
	double withdraw(double amt, Account a);
	void transfer(Account a , Account b,double amt);

	
	
	
	
	
	
}
class Account implements Bank
{	String Sname;
	double balance;
	String type;
	int accNo;
	public Account(String sname, double balance, String type, int accNo)
	{
		super();
		Sname = sname;
		this.balance = balance;
		this.type = type;
		this.accNo = accNo;
	}
	@Override
	public void deposit(double amt,Account a) {
		a.balance=a.balance+amt;
		
		
	}
	@Override
	public double withdraw(double amt,Account a) {
		a.balance=a.balance-amt;
		return a.balance;
	}
	@Override
	public void transfer(Account a, Account b, double amt) {
		
		a.balance=a.balance-amt;
		b.balance=b.balance+amt;
		
		
	}
	
	
	
	
	
	
	
	
}


