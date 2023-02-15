public  class BachelourStudent extends Student implements ProjectScoreBehaviour {

    public BachelourStudent(int id, float mid, float fin){
        super(id, mid, fin);
    }

    @Override
    public double computeTotalScore() {
        return computeBaseScore()+projectScore();
    }

    @Override
    public float projectScore() {
        return 20;
    }
}
