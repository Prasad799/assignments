package myWork;

public class Stringmethods {
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        
	        // length() - Returns the length of the string
	        int length = str.length();
	        System.out.println("Length of the string: " + length);
	        
	        // charAt(index) - Returns the character at the specified index
	        char charAtIndex = str.charAt(0);
	        System.out.println("Character at index 0: " + charAtIndex);
	        
	        // indexOf(char) - Returns the first occurrence index of the specified character, -1 if not found
	        int indexOfO = str.indexOf('o');
	        System.out.println("Index of first 'o': " + indexOfO);
	        
	        // substring(startIndex) - Returns a new string that is a substring of the original, starting from the specified index
	        String substringFromIndex5 = str.substring(5);
	        System.out.println("Substring from index 5: " + substringFromIndex5);
	        
	        // substring(startIndex, endIndex) - Returns a new string that is a substring of the original, starting from startIndex and ending at endIndex-1
	        String substringFromIndexTo7 = str.substring(0, 7);
	        System.out.println("Substring from index 0 to 6: " + substringFromIndexTo7);
	        
	        // toUpperCase() - Converts the string to uppercase
	        String upperCaseStr = str.toUpperCase();
	        System.out.println("Uppercase string: " + upperCaseStr);
	        
	        // toLowerCase() - Converts the string to lowercase
	        String lowerCaseStr = str.toLowerCase();
	        System.out.println("Lowercase string: " + lowerCaseStr);
	        
	        // replace(oldChar, newChar) - Replaces all occurrences of oldChar with newChar
	        String replacedStr = str.replace('o', 'a');
	        System.out.println("String with 'o' replaced by 'a': " + replacedStr);
	        
	        // startsWith(prefix) - Checks if the string starts with the specified prefix
	        boolean startsWithHello = str.startsWith("Hello");
	        System.out.println("String starts with 'Hello': " + startsWithHello);
	        
	        // endsWith(suffix) - Checks if the string ends with the specified suffix
	        boolean endsWithWorld = str.endsWith("World!");
	        System.out.println("String ends with 'World!': " + endsWithWorld);
	        
	        // trim() - Removes leading and trailing whitespaces
	        String stringWithSpaces = "    This is a string with spaces.     ";
	        String trimmedStr = stringWithSpaces.trim();
	        System.out.println("Trimmed string: \"" + trimmedStr + "\"");
	    }
	}

