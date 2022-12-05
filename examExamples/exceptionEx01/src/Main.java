public class Main {
    public static void main(String[] args) {

        try{
            Student student1 = new Student(799,101);
            System.out.println(student1.getAvarge());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}