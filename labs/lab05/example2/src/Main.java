public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);


        Circle[] circles = {circle1,circle2,circle3};
        for(Circle c : circles){
            System.out.println(c +" area " + c.computeArea());
        }

    }
}