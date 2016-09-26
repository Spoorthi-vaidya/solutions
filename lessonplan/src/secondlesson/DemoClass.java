package secondlesson;

public class DemoClass {

	public static void main(String[] args) {
		College bvb= new College("bvb",123);
		
		bvb.addDepartment("cs", 1, 20);
		bvb.addDepartment( "is ",2 ,30);
		System.out.println(bvb.getTotal());
	
		

	}

}
