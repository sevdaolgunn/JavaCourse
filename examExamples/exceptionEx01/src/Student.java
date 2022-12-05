public class Student {
    private int mid;
    private int fin;

    public Student(int mid, int fin){
        setMid(mid);
        setFin(fin);

    }
    public void setMid(int mid){
        if(mid<0 || mid>100){
            throw new IllegalArgumentException("mid cannot be less than 0 and greater than 100 ");
        }
        this.mid = mid;
    }
    public void setFin(int fin){
        if(fin<0 || fin>100){
            throw new IllegalArgumentException("fin cannot be less than 0 and greater than 100 ");
        }
        this.fin = fin;

    }

    public int getMid() {
        return mid;
    }

    public double getAvarge(){
        return mid*0.4 + fin*0.6;
    }

}
