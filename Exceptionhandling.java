package myWork;
import java.util.Scanner;
public class Exceptionhandling {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter a number: ");
	            int num = scanner.nextInt();
	            
	            if (num == 0) {
	                throw new IllegalArgumentException("Number cannot be zero.");
	            }
	            
	            int result = 10 / num;
	            System.out.println("Result: " + result);
	        } catch (java.util.InputMismatchException ex) {
	            System.out.println("Invalid input. Please enter a valid number.");
	        } catch (ArithmeticException ex) {
	            System.out.println("Error: Division by zero.");
	        } catch (IllegalArgumentException ex) {
	            System.out.println("Error: " + ex.getMessage());
	        } finally {
	            System.out.println("This block always executes, regardless of exceptions.");
	        }
	        
	        System.out.println("Program completed.");
	    }
	}

