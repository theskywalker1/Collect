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
		
		// Using a Set to find unique elements in a List... 
		
		ArrayList<Integer> before = new ArrayList<Integer>();
		before.add(5);
		before.add(1);
		Set<Integer> testing = new TreeSet<Integer>(before);
		
		System.out.println("Before adding: ");
		System.out.println(testing.toString());
		System.out.println();
		System.out.println("Iterates from 1 to 6, sees which values are currently in it.");
		for(Integer e = 0; e < 7; e++) {
			if(testing.contains(e))
				System.out.println("Contains " + e);
		}
		
		testing.add(2);
		testing.add(1);
		System.out.println("Tried adding 1 and 2: ");
		System.out.println(testing.toString());
		System.out.println("1 is already in there, so it doesn't add it again!");
		

		//Showing difference between hash map and tree map...
		
		Map<String, Integer> hash = new HashMap<String, Integer>();
		
		hash.put("AB", 1);
		hash.put("A", 2);
		hash.put("CD", 3);
		hash.put("C", 4);
		hash.put("E", 5);
		
		System.out.println("Printing hash Map... (it is unsorted)");
		System.out.println(hash.toString());
		
		Map<String, Integer> tree = new TreeMap<String, Integer>(hash);
		
		System.out.println("Printing out tree map... (note it is sorted)");
		System.out.println(tree.toString());
		
		// You should use tree map to guarantee the order of pairs. Hashmap is better when you only need random lookup.
	}

}
