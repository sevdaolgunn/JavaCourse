import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvliTutar, kdvOrani;

        Scanner input = new Scanner(System.in);

        System.out.println("KDV oranını belirtiniz:");
        kdvOrani = input.nextDouble();

        System.out.println("Tutar giriniz:");
        tutar= input.nextDouble();

        kdvliTutar = tutar+ (tutar*kdvOrani);
        System.out.println("KDVli tutar: " +kdvliTutar);





    }
}