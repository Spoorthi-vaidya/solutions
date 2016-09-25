package correctSolutions;

public class Car {
	String color;
	String Name;
	int nofseats;
	float Maxspeed;
	float speed;
	public Car(String color, String name, int nofseats, float maxspeed,
			float speed) {
		super();
		this.color = color;
		Name = name;
		this.nofseats = nofseats;
		Maxspeed = maxspeed;
		this.speed = speed;
	}
	
	float accelerate(){
		return 0f;
	}
	float brake()
	{
		return 0f;
		
	}
	
	
	
	

}



class Ferrari extends Car
{

	public Ferrari(String color, String name, int nofseats, float maxspeed,
			float speed) {
		super(color, name, nofseats, maxspeed, speed);
		
	}
	
	float accelerate(){
		speed=speed+1000f;
		if(speed > Maxspeed)
		{
		speed=Maxspeed;
			return speed;
		}
		else
		return speed;
		
		
		
	}
	
	@Override
	float brake() {
		
		speed=speed-1000;
		if(speed<0f)
			return 0f;
		else
			return speed;
		
		
	}
	

	
	
	
	
}




class BMW extends Car
{

	public BMW(String color, String name, int nofseats, float maxspeed,
			float speed) {
		super(color, name, nofseats, maxspeed, speed);
		
	}
	@Override
	float accelerate() {
		speed=speed+800;
		if(Maxspeed<speed)
		{
			speed= Maxspeed;
			return speed;
			
		}
		else
			return speed;
	}
	
	
	@Override
	float brake() {
		speed=speed-200;
		if(speed<0f)
			return 0f;
		else
			return speed;
		
	
	
	}
	
}
