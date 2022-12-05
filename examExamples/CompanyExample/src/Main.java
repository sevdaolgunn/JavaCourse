public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(21,"sevda", 1024.23);
        Employee e2 = new Employee(21,"kadir", 1024.23);

        Employee[] employees = new Employee[]{e1,e2};
        Company company = new Company(employees);

        company.printAllEmployeeName();
    }
}