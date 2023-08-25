package myWork;
import java.util.Vector;
import java.util.Enumeration;
public class Vectorexample {
	
	    public static void main(String[] args) {
	        // Creating a vector
	        Vector<String> vector = new Vector<>();

	        // Adding elements to the vector
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Orange");

	        // Displaying the vector
	        System.out.println("Vector: " + vector);

	        // Accessing elements using indexes
	        String firstElement = vector.get(0);
	        System.out.println("First Element: " + firstElement);

	        // Checking the size of the vector
	        int size = vector.size();
	        System.out.println("Vector Size: " + size);

	        // Iterating through the vector using Enumeration
	        System.out.print("Iterating using Enumeration: ");
	        Enumeration<String> enumeration = vector.elements();
	        while (enumeration.hasMoreElements()) {
	            System.out.print(enumeration.nextElement() + " ");
	        }
	        System.out.println();

	        // Removing an element from the vector
	        vector.remove(1);
	        System.out.println("Vector after removal: " + vector);

	        // Checking if the vector contains a certain element
	        boolean containsBanana = vector.contains("Banana");
	        System.out.println("Contains Banana: " + containsBanana);

	        // Clearing the vector
	        vector.clear();
	        System.out.println("Vector after clearing: " + vector);

	        // Checking if the vector is empty
	        boolean isEmpty = vector.isEmpty();
	        System.out.println("Is Vector Empty: " + isEmpty);
	    }
	}


