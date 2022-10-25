public class Main {
    public static void main(String[] args) {

        int [] arr = new int[9];
        int a;

        try {
           a=10/0;

        }
        catch (Exception e){
            System.out.println("0'a bölünme hatası!!");
            System.out.println(e.getMessage());
        }
        try {
            arr[10] = 20;
        }

        catch (Exception e){
            System.out.println("Array boyut hatası!!");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("PROGRAM BİTTİ!!");
        }
    }
}