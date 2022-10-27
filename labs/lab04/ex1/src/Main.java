import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;

        Scanner integer = new Scanner(System.in);


        try {
            System.out.println("Please enter a value: ");
            a = integer.nextInt();

        }catch (InputMismatchException e){
            System.out.println("Error! Please enter integer value.");

        }
        finally {
            System.out.println("done!");
        }
    }
}