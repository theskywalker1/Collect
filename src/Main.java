import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		/**
		 *  I'm going to answer 3 questions for class points today: 
		 * 
		 * 	Show how you would use Set to find the unique elements in a List.
		 *	Show an example of HashMap and a TreeMap, and explain the difference. 
		 *	Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
		 */
		
		ArrayList<Integer> before = new ArrayList<Integer>();
		before.add(5);
		before.add(1);
		Set<Integer> testing = new TreeSet<Integer>(before);
		
		System.out.println(testing.toString());
		
		for(Integer e = 0; e < 7; e++) {
			if(testing.contains(e))
				System.out.println("Contains " + e);
		}
		
		System.out.println(testing.toString());
		

	}

}
