package accounts;


/**
	   This program tests the DataSet class.
 */
public class DataSetTest
{
	public static void main(String[] args)
	{

		DataSet<BankAccount> bankData = new DataSet<BankAccount>();

		bankData.add(new BankAccount(0));
		bankData.add(new SavingsAccount(10000.0,2.5));
		bankData.add(new CheckingAccount(2000));

		System.out.println("Average balance = " 
				+ bankData.getAverage());
		Measurable max = bankData.getMaximum();
		System.out.println("Highest balance = " 
				+ max.getMeasure());
		System.out.println("All Account balances...");
		bankData.printAll();
		System.out.println("sorting data");
		bankData.sortData();
		System.out.println("All Account balances after sorting...");
		bankData.printAll();

	}
}


