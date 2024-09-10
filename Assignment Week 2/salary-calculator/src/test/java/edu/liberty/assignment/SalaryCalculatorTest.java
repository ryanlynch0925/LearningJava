package edu.liberty.assignment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SalaryCalculatorTest {

    // Test case: Negative hours worked
    @Test
    public void testNegativeHoursWorked() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 20.0;
        double hoursWorked = -5.0;
        double expectedGrossPay = 0.0;  // Negative hours should be treated as 0 hours
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("Negative hours worked should return 0 gross pay", expectedGrossPay, actualGrossPay, 0.001);
    }

    // Test case: Negative hourly rate
    @Test
    public void testNegativeHourlyRate() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = -15.0;
        double hoursWorked = 40.0;
        double expectedGrossPay = 0.0;  // Negative hourly rate should be treated as 0 rate
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("Negative hourly rate should return 0 gross pay", expectedGrossPay, actualGrossPay, 0.001);
    }

    // Test case: Extremely high hours worked
    @Test
    public void testExtremelyHighHoursWorked() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 25.0;
        double hoursWorked = 1000.0;
        double expectedGrossPay = 37000.0;  // 40*25 + 960*25*1.5
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        System.out.println("Expected Gross Pay: " + expectedGrossPay);
        System.out.println("Actual Gross Pay: " + actualGrossPay);
        
        assertEquals("Extremely high hours should be calculated correctly", expectedGrossPay, actualGrossPay, 0.001);
    }

    // Test case: Zero hours worked
    @Test
    public void testZeroHoursWorked() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 30.0;
        double hoursWorked = 0.0;
        double expectedGrossPay = 0.0;
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("Zero hours worked should return 0 gross pay", expectedGrossPay, actualGrossPay, 0.001);
    }

    // Test case: Zero hourly rate
    @Test
    public void testZeroHourlyRate() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 0.0;
        double hoursWorked = 40.0;
        double expectedGrossPay = 0.0;
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("Zero hourly rate should return 0 gross pay", expectedGrossPay, actualGrossPay, 0.001);
    }

    // Test case: Fractional hours worked
    @Test
    public void testFractionalHoursWorked() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 22.5;
        double hoursWorked = 38.5;
        double expectedGrossPay = 866.25;  // 38.5 * 22.5
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("Fractional hours should be calculated correctly", expectedGrossPay, actualGrossPay, 0.001);
    }

    // Test case: Fractional hourly rate
    @Test
    public void testFractionalHourlyRate() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 15.75;
        double hoursWorked = 45.0;
        double expectedGrossPay = 748.125;  // 40*15.75 + 5*15.75*1.5
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("Fractional hourly rate should be calculated correctly", expectedGrossPay, actualGrossPay, 0.001);
    }

    // Test case: Edge case with 40 hours worked (no overtime)
    @Test
    public void testExactFortyHoursWorked() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 18.0;
        double hoursWorked = 40.0;
        double expectedGrossPay = 720.0;  // 40 * 18
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("Exactly 40 hours should not include overtime", expectedGrossPay, actualGrossPay, 0.001);
    }

    // Test case: Edge case with 40.5 hours worked (minimal overtime)
    @Test
    public void testMinimalOvertime() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 18.0;
        double hoursWorked = 40.5;
        double expectedGrossPay = 733.5;  // 40*18 + 0.5*18*1.5
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("40.5 hours should calculate minimal overtime", expectedGrossPay, actualGrossPay, 0.001);
    }
    
    // Test case: No work done (hours and rate both zero)
    @Test
    public void testNoWorkDone() {
        SalaryCalculator calculator = new SalaryCalculator();
        double hourlyRate = 0.0;
        double hoursWorked = 0.0;
        double expectedGrossPay = 0.0;
        
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        
        assertEquals("No work done should return 0 gross pay", expectedGrossPay, actualGrossPay, 0.001);
    }
}
