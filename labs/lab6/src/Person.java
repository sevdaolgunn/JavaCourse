public class Person {
    String firstName;
    String lastName;
    int id;
    int age;


    Person(String firstName, String lastName, int age, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }
    Person(String firstName, String lastName){

        this(firstName,lastName,0,0);
        this.id++;
    }

    Person(int id){
        this.id = id;
    }

    Person (){
        this.id++;
    }

    public void getAll(){
        System.out.println(firstName + "  " + lastName + "  "+ id + "  "+ age);
    }



}
