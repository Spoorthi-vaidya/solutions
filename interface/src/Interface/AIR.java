package Interface;



interface AirportWork
{
	boolean checkbaggae(Traveller t);
	
	
}


class Traveller
{
	
	class AIRPORT implements  AirportWork
	{

		@Override
		public boolean checkbaggae(Traveller t) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	
	
}