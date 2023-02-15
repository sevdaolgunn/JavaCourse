public class Main {
    public static void main(String[] args) {

        Animal a = new Duck();

       // a.swim();  not compile
       // a.fly;     not compile
        a.move();   // compile and run


        Flyable f = (Flyable)new Duck(); //compile but not run
        //f = new Duck();
        f.fly();
        f.kajked();

      //  f.fly();


    }
}