package Userdefined_Exception;

public class CurrentDate extends Exception {
	int day;
	int month;
	int year;
	String Error;
	public CurrentDate(String Error) {
		super();
		this.Error=Error;
	}

	public CurrentDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	};
	public String toString()
	{
	 return Error;
	}
		
	
	
	void display()throws CurrentDate
	{
		if(day<=0 || day>31)
		{
			throw new CurrentDate("day less than 0 or >31 exception");
		}
		
		if(month>12 || month<0)
		{
			throw new CurrentDate("month greater than 12 or less than 0 exception");
			
		}
		
		if(year>2016)
		{
			throw new CurrentDate("year greater than 2016 exception");
			
			
		}
		
		
		System.out.println("day:"+day+"\nmonth "+month+"\n year:"+year);
	
	}
	
	
	

	
}
