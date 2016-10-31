package exception;

public class Throw2 {

	public static void display()
	{
		try
		{
			throw new NullPointerException(" hi ");
			
		}
		catch(NullPointerException ne)
		{
			System.out.println(" caugth inside display"+ne);
			throw ne;// rethrow (check output)
		}
		
	}
	public static void main(String[] args) {
		try
		{
			display();
		}
		catch(NullPointerException ne)
		{
			System.out.println("main"+ne);
		}
		

	}

}
