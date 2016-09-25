package correctSolutions;

public class CashcardsDemo {

	public static void main(String[] args) {
		creditcard c=new creditcard("SBI", 5000);
		c.swipe();
		c.displayinfo();
		Debitcard d=new Debitcard("SBI", 5000);
		d.swipe();
		d.displayinfo();
	

	}

}
