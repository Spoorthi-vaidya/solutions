package Practiceprograms;
import java.util.Scanner;

public interface Bank 
{
	
	
	double callEmi();
	
	
	
	
}
class customer
{
	String sname;
	long PhoneNO;
	
	
	
	public customer(String sname, long phoneNO) {
		super();
		this.sname = sname;
		PhoneNO = phoneNO;
	}



	class loan implements Bank
	{
		
		int choice;double emi;
		double rate;
		int time;
		double loanAmt;
		Scanner sc= new Scanner(System.in);
		void displayinfo()
		{
			System.out.println("customer details is:\n ");
			System.out.println("Name" +sname);
			System.out.println("phone no "+PhoneNO);
			
			
		}
		
		void getChoice()
		{
			System.out.println(" enter the choice : 1) two wheeler loan \n 2) 4 wheeler loan");
			choice=sc.nextInt();
			switch(choice)
			{
			
			case 1: System.out.println("two wheeler loan \n");
						
						System.out.println("monthly emi is "+callEmi());
						break;
			case 2 :  System.out.println(" 4 wheeler loan \n");
				
			System.out.println("monthly emi is "+callEmi());
			break;
			default:
			System.out.println("entered invalid choice");
			
			}
			
			
		}

		@Override
		public double callEmi() {
			System.out.println("enter loan amount\n");
			loanAmt=sc.nextDouble();
			System.out.println("enter time \n");
			time=sc.nextInt();
			
			System.out.println("rate \n");
			rate=sc.nextDouble();
			rate=rate/(12*100);
			time=time*12;
			emi=(loanAmt*rate*Math.pow((rate+1),time)/(Math.pow(1+rate, time)-1));
			return emi;
		}
		void totalemi()                                    
		{
			System.out.println(emi*time);
		}
		
		
	}
	
	
	
}


