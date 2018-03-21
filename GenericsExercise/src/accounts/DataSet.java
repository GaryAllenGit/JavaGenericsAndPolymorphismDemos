package accounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DataSet <T extends Measurable>

{
	public DataSet(){
		sum = 0;
		count = 0;
		maximum = null;
		allEntries = new ArrayList<T>();
	}


	public void add(T x)
	{
		allEntries.add(x);
		sum = sum + x.getMeasure();
		if (count == 0 || maximum.getMeasure() < x.getMeasure())
			maximum = x;
		count++;
	}


	public T getMaximum()
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

	public void printAll(){
		Iterator<T> it = allEntries.iterator();
		int i = 0;

		while(it.hasNext()){
			T nextEntry = it.next();
			System.out.println("Element " + i + " - " + nextEntry);
			i++;
		}
	}

	public void sortData(){
		Collections.sort(allEntries, new Comparator<T>(){

			public int compare(T element1, T element2) {
				if (element1.getMeasure() == element2.getMeasure())
					return 0;
				else if (element1.getMeasure() > element2.getMeasure())
					return +1;
				else
					return -1;
			}

		} );
	}

	private double sum;
	private T maximum;
	private int count;
	private ArrayList<T> allEntries;
}




