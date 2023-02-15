public class Circle {

    private static double pi=3.141519;

    private double r;
    double area;

    Circle(double r){
        this.r = r;
    }
    public double computeArea(){
        area = pi*r*r;
        return area;
    }



}
