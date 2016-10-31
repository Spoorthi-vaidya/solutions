package Userdefined_Exception;

public class CurrentDateDemo {
	
	public static void main(String[] args)  {
		CurrentDate c=new CurrentDate(20, 99, 99999);
		
		CurrentDate c2 =new CurrentDate(20, 10, 2016);
		try
		{
			c2.display();
			c.display();
		}
		catch(CurrentDate ce)
		{
		
			System.out.println(ce);
		}
	
	}

}
