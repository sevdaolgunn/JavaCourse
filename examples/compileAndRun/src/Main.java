public class Main {
    public static void main(String[] args) {
       // Cat cat = new Animal(); 	//??

        Animal a = new Cat();
       // a.meow(); 		//??
        ((Cat)a).meow(); 	//?? run and compile
        Object o = new Animal();
       // o.eat(); 		//??
        //o.meow(); 	 	//??
        ((Animal)o).eat(); 	//?? run and compile
        //((Animal)o).meow(); 	//??
      //  ((Cat)o).eat(); 	//??  (*) compile but not run
       // ((Cat)o).meuw(); 	//??

    }
}

class Cat extends Animal{
    int age;

    @Override
    void eat() {
        System.out.println("cat");;
    }

    void meow(){
        System.out.println("meow");
    }
}
