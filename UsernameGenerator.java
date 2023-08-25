package myWork;
import java.util.Scanner;
public class UsernameGenerator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter their mobile number and email ID
	        System.out.print("Enter your mobile number: ");
	        String mobileNumber = scanner.nextLine();

	        System.out.print("Enter your email ID: ");
	        String emailId = scanner.nextLine();

	        // Process the input to create a username
	        String username = generateUsername(mobileNumber, emailId);

	        // Display the generated username
	        System.out.println("Generated Username: " + username);

	        scanner.close();
	    }

	    public static String generateUsername(String mobileNumber, String emailId) {
	        // Extract digits from the mobile number
	        String digitsOnly = mobileNumber.replaceAll("[^0-9]", "");

	        // Extract the username from the email ID (assuming the email ID is in the form of "username@example.com")
	        String[] parts = emailId.split("@");
	        String usernameFromEmail = parts[0];

	        // Combine the extracted information to generate the username
	        String username = digitsOnly + "_" + usernameFromEmail;

	        return username;
	    }
	}
