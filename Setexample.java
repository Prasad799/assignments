package myWork;
import java.util.HashSet;
import java.util.Set;
public class Setexample {
	    public static void main(String[] args) {
	        // Create a HashSet to store integers
	        Set<Integer> numbersSet = new HashSet<>();

	        // Add elements to the set
	        numbersSet.add(10);
	        numbersSet.add(5);
	        numbersSet.add(20);
	        numbersSet.add(15);
	        numbersSet.add(10); // Adding a duplicate element

	        // Print the set
	        System.out.println("Set elements: " + numbersSet);

	        // Check if the set contains a specific element
	        int elementToCheck = 5;
	        if (numbersSet.contains(elementToCheck)) {
	            System.out.println(elementToCheck + " is present in the set.");
	        } else {
	            System.out.println(elementToCheck + " is not present in the set.");
	        }

	        // Remove an element from the set
	        int elementToRemove = 20;
	        if (numbersSet.remove(elementToRemove)) {
	            System.out.println(elementToRemove + " was removed from the set.");
	        } else {
	            System.out.println(elementToRemove + " was not found in the set.");
	        }

	        // Print the updated set
	        System.out.println("Updated set elements: " + numbersSet);

	        // Iterate over the set using for-each loop
	        System.out.println("Iterating over the set:");
	        for (int num : numbersSet) {
	            System.out.println(num);
	        }

	        // Clear the set
	        numbersSet.clear();
	        System.out.println("Set cleared. Size: " + numbersSet.size());
	    }
	}


