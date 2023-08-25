package myWork;
import java.util.Scanner;
public class VowelCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine().toLowerCase(); // Convert the input to lowercase for case-insensitivity

	        int vowelCount = 0;
	        StringBuilder vowelsFound = new StringBuilder();

	        for (int i = 0; i < inputString.length(); i++) {
	            char ch = inputString.charAt(i);
	            if (isVowel(ch)) {
	                vowelCount++;
	                if (vowelsFound.indexOf(String.valueOf(ch)) == -1) {
	                    vowelsFound.append(ch).append(" ");
	                }
	            }
	        }

	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Vowels found: " + vowelsFound.toString());
	        
	        scanner.close();
	    }

	    // Helper method to check if a character is a vowel
	    private static boolean isVowel(char ch) {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}
