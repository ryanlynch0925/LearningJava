
# Java Programs Summary

## Description:
This README summarizes four Java programs that demonstrate various programming concepts, including input handling, arithmetic operations, conditional logic, and basic Java syntax. Each program has a specific purpose as outlined in the assignment.

---

## Program 1: Technology for Ministry
This program displays five different sentences explaining how technology is used to minister and serve others by winning souls to Christ. It utilizes basic `System.out.println` statements to output the sentences.

- **Key Concepts**: 
  - `System.out.println()` for printing multiple lines of text.
  
- **Example Output**:
  ```
  Social media helps churches share sermons and testimonies across the globe.
  Livestreams allow people to attend church from the comfort of their homes.
  Bible apps provide easy access to scripture, helping people grow in their faith.
  Online communities create spaces for believers and seekers to engage in discussions.
  Ministries use digital outreach to spread the message of hope and salvation.
  ```

---

## Program 2: Church Website Chat Feature
This program simulates a simple chat feature for a church's website. It uses `JOptionPane` to request the user's name and display a personalized welcome message along with the Scripture of the day. The program includes error handling to check if the user has entered a name.

- **Key Concepts**:
  - `JOptionPane.showInputDialog()` for user input.
  - `JOptionPane.showMessageDialog()` for displaying messages.
  - Conditional logic for checking empty input.

- **Example Output**:
  ```
  Enter your User Name: Bob
  [Message Box] Welcome, Bob, to the Grace for All Church Website!
              The Scripture for the day is: Matthew 6:11
  ```

---

## Program 3: Three Ways to Print
This program demonstrates three different techniques for printing the numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by a space. It uses `System.out.println`, `System.out.print`, and `System.out.printf` to achieve this.

- **Key Concepts**:
  - `System.out.println()` for printing all numbers in one statement.
  - `System.out.print()` for printing each number separately.
  - `System.out.printf()` for formatted output.

- **Example Output**:
  ```
  1 2 3 4
  1 2 3 4
  1 2 3 4
  ```

---

## Program 4: Simple Calculator
This program is a simple calculator that prompts the user to enter two integers and calculates their sum, difference, product, and quotient. It includes error handling to check for division by zero and displays an appropriate message if a division by zero is attempted.

- **Key Concepts**:
  - `Scanner` class for user input.
  - Arithmetic operations: addition, subtraction, multiplication, division.
  - Conditional logic for division by zero.

- **Example Output**:
  ```
  Enter first integer: 10
  Enter second integer: 5
  Sum is 15
  Difference is 5
  Product is 50
  Quotient is 2
  ```

  If division by zero is attempted:
  ```
  Enter first integer: 10
  Enter second integer: 0
  Cannot divide by zero!
  Sum is 10
  Difference is 10
  Product is 0
  ```

---

## General Notes:
- **Input Handling**: Programs 2 and 4 demonstrate user input handling using `JOptionPane` and `Scanner`.
- **Arithmetic Operations**: Program 4 showcases basic arithmetic operations and checks for common errors like division by zero.
- **Formatted Output**: Program 3 demonstrates multiple ways to print output, including formatted strings with `printf`.

## Requirements:
- **Java Version**: JDK 8 or higher is required to run the programs.
- **Libraries Used**: 
  - Programs 2 and 4 use the `javax.swing.JOptionPane` and `java.util.Scanner` libraries for input and output handling.

---

Each of these programs builds on basic Java programming concepts, demonstrating the use of input/output, conditional statements, error handling, and formatting techniques. Together, they provide a foundation for understanding Java syntax and structure in different contexts.
