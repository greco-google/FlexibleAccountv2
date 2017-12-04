package Statics;

public class Account
{
  private static double balance;
  private String name;
  private long acctNum;
  private static int numDeposits;
  private static int totalDeposits;
  private static int numWithdraws;
  private static int totalWithdraws;
  
  private static int numAccounts = 0;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------

	  
  
  					//initBal
  public Account(double balance, String name, long acctNum)
  {
    //balance = initBal
	this.balance = balance;
    this.name = name;
    this.acctNum = acctNum;
    
    numAccounts++;
  }
  public Account (double balance, String name)  {
	    //balance = initBal
	  this.balance = balance;
	  this.name = name;
	  this.acctNum = (long)(Math.random()) * 9999;
	    numAccounts++;
  }
  public Account (String name) {
	  this.name = name;
	  this.balance = 0;
	  this.acctNum = (long)(Math.random() * 9000 + 1000);
	    numAccounts++;
  }


  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
 
  totalWithdraws += amount;
  numWithdraws ++;
  }
  		//Automatically declares as local
  public void withdraw(double amount, int fee)
  {
	    if (balance >= amount) {
	        balance -= amount;
	    		balance -= fee;
	    }
	     else
	        System.out.println("Insufficient funds");
	    
	    totalWithdraws += amount;
	    numWithdraws ++;
  } 

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
    
    totalDeposits += amount;
    numDeposits ++;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }
  public long getAcctNumber() {
	  return acctNum;
  }

  

public static int getNumDeposits() {
	return numDeposits;
}
public static int getNumWithdraws() {
	return numWithdraws;
}
public static int getTotalDeposits() {
	return totalDeposits;
}
public static int getTotalWithdraws() {
	return totalWithdraws;
}

  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
	return "Name:" + name + 
"\nAccount Number: " + acctNum +
"\nBalance: " + balance; 
  }
  
 
  public static String getNumAccounts() {
		return "There are " + numAccounts + " accounts";
	}
  public static void close() {
	  balance = 0;
	  numAccounts = numAccounts - 1;
	  
  }
  
  public static Account consolidate(Account acct1, Account acct2) {

	  if (acct1.name.equals(acct2.name)) {
		  Account acct3 = new Account(acct1.balance + acct2.balance, acct1.name);
	  acct1.close();
	  acct2.close();
	  return acct3;
	  }
	  else if (acct1.acctNum == acct2.acctNum) {
		  System.out.println("That is the same account.");
		  return null;
	  }
	  else {
		  System.out.println("You cannot do that.");
		  return null;
	  }
  }
public void printSummary() {
	// TODO Auto-generated method stub
	System.out.println("Summary of " + name + " account is: \n" + "Account number " + acctNum + "\n Balance: " + balance);
	
}


public void transfer(Account acct, double amount) {
	
	acct.withdraw(amount);
	this.deposit(amount);
	System.out.println("You have transfered " + amount + " from " + acct);
	System.out.println(this);
	
	
}
}


