public class Animal {
    String name;
    AnimalTypes type;


    public Animal(String name, AnimalTypes type){
        this.name = name;
        this.type = type;

    }

    public String toString() {
        return name +" "+ type;
    }
}
