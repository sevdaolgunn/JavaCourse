public class HourlyEmployee extends Employee{

   int hours;
   int wage;

    public HourlyEmployee(String firstName, String lastName, int SSN,int wage,int hours) {
        super(firstName, lastName, SSN);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    double earning() {

        if(hours <= 40)
            return wage*hours;

        else
            return 40 * wage + (hours - 40) * wage * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + "wage: "+ this.wage + "hours: "+this.hours;
    }
}
