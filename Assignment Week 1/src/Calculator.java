import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        // Gather integers from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        // Perform operations
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = 0;

        // Checking to see if Division by 0
        if (number2 != 0){
            quotient = number1 / number2;
        } else {
            System.out.println("Cannot dive by zero!");
        }
        
        // Printing the results to the screen
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Product is %d%n", product);
        if (number2 != 0) {
            System.out.printf("Quotient is %d%n", quotient);
        }
        
        // Close scanner from above
        input.close();
    }
}
