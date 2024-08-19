import javax.swing.JOptionPane;

public class ProgramForChruchWebsite {

    public static void main(String[] args){

        // Displaying an input box to grab user input
        String userName = JOptionPane.showInputDialog(null, "Enter your User Name: ", "User Name", JOptionPane.QUESTION_MESSAGE);

        // Checking to see if user input or not
        if (userName != null && !userName.trim().isEmpty()) {
            // Display message with User Name
            JOptionPane.showMessageDialog(null, 
            "Welcome, " + userName + ", to the Grace for All Church Website\nThe Scripture for the day is: Matthew 6:11", 
            "Greeting", 
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Display "No name" message
            JOptionPane.showMessageDialog(null, "No name entered!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }
}