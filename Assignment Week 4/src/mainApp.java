import java.util.Scanner;
import java.util.Random;

public class mainApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select an option:");
            System.out.println("1. Check if a number is a multiple of another");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Calls the method for checkMultiples
                    checkMultiples(input);
                    break;
                case 2:
                    // Calls the method for calculateCircleArea
                    calculateCircleArea(input);
                    break;
                case 3:
                    // Calls the method for multiplicationQuiz
                    multiplicationQuiz(input);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        // Close the scanner when exiting the loop
        input.close();
    }

    // Method to check if two integers are mutliples of each other
    public static void checkMultiples(Scanner input) {
        // Ask user to choose first integer
        System.out.print("Enter first integer: ");
        // Assign next integer to variable
        int number1 = input.nextInt();
        // Ask user to choose second integer
        System.out.print("Enter second integer: ");
        // Assign next integer to variable
        int number2 = input.nextInt();
        
        // Check to see if first integer is equal to zero
        if (number1 == 0) {
            // If first integer is equal to zero then ask user to choose a non zero number
            System.out.println("Division by zero is undefined. Please enter a non-zero first integer.");
        // If first integer is not equal to zero then find the remainder of the 2 numbers, if remainder is zero then second integer is a multiple of first integer
        } else if (number2 % number1 == 0) {
            // Print the statement to the screen to let the user know
            System.out.printf("%d is a multiple of %d.%n", number2, number1);
        // If remainder of integers is not equal to zero then the second integer is not a multiple of first integer
        } else {
            // Print the statement to the screen to let the user know
            System.out.printf("%d is not a multiple of %d.%n", number2, number1);
        }
    }

    // Method to calculate the area of a circle by asking user the radius of the circle
    public static void calculateCircleArea(Scanner input) {
        // A = πr2
        // Ask user the radius of the circle
        System.out.print("Please enter radius of the circle: ");
        // Assign next double to variable
        double radius = input.nextDouble();
        // Calculate the area of the circle
        double area = Math.PI * radius * radius
        // Print the statement to the screen for user to see the area of the circle
        System.out.printf("The area of the circle with a radius of %.2f is %.2f.%n", radius, area);
    }

    // Method to quiz the user about multiplication problems.
    public static void multiplicationQuiz(Scanner input) {
        Random rand = new Random();
        int number1 = rand.nextInt(9) + 1;
        int number2 = rand.nextInt(9) + 1;

        System.out.printf("How much is %d times %d?%n", number1, number2);
        int userAnswer = input.nextInt();
        int correctAnswer = number1 * number2;

        if (userAnswer == correctAnswer) {
            System.out.println("Very good!");
        } else {
        System.out.printf("Sorry, the correct anser is %d.%n", correctAnswer);
        }
    }
}
