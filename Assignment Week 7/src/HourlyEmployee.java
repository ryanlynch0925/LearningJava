// This was copied from Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
// Fig 10.6

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    // constructor
    public HourlyEmployee(String firstName, String lastName, String SSN, Date birthdate, double wage, double hours) {
        super(firstName, lastName, SSN, birthdate);

        if (wage < 0.0){
            throw new IllegalArgumentException("Hourly wage must be greater than or equal to zero.");
        }

        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("Hours must be greater than or equal to 0.0 and less than or equal to 168.0.");
        }

        this.wage = wage;
        this.hours = hours;
    }

    //set wage
    public void setWage(double wages) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be greater than or equal to zero.");
        }

        this.wage = wage;
    }

    // return wage
    public double getWage() {return wage;}

    // set hours worked
    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("Hours must be greater than or equal to 0.0 and less than or equal to 168.0.");
        }

        this.hours = hours;
    }

    // return hours worked
    public double getHours() {return hours;}

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        if(getHours() <=40){
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%n%s: $%,.2f; %s: %,.2f", 
            super.toString(), "Hourly Wage", getWage(), "Hours Worked", getHours());
    }

}
