public class Main {
    public static void main(String[] args) {
   //   Cat cat = new Animal();
        Animal a =new Cat();
   //    a.meow();
        ((Cat)a).meow();

        Object o = new Animal();
   //   o.eat();
        //   o.meow();
        ((Animal)o).eat();
    //  ((Animal)o).meow();
        ((Cat)o).eat();
        ((Cat)o).meow();

    }
}