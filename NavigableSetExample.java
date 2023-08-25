package myWork;
	import java.util.NavigableSet;
	import java.util.TreeSet;
	public class NavigableSetExample {
	    public static void main(String[] args) {
	        // Create a navigable set using a TreeSet
	        NavigableSet<Integer> navigableSet = new TreeSet<>();

	        // Add elements to the navigable set
	        navigableSet.add(5);
	        navigableSet.add(2);
	        navigableSet.add(8);
	        navigableSet.add(1);
	        navigableSet.add(10);

	        System.out.println("Navigable Set: " + navigableSet);

	        // Use navigation methods
	        System.out.println("First element: " + navigableSet.first());
	        System.out.println("Last element: " + navigableSet.last());
	        System.out.println("Lower (less than) 6: " + navigableSet.lower(6));
	        System.out.println("Higher (greater than) 3: " + navigableSet.higher(3));

	        // Iterate in ascending order
	        System.out.println("Ascending order:");
	        for (Integer element : navigableSet) {
	            System.out.print(element + " ");
	        }

	        // Iterate in descending order
	        System.out.println("\nDescending order:");
	        for (Integer element : navigableSet.descendingSet()) {
	            System.out.print(element + " ");
	        }
	    }
	}

