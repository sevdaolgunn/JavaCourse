public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal duck = new Duck();
        Animal eagle = new Eagle();


        Animal[] animals = new Animal[] {cat,duck,eagle};

        System.out.println("******SWIMMING ANIMALS*****");

        for(Animal a: animals){
            if (a instanceof Swimmable){
                ((Swimmable)a).swim();
            }
        }

        System.out.println("******FLYING ANIMALS*****");

        for(Animal a: animals){
            if (a instanceof Flyable){
                ((Flyable)a).fly();
            }
        }

        System.out.println("******MOVING ANIMALS*****");

        for(Animal a: animals){
            if (a instanceof Moveable){
                ((Moveable)a).move();
            }
        }


    }
}