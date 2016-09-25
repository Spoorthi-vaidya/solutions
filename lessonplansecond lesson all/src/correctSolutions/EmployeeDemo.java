package correctSolutions;

public class EmployeeDemo {

	public static void main(String[] args) {
	manager m=new manager(1, 0, "spoo", 19000, 50);
	m.paybonus(1000);
	m.displayifo();
	
	
	
	Salesman s=new Salesman(19, 0, "shru", 10000, 8);
	s.paybonus(900);
	s.displayifo();
	

	}

}
