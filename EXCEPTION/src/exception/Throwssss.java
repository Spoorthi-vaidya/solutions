package exception;

public class Throwssss {

	static void display() throws  IllegalAccessException
	{
		throw new IllegalAccessException();
	}
	
	
	
	public static void main (String[] args)
	{
		try
		{
			display();
		}
		catch(IllegalAccessException ne)
		{
			System.out.println(ne);
		}
		
		
	}
}
