import java.util.Scanner;

public class Person {

    String firstname;
    String lastname;
    int age;
    String job;

    Person (String firstname, String lastname, int age, String job){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.job = job;
    }

    public void showInfo(){
        System.out.println("Firstname is: " +this.firstname);
        System.out.println("Lastname is: " +this.lastname);
        System.out.println("Age is: " +this.age);
        System.out.println("Job is: " +this.job);


    }

}
