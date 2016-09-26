package Lp5;

public class ElectionDemo {

	public static void main(String[] args)
	{
	    Election E=new Election();
	    E.CountVote();
	    System.out.println("number of votes for canditate 1 is :"+E.getCand1());
	    System.out.println("number of votes for canditate 2 is :"+E.getCand2());
	    System.out.println("number of votes for canditate 3 is :"+E.getCand3());
	    System.out.println("number of votes for canditate 4 is :"+E.getCand4());
	    System.out.println("number of votes for canditate 5 is :"+E.getCand5());
	    System.out.println("number of spoilt votes are  :"+E.getiDefaultVotes());
	    

	}

}
