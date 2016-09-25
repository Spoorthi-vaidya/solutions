package correctSolutions;

public class Multiplexdemo {

	public static void main(String[] args) {
		Multiplex mt= new Multiplex("Oasis", "hubli");
		mt.s[0]=new Screen(1,100);
		mt.s[1]=new Screen(2, 220);
		
		mt.s[0].m[0]=new Movie("ramachari", "kannada");
		mt.s[0].m[1]=new Movie("raaz", "hindi");
		
		mt.s[1].m[0]=new Movie("kotigobba", "kannada");
		mt.s[1].m[1]=new Movie("dhookudu", "telgu");
System.out.println(" multiplex is "+mt.Name+"IN CITY"+mt.city);

System.out.println("in screen no :"+mt.s[0].Screenno);
System.out.println(" at 12pm movie   :"+mt.s[0].m[0].title);
System.out.println(" at 3pm movie    :"+mt.s[0].m[1].title);


System.out.println("in screen no :"+mt.s[1].Screenno);
System.out.println(" at 12pm movie    :"+mt.s[1].m[0].title);
System.out.println(" at 3pm movie     :"+mt.s[1].m[1].title);



	}

}
