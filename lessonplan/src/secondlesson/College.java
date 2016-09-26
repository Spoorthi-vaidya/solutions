package secondlesson;

public class College 
{
	String Name;
	int colCode;
	Department[] d=new Department[10];
	int j=0;
	
	
	
	
	
	public College(String name, int colCode) {
		super();
		Name = name;
		this.colCode = colCode;
		
	}


void addDepartment(String Name,int Depcode,int NumStud)
{
	d[j++]=new Department(Name , Depcode , NumStud);
	
	
}
int getTotal()
{
	int i=0;
	int k;
	for(k=0;k<d.length;k++)
	{if(d[k]!=null)
		
	{
		i=i+d[k].NumStud;
		
	}
		
		
		
	
	}
	return i;
	
	
}


	class Department
	{
		
		String Name;
		int Depcode;
		int NumStud;
		public Department(String name, int depcode, int numStud)
		{
			super();
			Name = name;
			Depcode = depcode;
			NumStud = numStud;
		}
		
		
		
		
		
	}
	
	
	
	
}



