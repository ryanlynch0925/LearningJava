// This was copied from Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
// Fig 10.8

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    //constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, Date birthdate, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, SSN, birthdate, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                "Base salary must be greate than 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                "Base salary must be greate than 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {return baseSalary;}

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", 
        "Base-salaried", super.toString(), "Base-salary", getBaseSalary());
    }
}
