public class Duck extends Animal implements Swimmable,Flyable{

    @Override
    public void move() {
        System.out.println("duck moves");
    }

    @Override
    public void swim() {
        System.out.println("duck swims");
    }

    @Override
    public void fly() {
        System.out.println("duck fly");
    }

    @Override
    public void kajked() {
        System.out.println("fjjve");

    }
}
