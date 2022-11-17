public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Sevda", "OLGUN", 20, 1234);
        //person1.getAll();

        Person person2 = new Person("Sevda", "OLGUN");
       // person2.getAll();

        Person person3 = new Person(1234);
        // person3.getAll();

        Person person4 =new Person();
        //person4.getAll();


        Person[] persons = {person1,person2,person3,person4};
        for (Person p : persons)
            p.getAll();


    }
}