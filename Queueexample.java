package myWork;
import java.util.LinkedList;
import java.util.Queue;
public class Queueexample {
	  public static void main(String[] args) {
	        // Creating a queue
	        Queue<String> queue = new LinkedList<>();

	        // Enqueuing elements into the queue
	        queue.offer("First");
	        queue.offer("Second");
	        queue.offer("Third");

	        // Displaying the queue
	        System.out.println("Queue: " + queue);

	        // Dequeuing elements from the queue
	        String dequeuedElement = queue.poll();
	        System.out.println("Dequeued Element: " + dequeuedElement);
	        System.out.println("Queue after dequeue: " + queue);

	        // Peeking at the front element (without removing)
	        String frontElement = queue.peek();
	        System.out.println("Front Element: " + frontElement);

	        // Checking if the queue is empty
	        boolean isEmpty = queue.isEmpty();
	        System.out.println("Is Queue Empty: " + isEmpty);
	    }
	}


