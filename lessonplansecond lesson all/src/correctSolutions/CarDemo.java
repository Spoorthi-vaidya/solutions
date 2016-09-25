package correctSolutions;

public class CarDemo {

	public static void main(String[] args) {

		Ferrari f=new Ferrari("pink","Rocket " ,5, 10000f, 600);
		System.out.println("speed before accelerate"+f.speed);
		System.out.println(" speed after accelerating "+ f.accelerate());
		
		
		BMW b=new BMW("red", "avengr00", 7, 15000,900);
		System.out.println("speed before accelerate"+b.speed);
		System.out.println(" speed after accelerating "+ b.accelerate());
		int i;
	for(i=0;i<5;i++)
	{
		
		f.accelerate();
		
		b.accelerate();
	
		
		System.out.println("speed of ferrari  at"+i+"th sec is " +f.speed);
		System.out.println("speed of bmw at"+i+"th  sec is " +b.speed);
		
		
		
		
	}
	System.out.println(" applying break");
	for(i=0;i<2;i++)
	{
		
		f.brake();
		
		b.brake();
	
		
		System.out.println("speed of ferrari  at"+i+"th sec is " +f.speed);
		System.out.println("speed of bmw at"+i+"th  sec is " +b.speed);
		
		
		
		
	}
		
		
		
		
		
		
	}

}
