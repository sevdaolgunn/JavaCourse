public class Animal {
    String name;
    int id;

    public Animal(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name+ " " + this.id;
    }
}
