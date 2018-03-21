import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {

	public static void main(String args[]){
		// first - the old way of doing things...
		ArrayList notGeneric = new ArrayList();

		notGeneric.add("This is a String");
		notGeneric.add("This is a another String");
		notGeneric.add("And this is the third String");

		for(int i = 0; i < notGeneric.size(); i++){
			String nextString = (String)notGeneric.get(i);
			System.out.println(nextString);
		}
		System.out.println();

		// now the new way, using generics
		ArrayList<String> generic = new ArrayList<String>();

		generic.add("This is a String");
		generic.add("This is a another String");
		generic.add("And this is the third String");

		// we can iterate over the elements as we did above
		for(int i = 0; i < generic.size(); i++){
			String nextString = generic.get(i);
			System.out.println(nextString);
		}
		System.out.println();

		// we can also iterate over the elements using a generic iterator object
		Iterator<String> it = generic.iterator();
		while(it.hasNext()){
			String nextString = it.next();
			System.out.println(nextString);
		}
		System.out.println();



		int z = 5;
		
		ArrayList<Integer> digits = new ArrayList<Integer>();
		
		Integer int1 = (z * 32); 	// Boxing
		digits.add(++int1);  		// Unboxing
		int1 = digits.get(0);  		// Boxing
		boolean is33 = int1 == 33; 	// Unboxing


	}

}
