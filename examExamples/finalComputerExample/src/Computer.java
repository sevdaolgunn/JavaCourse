public class Computer {
    static int counter;
    int year;
    String model;

    public Computer(int year, String model) {
        this.year = year;
        this.model = model;
        counter++;
    }

    @Override
    public String toString() {
        return model + year;
    }
}
