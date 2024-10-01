// This was copied from Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
// Fig 10.5

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String firstName, String lastName, String SSN, Date birthdate, double weeklySalary) {
        super(firstName, lastName, SSN, birthdate);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("WeeklySalary must be greater than zero.");
        }

        this.weeklySalary = weeklySalary;
    }

    // set salary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("WeeklySalary must be greater than zero.");
        }

        this.weeklySalary = weeklySalary;
    }

    // return salary
    public double getWeeklySalary() {return weeklySalary;}

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {return getWeeklySalary();}

    // return String representation of SalariedEmployee object 
    @Override
    public String toString(){
        return String.format("Salaried Employee: %s%n%s: $%,.2f", 
            super.toString(), "Weekly Salary", getWeeklySalary());
    }
}
