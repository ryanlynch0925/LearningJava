// This was copied from Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
// Fig 10.4

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String SSN;
    private Date birthdate;

    public Employee(String firstName, String lastName, String SSN, Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.birthdate = birthdate;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSSN() {return SSN;}
    public Date getBirthdate() {return birthdate;}

    @Override
    public String toString() {
        return String.format("%s %s%nSSN: %s", getFirstName(), getLastName(), getSSN());
    }

    public abstract double earnings();
}
