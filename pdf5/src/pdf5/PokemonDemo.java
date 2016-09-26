package pdf5;

public class PokemonDemo {

	public static void main(String[] args)
	{
	
		Pokemon obj1= new Pokemon(19, 90, "spoo", "Cs", 30, 13, 17);
		System.out.println(" Name : "+ obj1.getsName());
		
		System.out.println(" type : "+ obj1.getsPokemonType());
		System.out.println(" ID :"+ obj1.getiPokeId());
		System.out.println(" lost : "+ obj1.getiLost());
		System.out.println(" won : "+ obj1.getiWon());
		System.out.println(" played total matches : "+ obj1.getiTotalMatchPlayed());
		System.out.println(" initialCp : "+ obj1.getiInitialCp());
		System.out.println(" finalCp "+ obj1.CalPokemonCp());

		Pokemon obj2= new Pokemon(88, 90, "shru", "Cs", 27, 21, 6);
		System.out.println(" Name : "+ obj2.getsName());

		System.out.println(" type : "+ obj2.getsPokemonType());
		System.out.println(" ID :"+ obj2.getiPokeId());
		System.out.println(" lost : "+ obj2.getiLost());
		System.out.println(" won : "+ obj2.getiWon());
		System.out.println(" played total matches : "+ obj2.getiTotalMatchPlayed());
		System.out.println(" initialCp : "+ obj2.getiInitialCp());
		System.out.println(" finalCp "+ obj2.CalPokemonCp());
		
		
		
		
		
		
		
	}

}
