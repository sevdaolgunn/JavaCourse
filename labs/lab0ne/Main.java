import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Worker w1= new Worker();
       // w1.name= "sevda";
        //w1.workingHours=10;
        //w1.wage=55;
        //w1.socialSecurityNumber=1234;


        //w1.displayInfo();
        //System.out.println(w1.displaySalary());


        Scanner input = new Scanner(System.in);

        System.out.println("enter name: " );
        String name= input.nextLine();
        System.out.println("enter social security number: " );
        int socailSecurityNumber= input.nextInt();
        System.out.println("enter daily working hours: ");
        int workingHours= input.nextInt();
        System.out.println("enter wage: " );
        int wage= input.nextInt();

        Worker w2= new Worker();

        w2.name= name;
        w2.socialSecurityNumber=socailSecurityNumber;
        w2.workingHours=workingHours;
        w2.wage=wage;

        w2.displayInfo();
        System.out.println("Worker Salary:" +w2.displaySalary());













    }
}