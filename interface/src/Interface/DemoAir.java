package Interface;
import Interface.Airport.Traveller;
public class DemoAir 
{
public static void main(String[] args)
{
	Traveller  t=new Traveller("spoo",1000,9738340335l, 1997);
		if(t.checkbaggage(t)==true)
			
		{
			System.out.println(" person is valid to travel");
			
		}
		else
			System.out.println(" person is invalid to travel");
	
		if(t.Checkexpiry(t)==true)
		{
			System.out.println("person is valid to travell");
			
			
		}
		else
			System.out.println("person is invalid");
		
		
		
		
}
	
	
	
	
}
