abstract public class Student {

    int id;
    float mid;
    float fin;

    public Student(int id,float mid,float fin) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }

    abstract public double computeTotalScore();
     public double computeBaseScore(){
         return mid*0.4 + fin*0.6;
     }

}
