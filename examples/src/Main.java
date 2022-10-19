
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                String name;
                int quiz, mid, fin;
                double avarge;

                Scanner input = new Scanner(System.in);


                System.out.println("enter student name:");
                name = input.nextLine();

                System.out.println("Enter quiz grade:");
                quiz = input.nextInt();

                System.out.println("Enter midterm grade: ");
                mid = input.nextInt();

                System.out.println("Enter final grade: ");
                fin = input.nextInt();

                avarge = quiz*.15+mid*.3+fin*.55;

                System.out.println("Avarge: " +avarge);
            }





        }
