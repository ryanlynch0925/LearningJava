import java.util.Scanner;

public class UserInteraction {
    private Scanner scanner;

    public UserInteraction() {
        scanner = new Scanner(System.in); // Initialize the Scanner for user input
    }

    // Method to prompt for a student ID
    public int promptForStudentID() {
        int studentID = 0;
        boolean valid = false;

        // Loop until a valid four-digit ID is entered
        while (!valid) {
            System.out.print("Enter a four-digit student ID: ");
            String input = scanner.nextLine();
            try {
                studentID = Integer.parseInt(input); // Convert input to an integer
                // Check if the ID is four digits
                if (String.valueOf(studentID).length() == 4) {
                    valid = true; // Valid input, exit loop
                } else {
                    displayError("Please enter a valid four-digit ID.");
                }
            } catch (NumberFormatException e) {
                displayError("Invalid input. Please enter a numeric ID.");
            }
        }

        return studentID; // Return the valid student ID
    }

    // Method to display student information
    public void displayStudentInfo(String name, double gpa) {
        System.out.println("Student Name: " + name);
        System.out.println("GPA: " + gpa);
    }

    // Method to display error messages
    public void displayError(String message) {
        System.out.println("Error: " + message);
    }
}
