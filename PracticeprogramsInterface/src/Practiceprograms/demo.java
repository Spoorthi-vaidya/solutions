package Practiceprograms;

public class demo {
	public static void main(String[] args)
	{
		saving_acc s= new saving_acc("spoo", true, 9000);
		System.out.println("info of"+s.Name);
		s.displaybalance();
		s.deposit(100);
		s.displaybalance();
			account_inf[] acc=new account_inf[3];
			acc[0]=new saving_acc("spoo", true, 2000);
			acc[1]=new pfund("shru", false, 1000);
			acc[2]=new  saving_acc("triveni", true, 500);
			for(int i=0;i<acc.length;i++)
			{
				acc[i].deposit(100);
				acc[i].displaybalance();
			}
		acc[2].withdraw(300);
		acc[1].withdraw(800);
		
	}
}
