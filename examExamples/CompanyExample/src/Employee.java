public class Employee {
    private static String companyName;
    private double salary;
    private String name;
    private int id;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getCompanyName(){
        return companyName;
    }

    public String getName(){
        return String.format("%s",name).toString();
    }
}
