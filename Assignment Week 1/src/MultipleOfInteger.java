//<MultipleOfInteger.java> -- asks for 2 integers from user input, then uses the remainder operator to see if it returns 0, if so then the first number is a multiple of the second number
//CSIS 212-<WEEK 1>

import java.util.Scanner;

public class MultipleOfInteger {
    public static void main(String[] args) {
        // Class related print statement
        System.out.println(" David Ryan Lynch - Program 5");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        if (number2 == 0){
            System.out.println("Division by zero is undefined. Please enter a non-zero second integer.");
        } else if (number1 % number2 == 0){
            System.out.printf("%d is a multiple of %d.%n", number1, number2);
        } else {
            System.out.printf("%d is not a multiple of %d.%n", number1, number2);
        }
        input.close();
    }
}
