package myWork;

public class StringMethodsDemo {
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        String anotherStr = "Hello, World!";
	        String upperCaseStr = "HELLO, WORLD!";
	        String lowerCaseStr = "hello, world!";
	        String emptyStr = "";
	        String trimmedStr = "   Hello, World!   ";
	        String replaceStr = "Hello, Java!";
	        String[] splitStr = "one,two,three,four,five".split(",");

	        // String length()
	        System.out.println("String length: " + str.length());

	        // String charAt(int index)
	        System.out.println("Character at index 4: " + str.charAt(4));

	        // String equals(String anotherString)
	        System.out.println("str equals anotherStr: " + str.equals(anotherStr));

	        // String equalsIgnoreCase(String anotherString)
	        System.out.println("str equalsIgnoreCase upperCaseStr: " + str.equalsIgnoreCase(upperCaseStr));

	        // String isEmpty()
	        System.out.println("emptyStr is empty: " + emptyStr.isEmpty());

	        // String startsWith(String prefix)
	        System.out.println("str starts with 'Hello': " + str.startsWith("Hello"));

	        // String endsWith(String suffix)
	        System.out.println("str ends with 'World!': " + str.endsWith("World!"));

	        // String substring(int beginIndex)
	        System.out.println("Substring from index 4: " + str.substring(4));

	        // String substring(int beginIndex, int endIndex)
	        System.out.println("Substring from index 4 to 9: " + str.substring(4, 9));

	        // String indexOf(int ch)
	        System.out.println("Index of 'o': " + str.indexOf('o'));

	        // String lastIndexOf(int ch)
	        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

	        // String toUpperCase()
	        System.out.println("Uppercase str: " + str.toUpperCase());

	        // String toLowerCase()
	        System.out.println("Lowercase str: " + str.toLowerCase());

	        // String trim()
	        System.out.println("Trimmed str: " + trimmedStr.trim());

	        // String replace(char oldChar, char newChar)
	        System.out.println("Replaced 'W' with 'J': " + replaceStr.replace('W', 'J'));

	        // String[] split(String regex)
	        System.out.println("Split string: ");
	        for (String s : splitStr) {
	            System.out.println(s);
	        }
	    }

}
