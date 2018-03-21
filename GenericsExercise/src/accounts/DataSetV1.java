package accounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DataSetV1

{
	public DataSetV1(){
		sum = 0;
		count = 0;
		maximum = null;
		allAccounts = new ArrayList<Measurable>();
	}


	public void add(Measurable x)
	{
		allAccounts.add(x);
		sum = sum + x.getMeasure();
		if (count == 0 || maximum.getMeasure() < x.getMeasure())
			maximum = x;
		count++;
	}


	public Measurable getMaximum()
	{
		return maximum;
	}


	public double getAverage()
	{
		if (count == 0)
			return 0;
		else
			return sum / count;
	}

	public void printAllAccounts(){
		Iterator<Measurable> it = allAccounts.iterator();

		while(it.hasNext()){
			Measurable nextAccount = it.next();
			System.out.println("£ " + nextAccount.getMeasure());
		}
	}

	public void sortData(){
		Collections.sort(allAccounts, new Comparator<Measurable>(){

			public int compare(Measurable acc1, Measurable acc2) {
				if (acc1.getMeasure() == acc2.getMeasure())
					return 0;
				else if (acc1.getMeasure() > acc2.getMeasure())
					return +1;
				else
					return -1;
			}

		} );
	}

	private double sum;
	private Measurable maximum;
	private int count;
	private ArrayList<Measurable> allAccounts;
}




