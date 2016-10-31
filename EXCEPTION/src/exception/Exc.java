package exception;

class A
{
	A(){
	}
	
	
	
	void disp()
	{
		System.out.println("hi");
	}
	
}





public class Exc {

	public static void main(String[] args) {
	int a=4;
	A obj=new A();
	int c=0;
	int b;
	try
	{
	b=a/c;
	obj=null;
	obj.disp();
	System.out.println("this wont b printed");
	}
	catch(ArithmeticException ae)
	{
		System.out.println(" divide by zero");
		
		
	}
	catch(NullPointerException be)
	{
		System.out.println(" null pointer exception");
		
	}
	System.out.println("after\n");
	}

}
