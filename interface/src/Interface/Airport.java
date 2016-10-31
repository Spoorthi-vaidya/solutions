package Interface;
import java.util.Scanner;
public interface Airport 
{
	Scanner sc=new Scanner(System.in);
	String sName=sc.next();
	String scode=sc.next();
	boolean bdutyfree=sc.hasNextBoolean();
	
	
	
	boolean checkbaggage(Traveller t);
	boolean Checkexpiry (Traveller t);
	
	
class Traveller implements Airport
{
	String sName;
	double Weight;
	long phoneno;
	int expiryyear;
	public Traveller(String sName, double weight, long phoneno, int expiryyear) {
		super();
		this.sName = sName;
		Weight = weight;
		this.phoneno = phoneno;
		this.expiryyear = expiryyear;
	}
	@Override
	public boolean checkbaggage(Traveller t) 
	{
			if(t.Weight>7d)
				return false;
		return true;
	}
	@Override
	public boolean Checkexpiry(Traveller t)
	{
		if(t.expiryyear >2020 )
	
		return false;
		
		return true;
	
	
	
	}
	
	
	
	
		
}
	
	
}
