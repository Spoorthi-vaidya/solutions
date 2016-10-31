package exception;

public class ThrowDemo {

	public static void display()
	{
		throw new ArithmeticException("spoo");
		
		
	}
	
	
	public static void main(String[] args) {
		try
		{
			display();
		}
		catch(ArithmeticException ne)
		{
			System.out.println(ne);
		}
		
	}

}
