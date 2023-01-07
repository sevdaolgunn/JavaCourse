public class BasePlusCommissionEmployee extends CommissionEmployee{
    int baseSalary;

    public  BasePlusCommissionEmployee(String firsName, String lastName, int SSN, int grossSales, int commissionRate, int baseSalary){
        super(firsName,lastName,SSN,grossSales,commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    double earning() {
        return (commissionRate * grossSales) + baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+ "base salary "+this.baseSalary;
    }
}
