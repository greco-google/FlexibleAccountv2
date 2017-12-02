package Statics;
import java.util.Scanner;

//***********************************************************
//TestAccounts1
//A simple program to test the numAccts method of the 
//Account class.  
//***********************************************************


public class TestAccounts1
{
 public static void main(String[] args)
 {
	Account testAcct;
	/*for(int i = 0; i < 20; i++) {
		int account = (int) (Math.random() * 4);
		//System.out.println(account);
	}*/

	Scanner scan = new Scanner(System.in);

	//System.out.println("How many accounts would you like to create?");
	//int num = scan.nextInt();
	

	/*for (int i=1; i<=num; i++)
	    {
		testAcct = new Account(100, "Name" + i);
		System.out.println("\nCreated account " + testAcct);
		System.out.println("Now there are " + Account.getNumAccounts());
	    }*/
	System.out.println("Enter 3 names: ");
	String name1 = scan.nextLine();
	String name2 = scan.nextLine();
	String name3 = scan.nextLine();
	
	Account acct1 = new Account(100, name1);
	Account acct2 = new Account(100, name2);
	Account acct3 = new Account(100, name3);
	
	acct1.close();
	System.out.println(Account.consolidate(acct2, acct3));
 }
}
