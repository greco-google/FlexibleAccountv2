package Statics;

import java.util.Scanner;

public class TransferTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to transfer from account 1 to account 2?");
		String transferFund = scan.nextLine();
		while (transferFund.equals("Yes") || transferFund.equals("yes")) {
		
			Account acct1 = new Account (100, "Steve", 1);
			Account acct2 = new Account (100, "Gabe", 2);
			acct1.transfer(acct2,  50);
			System.out.println("\nCome back again!");
			System.exit(0);
			
		}

		



	}

}
