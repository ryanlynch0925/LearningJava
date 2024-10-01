// PayrollSystemTest.java
// Employee hierarchy test program that demonstrates the use of 
// polymorphism in an employee management system. 
// Modified by David Ryan: 
// - Added Date objects for the birthdates of employees.
// - Created a Calendar instance to retrieve the current month.
// - Modified the loop to add $100 to earnings if it is the employee's birthday month.
// - Deleted the processing the employees individually

import java.util.Calendar;

public class PayrollSystemTest {      
    public static void main(String[] args) {  
        System.out.println("David Ryan Lynch - Payroll Modification Assignment");       
        // Create Date objects for birthdates
        Date salariedBirthdate = new Date(10, 24, 1996);
        Date hourlyBirthdate = new Date(5, 15, 1990);
        Date commissionBirthdate = new Date(3, 10, 1985);
        Date basePlusCommissionBirthdate = new Date(6, 30, 1992);

        // Create employee instances with birthdates
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", salariedBirthdate, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", hourlyBirthdate, 16.75, 40);  
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", commissionBirthdate, 10000, .06);                      
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", basePlusCommissionBirthdate, 5000, .04, 300);          

        // Create four-element Employee array
        Employee[] employees = new Employee[4];  

        // Initialize array with Employees          
        employees[0] = salariedEmployee;            
        employees[1] = hourlyEmployee;              
        employees[2] = commissionEmployee;          
        employees[3] = basePlusCommissionEmployee;  

        // Create a calendar instance
        Calendar currentCalendar = Calendar.getInstance();
        // Get current Month
        int currentMonth = currentCalendar.get(Calendar.MONTH) + 1;

        // Generically process each element in array employees
        for (Employee currentEmployee : employees) {
            // Create an earnings variable to store curret employee's earnings
            double earnings = currentEmployee.earnings();

            // Print Statement
            System.out.println(currentEmployee);
            // Check to see if current employee's birth month is equal to current month
            if (currentEmployee.getBirthdate().getMonth() == currentMonth) {
                // If so add the $100.00 birthday bonus
                earnings += 100.00; // Add the birthday bonus
            }
            // Print statement, amount earned
            System.out.printf(
                "earned $%,.2f%n%n", earnings);
        }                                               
    }
}
