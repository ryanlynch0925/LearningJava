/*
* <DateTest.java>
* This application tests the functionality of the Date class.
* It creates a Date object, allows the user to modify its month, 
* day, and year, and displays the updated date in the format  MM/DD/YYYY.
*/

//CSIS 212-<WEEK 6>
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        System.out.println("David Ryan Lynch - Date Class Assignment");
        // Create a Date object
        Date myDate = new Date(9, 28, 2024); // September 28, 2024

        // Display the date
        System.out.print("Initial date: ");
        myDate.displayDate();

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Modify the date
        System.out.print("Enter new Month (1 to 12): ");
        int newMonth = input.nextInt();

        while (newMonth < 1 || newMonth > 12) {
            System.out.print("Please enter a valid Month (1 to 12): ");
            newMonth = input.nextInt();
        }
        // Set the new month
        myDate.setMonth(newMonth); 

        System.out.print("Enter new Day (1 to 31): ");
        int newDay = input.nextInt();

        while (newDay < 1 || newDay > 31) {
            System.out.print("Please enter a valid Day (1 to 31): ");
            newDay = input.nextInt();
        }
        // Set the new day
        myDate.setDay(newDay); 

        System.out.print("Enter new Year (XXXX): ");
        int newYear = input.nextInt();
        // Set the new year
        myDate.setYear(newYear); 

        // Display the modified date
        System.out.print("Modified date: ");
        myDate.displayDate();

        // Close the scanner
        input.close();
    }
}
