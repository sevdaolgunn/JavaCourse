public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public void displayInfo(){
        System.out.println("Name:" +name);
        System.out.println("Social Security Number:" +socialSecurityNumber);
    }
    float displaySalary(){
        return wage*workingHours;
    }
}
