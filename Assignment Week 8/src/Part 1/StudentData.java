public class StudentData {
    // Arrays to hold student data
    private int[] studentIDs = {1001, 1002, 1003, 1004, 1005}; // Example IDs
    private String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Eva"}; // Example names
    private double[] gpas = {3.5, 3.8, 2.9, 3.0, 3.7}; // Example GPAs

    // Method to retrieve the student's name based on the ID
    public String getStudentName(int id) {
        for (int i = 0; i < studentIDs.length; i++) {
            if (studentIDs[i] == id) {
                return firstNames[i]; // Return the corresponding name
            }
        }
        return null; // Return null if not found
    }

    // Method to retrieve the student's GPA based on the ID
    public double getStudentGPA(int id) {
        for (int i = 0; i < studentIDs.length; i++) {
            if (studentIDs[i] == id) {
                return gpas[i]; // Return the corresponding GPA
            }
        }
        return -1; // Return -1 if not found (indicating an error)
    }
}

