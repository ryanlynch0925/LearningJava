import javax.swing.JOptionPane;

public class StudentInfoApp {
    public static void main(String[] args) {
        // Create instances of StudentData and StudentSearcher
        StudentData data = new StudentData();
        StudentSearcher searcher = new StudentSearcher(data);

        while (true) {
            // Prompt the user for a student ID using a dialog box
            String input = JOptionPane.showInputDialog("Enter a four-digit student ID:");

            // Check if the user pressed cancel
            if (input == null) {
                break; // Exit the loop if canceled
            }

            int studentID = 0;
            boolean valid = false;

            // Input validation for student ID
            while (!valid) {
                try {
                    studentID = Integer.parseInt(input);
                    if (String.valueOf(studentID).length() == 4) {
                        valid = true; // Valid ID entered
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid four-digit ID.");
                        input = JOptionPane.showInputDialog("Enter a four-digit student ID:");
                        // Check if the user pressed cancel
                        if (input == null) {
                            return; // Exit if canceled
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric ID.");
                    input = JOptionPane.showInputDialog("Enter a four-digit student ID:");
                    // Check if the user pressed cancel
                    if (input == null) {
                        return; // Exit if canceled
                    }
                }
            }

            // Search for the student's name and GPA
            String name = searcher.searchStudentName(studentID);
            double gpa = searcher.searchStudentGPA(studentID);

            // Check if the student exists and display the appropriate message
            if (name != null) {
                JOptionPane.showMessageDialog(null, "Student Name: " + name + "\nGPA: " + gpa);
            } else {
                JOptionPane.showMessageDialog(null, "Error: Student ID " + studentID + " not found.");
            }

            // Ask the user if they want to search again
            int response = JOptionPane.showConfirmDialog(null, "Do you want to search for another ID?", 
                                                         "Continue?", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION) {
                break; // Exit the loop if the user does not want to continue
            }
        }

        JOptionPane.showMessageDialog(null, "Thank you for using the Student Information System!");
    }
}
