package accounts;

/**
	   A bank account has a balance that can be changed by 
	   deposits and withdrawals.
 */
public class BankAccount implements Measurable
{  
	/**
	      Constructs a bank account with a zero balance
	 */
	public BankAccount()
	{  
		balance = 0;
	}

	/**
	      Constructs a bank account with a given balance
	      @param initialBalance the initial balance
	 */
	public BankAccount(double initialBalance)
	{  
		balance = initialBalance;
	}

	/**
	      Deposits money into the bank account.
	      @param amount the amount to deposit
	 */
	public void deposit(double amount) 
	{  
		balance = balance + amount;
	}

	/**
	      Withdraws money from the bank account.
	      @param amount the amount to withdraw
	 */
	public void withdraw(double amount) 
	{  
		balance = balance - amount;
	}

	/**
	      Gets the current balance of the bank account.
	      @return the current balance
	 */
	public double getBalance()
	{  
		return balance; 
	}

	/**
	      Transfers money from the bank account to another account
	      @param other the other account
	      @param amount the amount to transfer
	 */
	public void transfer(BankAccount other, double amount)
	{  
		withdraw(amount);
		other.deposit(amount);
	}

	private double balance;

	public double getMeasure() {
		return balance;
	} 
	
	public String toString(){
		return "type BankAccount – balance £" + balance;
	}
}
