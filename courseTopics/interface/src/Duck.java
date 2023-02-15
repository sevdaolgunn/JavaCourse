public class Duck extends Animal implements Flyable, Moveable, Swimmable{

    @Override
    public void fly(String name) {
        System.out.println("duck");
    }

    @Override
    public void move() {
        System.out.println("duck");
    }

    @Override
    public void swim() {
        System.out.println("duck");
    }
}
