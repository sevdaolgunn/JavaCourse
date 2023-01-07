public class CommissionEmployee extends Employee{

    int grossSales;
    int commissionRate;


    public CommissionEmployee(String firstName, String lastName, int SSN,int grossSales,int commissionRate) {
        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    double earning() {
        
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return super.toString()+ "gross sale: "+this.grossSales + "commission rate: "+ this.commissionRate;
    }
}
