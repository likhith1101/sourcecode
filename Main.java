package tuplesandpairs;

import java.util.Arrays;
import java.util.Collection;

public class Main {
	    public static void main(String[] args) {
	        // Creating a Tuple
	        Tuple<Integer> tuple = new Tuple<>();

	        // Add elements
	        tuple.add(1);
	        tuple.add(2);
	        tuple.add(3);

	        // Add a collection of elements
	        Collection<Integer> collection = new java.util.ArrayList<>();
	        collection.add(4);
	        collection.add(5);
	        tuple.addAll(collection);

	        // Check size and isEmpty
	        System.out.println("Size: " + tuple.size());
	        System.out.println("Is Empty: " + tuple.isEmpty());

	        // Check contains
	        System.out.println("Contains 3: " + tuple.contains(3));
	        System.out.println("Contains 6: " + tuple.contains(6));

	        // Print elements using iterator
	        System.out.print("Elements: ");
	        for (Integer element : tuple) {
	            System.out.print(element + " ");
	        }
	        System.out.println();

	        // Remove elements
	        tuple.remove(2);
	        tuple.remove(5);

	        // Check size after removal
	        System.out.println("Size after removal: " + tuple.size());

	        // Clear the tuple
	        tuple.clear();

	        // Check size and isEmpty after clearing
	        System.out.println("Size after clearing: " + tuple.size());
	        System.out.println("Is Empty after clearing: " + tuple.isEmpty());
	        
	     // Creating a Pair
	        Pair<String> pair = null;
	        try {
	            pair = new Pair<>("Hello", "World");
	            System.out.println("Pair Size: " + pair.size());
	            System.out.println("First element of Pair: " + pair.getFirst());
	            System.out.println("Second element of Pair: " + pair.getSecond());

	            // Extra methods in Pair
	            pair.swap();
	            System.out.println("Swapped Pair: " + pair.getFirst() + ", " + pair.getSecond());

	            // Overriding methods in Pair
	            System.out.println("Pair is equal to another Pair: " + pair.equals(new Pair<>("Hello", "World")));

	            // Attempt to add an element to Pair (UnsupportedOperationException)
	            try {
	                pair.add("New Element");
	            } catch (UnsupportedOperationException e) {
	                System.out.println("Caught UnsupportedOperationException for adding to Pair: " + e.getMessage());
	            }

	            // Other methods in Pair
	            System.out.println("Pair contains 'Hello': " + pair.contains("Hello"));

	        } catch (UnsupportedOperationException e) {
	            System.out.println("Caught UnsupportedOperationException: " + e.getMessage());
	        }


	        
	    }
}

        
      
