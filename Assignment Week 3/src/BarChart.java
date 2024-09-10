import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        //Read in  5 integer inputs
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;

        // Counter to stop while loop from going on infinite loop
        int counter = 0;

        // Loop to get user inputs
        while (counter < 5) {
            // Print out instructions for user input
            System.out.print("Please enter a number between 1 and 30: ");
            // Save user input to variable
            int num = input.nextInt();
            // Ristrict the range of number able to be put in
            if (num >= 1 && num <= 30) {
                // Introduce a switch to help assign variables with user inputs
                switch (counter) {
                    case 0:
                        number1 = num;
                        break;
                    case 1:
                        number2 = num;
                        break;
                    case 2:
                        number3 = num;
                        break;
                    case 3:
                        number4 = num;
                        break;
                    case 4:
                        number5 = num;
                        break;
                }
                counter++;
            // If number is not between 1 and 30, then user is asked to input a different number.
            } else {
                System.out.println("Input is not between 1 and 30, please enter a new number.");
            }
        }

        // Print Bar Chart
        System.out.println("Bar Chart:");

        // Print *s for each number, will be nice to put this into a mehtod :(
        for (int i = 0; i < number1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < number2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < number3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < number4; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < number1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}