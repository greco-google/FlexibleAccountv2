package Statics;

public class TransferTester {

	public static void main(String[] args) {
		
		Account acct1 = new Account (100, "B", 1);
		Account acct2 = new Account (100, "C", 2);

		acct1.transfer(acct2,  50);
	}

}
