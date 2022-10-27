import java.util.Scanner;

public class Worker {
    String name;
    double salary;
    public static int counter = 0;

    Scanner input = new Scanner(System.in);

    Worker (String name, double salary){
        this.name = name;
        this.salary = salary;
        this.counter ++;
    }

    public void setName() {

        System.out.println("enter name: ");
        name = input.nextLine();
        this.name = name;
    }

    public void setSalary() throws IllegalArgumentException {
        System.out.println("enter salary: ");
        salary = input.nextInt();

        if (salary<0){
            String errorMessage = "Salary must be greater than 0";
            throw new IllegalArgumentException(errorMessage);
        }
        this.salary = salary;
    }
}
