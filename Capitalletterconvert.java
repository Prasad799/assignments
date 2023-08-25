package myWork;
import java.util.Scanner;
public class Capitalletterconvert {
	    public static String capitalizeWords(String sentence) {
	        if (sentence == null || sentence.isEmpty()) {
	            return sentence;
	        }

	        StringBuilder result = new StringBuilder();
	        boolean capitalizeNext = true;

	        for (char ch : sentence.toCharArray()) {
	            if (Character.isWhitespace(ch)) {
	                capitalizeNext = true;
	            } else if (capitalizeNext) {
	                ch = Character.toUpperCase(ch);
	                capitalizeNext = false;
	            }

	            result.append(ch);
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String originalSentence = scanner.nextLine();
	        scanner.close();

	        String capitalizedSentence = capitalizeWords(originalSentence);
	        System.out.println("Capitalized sentence: " + capitalizedSentence);
	    }
	}


