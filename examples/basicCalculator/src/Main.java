import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int s1,s2,ans;
        String operation;
        System.out.println("Please enter first number:");
        s1 = scan.nextInt();
        System.out.println("Please enter second number:");
        s2 = scan.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation:");
        operation = op.nextLine();

        if (operation.equals("+")){
            ans = s1+s2;
            System.out.println("answer is: " +ans );

        }
        else if (operation.equals("-")){
            ans = s1-s2;
            System.out.println("answer is: "+ ans );

        }
        else if (operation.equals("*")){
            ans = s1*s2;
            System.out.println("answer is: " +ans );

        }
        else if (operation.equals("/")){
            ans = s1/s2;
            System.out.println("answer is: " +ans );
        }
        else {
            System.out.println("Illigal Operation");
        }

    }
}