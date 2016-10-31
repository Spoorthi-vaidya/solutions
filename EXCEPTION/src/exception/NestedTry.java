package exception;

public class NestedTry {

	public static void main(String[] args) {
		
		int a=args.length;// no command line argument a=0
	//	System.out.println(a);
		try
		{
			
			int b=42/a;
			
			System.out.println("a="+a);
			try
			{
			if(a==1)
				a=a/(a-a);
			
			if (a==2)
			{
				int B[]={1};
				B[42]=9;
				
				
			}
			
			}	catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("outof bound");
			}
			
			
		}
		catch(ArithmeticException ae)
		
		{
			System.out.println(ae);
		}
	}

}
