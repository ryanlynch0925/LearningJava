package edu.liberty.assignment;
//<SalaryCalculator.java> -- asks for 2 doubles, for each employee, then calculates salary. handles overtime, zero balance, etc.
//CSIS 212-<WEEK 2>
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Class related print statement
        System.out.println("David Ryan Lynch - Salary Calculator");
        // Prints out welcome message
        System.out.println("Let's Calculate the Gross Pay for 3 Employees!!!");
        // Declares new scanner
        Scanner input = new Scanner(System.in);

        // Initializes SalaryCalculator instance
        SalaryCalculator calculator = new SalaryCalculator();

        //Declares i for while loop
        int i = 1;
        // While loop with a condition that returns false after 3 loops
        while (i <= 3) {
            // Asks for employee hourly rate
            System.out.print("Enter hourly rate for employee " + i + ": ");
            // Declares hourlyRate variable and takes the input of user
            double hourlyRate = input.nextDouble();
            // Asks for employee hours worked
            System.out.print("Enter hours worked for employee " + i + ": ");
            // Declares hoursWorked variable and takes the input of user
            double hoursWorked = input.nextDouble();

            // Declares grossPay variable, then calls on the method calculateGrossPay passing 2 parameters(hoursWorked, hourlyRate)
            double grossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
            // Prints out statement with formated pay in currency format, nice to see format is similar to Python :)
            System.out.printf("Pay for employee %d is: $%,.2f%n", i, grossPay);
            // Steps the counter by 1
            i++;
        }
        // Close the input scanner
        input.close();
    }
    // Method to calculate gross pay, takes 2 parameters(hoursWorked, hourlyRate)
    public double calculateGrossPay(double hoursWorked, double hourlyRate) {
        // Checks to see if hourlyRate and hoursWorked are greater than or equal to 0
        if (hourlyRate >= 0 & hoursWorked >= 0){
            // Checks to see if hoursWorked are less than or equal to 40
            if (hoursWorked <= 40.0){
                // Calculates grossPay by multiplying hourlyRate by hoursWorked
                double grossPay = hourlyRate * hoursWorked;
                // Returns grossPay value
                return grossPay;
            // hoursWorked is greater than 40
            } else {
                // Calculates hoursWork over 40 in overtimePay
                double overtimePay = (hoursWorked - 40) * hourlyRate * 1.5;
                // Calculates regular pay plus the overtimePay
                return (40 * hourlyRate + overtimePay);
            }
        // Checks for all other cases such as, 0 hoursWorked, 0 hourlyRate, Negative values for each
        } else {
            // returns 0
            return 0;
        }
    }
}