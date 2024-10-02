public class StudentSearcher {
    private StudentData studentData; // Instance of StudentData

    public StudentSearcher(StudentData studentData) {
        this.studentData = studentData; // Initialize with StudentData
    }

    // Method to search for a student's name by ID
    public String searchStudentName(int id) {
        return studentData.getStudentName(id); // Delegate the search to StudentData
    }

    // Method to search for a student's GPA by ID
    public double searchStudentGPA(int id) {
        return studentData.getStudentGPA(id); // Delegate the search to StudentData
    }
}
