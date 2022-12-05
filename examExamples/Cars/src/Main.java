public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(1000,2020);
        Car c2 = new Car(2000,2001);
        Car c3 =new Car(3000,2012);
        Car c4 = new Car(4000,2011);

        Car[] cars = {c1,c2,c3,c4};

        Garage myGarage = new Garage(cars);
        myGarage.printCarsOlderThan(7);
        System.out.println(Car.counter);
    }
}