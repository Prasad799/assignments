package myWork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class CollectionsExample {
	    public static void main(String[] args) {
	        // Creating an ArrayList to store strings
	        ArrayList<String> namesList = new ArrayList<>();
	        namesList.add("Alice");
	        namesList.add("Bob");
	        namesList.add("Charlie");

	        System.out.println("Names List:");
	        for (String name : namesList) {
	            System.out.println(name);
	        }

	        // Creating a HashMap to store key-value pairs
	        HashMap<Integer, String> studentMap = new HashMap<>();
	        studentMap.put(101, "John");
	        studentMap.put(102, "Emily");
	        studentMap.put(103, "Michael");

	        System.out.println("\nStudent Map:");
	        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	    }
	}

