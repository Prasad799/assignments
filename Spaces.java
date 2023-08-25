package myWork;
import java.util.Scanner;
public class Spaces {
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the input sentence from the user
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        // Count the number of spaces in the sentence
	        int spaceCount = 0;
	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);
	            if (ch == ' ') {
	                spaceCount++;
	            }
	        }

	        // Print the result
	        System.out.println("Number of spaces in the sentence: " + spaceCount);

	        // Close the scanner
	        scanner.close();
	    }
	}

