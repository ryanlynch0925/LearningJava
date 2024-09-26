/*
* <RectangleTest.java>
* This application tests the functionality of the Rectangle class.
* It creates a Rectangle object, allows the user to modify its length 
* and width, and calculates the area and perimeter, displaying the results.
* User inputs are validated to ensure that length and width are within
* the range of 0.0 to 20.0.
*
*/

// CSIS 212 - <WEEK 6>
package Rectangle;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        System.out.println("David Ryan Lynch - Rectangle Class Assignment");
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(1, 1);

        while (true) {
            System.out.println("Menu:");
            System.out.println("------");
            System.out.println("1. Set Length");
            System.out.println("2. Set Width");
            System.out.println("3. Calculate Area");
            System.out.println("4. Calculate Perimeter");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter length (0.0-20.0): ");
                    float length = scanner.nextFloat();
                    try {
                        rectangle.setLength(length);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter width (0.0-20.0): ");
                    float width = scanner.nextFloat();
                    try {
                        rectangle.setWidth(width);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    rectangle.calculateArea();
                    break;
                case 4:
                    rectangle.calculatePerimeter();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
