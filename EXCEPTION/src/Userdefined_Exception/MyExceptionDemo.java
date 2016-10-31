package Userdefined_Exception;

public class MyExceptionDemo {

	public int add(int a , int b) throws MyException
	{
		
		if(a==0|| b==0)
		{
			throw new MyException("a or b is zero exception");
			
		}
		
		return(a+b);
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
MyException m=new MyException("spoo error");
MyException m2=new MyException();
System.out.println(m.Error);
System.out.println(m.toString());

MyExceptionDemo m3 =new MyExceptionDemo();
try
{


System.out.println(m3.add(10, 20));
System.out.println(m3.add(10, 0));
}

catch(MyException me)
{
	System.out.println("its exception "+me);
	
	
}

finally
{
System.out.println(" finally block");	

}
}}
