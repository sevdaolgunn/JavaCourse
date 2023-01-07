public class SalariedEmployee extends Employee{
    int weeklySalary;
    
    public SalariedEmployee(String fistNme, String lastName, int SSN, int weeklySalary){
        super(fistNme,lastName,SSN);
        this.weeklySalary = weeklySalary;
    }

    @Override
    double earning() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "Weekly salary: " + this.weeklySalary;
    }
}
