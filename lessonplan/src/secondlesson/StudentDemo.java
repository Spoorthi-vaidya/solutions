
package secondlesson;



public class StudentDemo {

	public static void main(String[] args)
	{
	
			Student spoo=new Student("spoo", 3);
			spoo.addcourse("cs", 1, true);
			spoo.addcourse("is", 18, false);
			
			spoo.addcourse("dms", 18, false);
			spoo.addcourse("dsd", 18, true);
			
			System.out.println(spoo.getFavCourse());

		
	}

}
