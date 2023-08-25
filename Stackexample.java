package myWork;
import java.util.Stack;
public class Stackexample {
	    public static void main(String[] args) {
	        // Creating a stack
	        Stack<Integer> stack = new Stack<>();

	        // Pushing elements onto the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);

	        // Displaying the stack
	        System.out.println("Stack: " + stack);

	        // Peeking at the top element (without removing)
	        int topElement = stack.peek();
	        System.out.println("Top Element: " + topElement);

	        // Popping elements from the stack
	        int poppedElement = stack.pop();
	        System.out.println("Popped Element: " + poppedElement);
	        System.out.println("Stack after popping: " + stack);

	        // Checking if the stack is empty
	        boolean isEmpty = stack.isEmpty();
	        System.out.println("Is Stack Empty: " + isEmpty);
	    }
	}

