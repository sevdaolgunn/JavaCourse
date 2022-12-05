public class Car {
    int thisYear = 2022;
    int id;
    int productionYear;
    int power;
    static int counter;

    public Car(int id, int productionYear){
        this.id = id;
        this.productionYear = productionYear;
        counter++;
    }
    public void setPower(int power){
        this.power = power;

    }
    public int getProductionYear(){
        return productionYear;
    }

    public int getAge(){
        return thisYear-productionYear;
    }

    public String toString(){
        return "id : "+id+ "production year: "+productionYear+ "power:"+power;
    }
}