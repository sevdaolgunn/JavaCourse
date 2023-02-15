public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("sevda", "olgun", 20, "student");
        Person p2 = new Person("selda", "kocamese", 30, "nurse");

        Car c1 = new Car( p1, "blue","2010" );


        c1.getOwner().showInfo();
        c1.changeOwner(p2);
        c1.getOwner().showInfo();

    }
}
