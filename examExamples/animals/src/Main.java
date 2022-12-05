public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("papağan",AnimalTypes.BIRD);
        Animal animal2 = new Animal("köpek balığı",AnimalTypes.FISH);
        Animal animal3 = new Animal("ayı", AnimalTypes.MAMMAL);
        Animal animal4 = new Animal("yılan",AnimalTypes.REPTILE);

        Animal[] animals = {animal1,animal2,animal3,animal4};
        Zoo myZoo = new Zoo(animals);
        myZoo.printAnimals();

    }
}