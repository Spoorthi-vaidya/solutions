package Practiceprograms;

interface account_inf
{
	
	void deposit(double amt);
	void withdraw(double amt);
	void displaybalance();
	
	
	
}







abstract class Account_abs implements account_inf
{
	String Name;
	String Accno;
	boolean Typeacc;
	static int accnoGenerator;
   
	public Account_abs(String name, boolean typeacc) {
		super();
		Name = name;
		
		Typeacc = typeacc;
	}

	
	
	
}
class saving_acc extends Account_abs
{
	
	double balance;

	public saving_acc(String name, boolean typeacc, double balance) {
		super(name, typeacc);
		this.balance = balance;
		accnoGenerator++;
		this.Accno="saving_acc"+accnoGenerator;
		
	}

	@Override
	public void deposit(double amt) {
		
		balance=balance+amt;
		System.out.println("amount"+amt+" is successfully depositted to "+Accno);
	}

	@Override
	public void withdraw(double amt)
	{
		if(amt<balance)
			{
			balance=balance-amt;System.out.println("amount"+amt+" is successfully withdrawn from "+Accno);
			
			}
		else
		{
			System.out.println("cant withdraw from account"+Accno);
		}
		
		
		
		
	}

	@Override
	public void displaybalance() {
			System.out.println("balance in account"+Accno+"is"+balance);
		
	}
	public void tranfer (double amt , saving_acc s, pfund p)
	{
		s.balance=s.balance-amt;
		p.balance=p.balance+amt;
		System.out.println("amount"+amt+"is tranfered from account"+s.Accno+" to "+ p.Accno);
		
	}

	
	
	
}
class pfund extends Account_abs
{
	double balance;

	public pfund(String name, boolean typeacc, double balance) {
		super(name, typeacc);
		this.balance = balance;
	
		Accno="PFUND"+accnoGenerator+2;
		
	}

	@Override
	public void deposit(double amt) {
	System.out.println("cannot deposit to pfund account "+Accno);
		// TODO Auto-generated method stub
	}
	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		System.out.println("cannot withdraw to pfund account "+Accno);
	}

	@Override
	public void displaybalance() {
		System.out.println("balance in account"+Accno+"is"+balance);
		
	}
	public void tranfer (double amt , saving_acc s, pfund p)
	{
		System.out.println("cannount tranfer amount from pfund account to saving account");
		
	}

	
	

	
	}
	
	
	
	
