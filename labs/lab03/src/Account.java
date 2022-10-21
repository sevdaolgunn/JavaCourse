import java.util.Scanner;

public class Account {

    double balance;
    String ownerName;

    Account (String name, double balance){
        this.ownerName= ownerName;
        this.balance= balance;
    }
    public void  getOwnerName() {

        System.out.println("name is: "+this.ownerName);

    }
    public double getBalance() {
        System.out.println("balance is: "+this.balance);
        return balance;
    }

    public void setOwnerName() {
        String newName;

        Scanner input = new Scanner(System.in);
        System.out.println("enter new name:");
        newName = input.nextLine();
        this.ownerName = newName;
        System.out.println("New name is: "+ this.ownerName);
    }

    public void withdraw() {
        String pas = "0987";
        String checkpas;
        int counter = 0;
        int trail;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 4-digit pass:");
        checkpas = input.nextLine();


        while (counter < 3) {

            if (pas.equals(checkpas)) {
                System.out.println("Succesfully");
                getBalance();
                add();
                break;

            } else if (!pas.equals(checkpas) && counter < 3) {
                System.out.println("Please try again");
                System.out.println("Please enter the 4-digit pass:");
                checkpas = input.nextLine();
                counter=counter+1;
                trail=2-counter;
                System.out.println("last "+trail+" trial");

            } else {
                System.out.println("Your account has been blocked, please try again later");
                break;
            }
        }
    }
    public void add(){
        double salary;
        double amount;
        String  y, n;
        String next;

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to add amount to your account?(y/n)");
        next = input.nextLine();


        if (next.equals("y")){
            System.out.println("Enter the amount you want to add to your account:");
            amount=input.nextInt();
            salary= amount+ balance;
            System.out.println("Amount in your account: "+salary);
        }
        else {
            getBalance();
        }
}}