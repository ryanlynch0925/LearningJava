import java.util.Scanner;

public class MultipleOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        if (number2 ==0){
            System.out.println("Division by zero is undefined. Please enter a non-zero second integer.");
        } else if (number1 % number2 == 0){
            System.out.printf("%d is a multiple of %d.%n", number1, number2);
        } else {
            System.out.printf("%d is not a multiple of %d.%n", number1, number2);
        }
        input.close();
    }
}
