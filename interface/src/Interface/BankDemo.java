package Interface;

public class BankDemo
{
public static void main(String args[])
{Account a=new Account("spoorthi", 8000d, "savings", 111);
Account b=new Account("shruthi  ", 5000, "pfund",122);
if(a.type=="pfund")
{
	System.out.println("cant withdraw money from account pfund");
	
}
else
{   System.out.println("amount before deposit in account"+a.type+a.accNo+"\t"+a.balance);
	a.deposit(1000, a);
	System.out.println("amount after depositing 1000rs in account"+"" +a.type+""+ a.accNo+"\t"+a.balance);
	System.out.println("withdrawing amount from account"+a.type+a.accNo);
	a.withdraw(500, a);
	System.out.println("amount after withdrawing in account"+a.type+a.accNo+"\t"+a.balance);
	a.transfer(a, b, 500);
	System.out.println("amount after tranfering  in account"+b.type+b.accNo+"\t"+b.balance);
}
if(b.type=="pfund")
{
	
	
	System.out.println("cant withdraw money from account pfund");
	
	
	
}
else
{
	System.out.println("amount before deposit in account"+b.type+b.accNo+"\t"+b.balance);
b.deposit(1000, b);
System.out.println("amount after deposit in account"+b.type+b.accNo+"\t"+b.balance);
System.out.println("withdrawing amount from account"+b.type+b.accNo);
b.withdraw(500, b);
b.transfer(b, a, 500);

	
	
	
	
}

	
	
	
	
}
}