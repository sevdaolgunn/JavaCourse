public class Company {
    private Employee[] employees;

    Company(Employee[] employees){
        this.employees = employees;
    }

    public void printAllEmployeeName(){
        for (Employee e : employees){
            System.out.println("name: " +e.getName());
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }


}
