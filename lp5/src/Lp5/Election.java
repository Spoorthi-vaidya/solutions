package Lp5;
import java.util.Scanner;
public class Election
{
	private int iVote;
	private int Cand1;
	private int Cand2;
	private int Cand3;
	private int Cand4;
	private int Cand5;
	private int iDefaultVotes;
	
	private Scanner sc; 
	
		
		

	public void CountVote()
	{
		Cand1=0;
		Cand2=0;
		Cand3=0;
		Cand4=0;
		Cand5=0;
		int n;
		iDefaultVotes=0;
		int i;
		sc = new Scanner(System.in);
		System.out.println("enter the number of voters :");
		n=sc.nextInt();
		
		for (i=0 ;i<n;i++)
		{
			System.out.println("enter the vote of voter "+(i+1));
			iVote=sc.nextInt();
			
			switch(iVote)
		
		{
		case 1: Cand1++;
		       break;
		case 2 :Cand2++;
		       break;
		case 3: Cand3++;
				break;
		case 4: Cand4++;
				break;
		case 5: Cand5++;
				break;
				
	    default: iDefaultVotes++;
	    		break;
		
		}
		
		}
		
		
		
		
	}
	public int getCand1() {
		return Cand1;
	}
	public int getCand2() {
		return Cand2;
	}
	public int getCand3() {
		return Cand3;
	}
	public int getCand4() {
		return Cand4;
	}
	public int getCand5() {
		return Cand5;
	}
	public int getiDefaultVotes() {
		return iDefaultVotes;
	}
	
	
	
	

}
