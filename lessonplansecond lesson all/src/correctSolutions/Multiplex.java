package correctSolutions;

public class Multiplex
{

	
	String Name;
	String city;
	Screen[] s=new Screen[2];
	public Multiplex(String name, String city) {
		super();
		Name = name;
		this.city = city;
	}
	
	
	
	
	
}
class Screen
{
	int Screenno;
	int capacity;
	Movie [] m=new Movie[2];
	public Screen(int screenno, int capacity) {
		super();
		Screenno = screenno;
		this.capacity = capacity;
		
	}
	
	
	
}


class Movie
{
	String title;
	String Language;
	public Movie(String title, String language) {
		super();
		this.title = title;
		Language = language;
	}
	
	
}