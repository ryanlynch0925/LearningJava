// This was copied from Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
// Fig 10.7

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    // constructor
    public CommissionEmployee(String firstName, String lastName, String SSN, Date birthdate, double grossSales, double commissionRate) {
        super(firstName, lastName, SSN, birthdate);

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                "Commission rate must be greater than 0.0 and less than 1.0");
        }

        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                "Gross sales must be greater than or eqaul to 0.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // set gross sales amount
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                "Gross sales must be greater than or eqaul to 0.0");
        }

        this.grossSales = grossSales;
    }

    // return gross sales amount
    public double getGrossSales() {return grossSales;}

    // set commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                "Commission rate must be greater than 0.0 and less than 1.0");
        }

        this.commissionRate = commissionRate;
    }

    // return commission rate
    public double getCommissionRate() {return commissionRate;}

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
            "Commission Employee", super.toString(),
            "Gross Sales", getGrossSales(),
            "Commission Rate", getCommissionRate());
    }
}
