public class Main {
    public static void main(String[] args) {

        Employee e1 = new CommissionEmployee("sevda","olgun",123,10000,2);
        Employee e2 = new SalariedEmployee("kadir","taban",345,2200);
        Employee e3 = new HourlyEmployee("selda","kocameşe",654,40,37);
        Employee e4 = new BasePlusCommissionEmployee("elif","akdağ",987,100000,1,7000);

        Employee[] employees = new Employee[]{e1,e2,e3,e4};

        for (Employee employee: employees)
            System.out.println(employee + "salary: "+ employee.earning());



    }
}

