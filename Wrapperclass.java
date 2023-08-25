package myWork;

public class Wrapperclass {
	    public static void main(String[] args) {
	        // Creating wrapper objects
	        Integer intValue = Integer.valueOf(42); // Integer wrapper for int
	        Double doubleValue = Double.valueOf(3.14); // Double wrapper for double
	        Character charValue = Character.valueOf('A'); // Character wrapper for char
	        Boolean boolValue = Boolean.valueOf(true); // Boolean wrapper for boolean

	        // Autoboxing (implicit conversion from primitive to wrapper)
	        int intPrimitive = 123;
	        Integer boxedInt = intPrimitive;

	        // Unboxing (implicit conversion from wrapper to primitive)
	        Double doubleWrapper = Double.valueOf(2.71);
	        double doublePrimitive = doubleWrapper;

	        // Using methods of wrapper classes
	        System.out.println("intValue: " + intValue);
	        System.out.println("doubleValue: " + doubleValue);
	        System.out.println("charValue: " + charValue);
	        System.out.println("boolValue: " + boolValue);

	        System.out.println("boxedInt: " + boxedInt);
	        System.out.println("doublePrimitive: " + doublePrimitive);

	        // Converting from String to wrapper class
	        String numberStr = "9876";
	        int parsedInt = Integer.parseInt(numberStr);
	        System.out.println("parsedInt: " + parsedInt);

	        // Converting from wrapper class to String
	        String doubleStr = Double.toString(5.25);
	        System.out.println("doubleStr: " + doubleStr);
	    }
	}

