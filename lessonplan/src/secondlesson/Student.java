package secondlesson;

public class Student 
{
	String studName;
	int sem;
	Courses[] c=new Courses[4];	
	static int obj;
	int j=0;
	
	
	
	
	public Student(String studName, int sem) 
	{
		super();
		this.studName = studName;
		this.sem = sem;
		++obj;
		
	}
  void addcourse(String Ctitle ,int Cid,boolean FavCourse )
  
  {
	  c[j++]=new Courses(Ctitle,Cid,FavCourse);
	  
	  
  }
  
  String getFavCourse()
  {int i;
	  for(i=0;i<c.length;i++)
	  {		if(c[i].FavCourse==true)
		  {
		  	return c[i].Ctitle;
		  		   	
		  }
	  }
	return c[i].Ctitle;
	  
	
	  
	  
  }
  



	class Courses
	{
		String Ctitle;
		boolean FavCourse;
		int CId;
		public Courses(String ctitle, int cId,boolean FavCourse) {
			super();
			Ctitle = ctitle;
			CId = cId;
			this.FavCourse=FavCourse;
		}
		
		
		
	}
	
	
	
	
	
	
	
}
