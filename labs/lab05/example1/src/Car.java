public class Car {
    private Person owner;
    private String color;
    private String model;

    Car (Person owner, String color, String model){
        this.owner = owner;
        this.color = color;
        this.model = model;
    }

    public void changeOwner(Person p1){
        this.owner = p1;

    }

    public Person getOwner(){
        return owner;
    }

}
