package accounts;

/**
   An account that earns interest at a fixed rate.
 */
public class SavingsAccount extends BankAccount
{  
	/**
      Constructs a bank account with a given interest rate
      @param rate the interest rate
	 */
	public SavingsAccount(double rate) 
	{  
		interestRate = rate;
	}

	/**
    Constructs a bank account with a given balance and interest rate
  	@param initialBalance the initial balance
    @param rate the interest rate
	 */	
	public SavingsAccount(double initialBalance, double rate) {
		super(initialBalance);
		interestRate = rate;
	}

	/**
	      Adds the earned interest to the account balance.
	 */
	public void addInterest() 
	{  
		double interest = getBalance() * interestRate / 100;
		deposit(interest); 
	}
	
	public String toString(){
		return "type SavingsAccount – balance £" + this.getBalance();
	}

	private double interestRate;
}

