package correctSolutions;



abstract class  Employeebonus
{
	int emplyeeid;
	float bonus;
	String Name;
	float Salary;
	public Employeebonus(int emplyeeid, float bonus, String name, float salary) {
		super();
		this.emplyeeid = emplyeeid;
		this.bonus = bonus;
		Name = name;
		Salary = salary;
	}
abstract void paybonus(float bonusamount);
	

	

}


class manager extends Employeebonus
{
	int noofshares;

	public manager(int emplyeeid, float bonus, String name, float salary,
			int noofshares) {
		super(emplyeeid, bonus, name, salary);
		this.noofshares = noofshares;
	}
	void paybonus(float bonusamount)
	{
	      noofshares=noofshares+10;
	      bonus=bonus+bonusamount;
	      
	}
	
	
	void displayifo(){
		System.out.println("bonus is  ="+this.bonus);
		System.out.println("increase in shares ="+ this.noofshares);
		
	}
	
}
class Salesman extends Employeebonus{
	
	int noofsales;

	public Salesman(int emplyeeid, float bonus, String name, float salary,
			int noofsales) {
		super(emplyeeid, bonus, name, salary);
		this.noofsales = noofsales;
	}
	
	void paybonus(float bonusamount){
		
		bonus=bonusamount+Salary*0.1f;
		

	
		
		
	}
	void displayifo(){
		System.out.println(" 10% salary is increased with bonus  ="+this.bonus);
	
		
	}
	
	
	
	
}