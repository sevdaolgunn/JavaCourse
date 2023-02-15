public class MasterStudent extends Student implements ConferenceScoreBehaviour{
    int numberOfConf;
    public MasterStudent(int id, float mid, float fin,int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }

    @Override
    public double computeTotalScore() {
        return (float) (computeBaseScore()+conferenceScore());
    }


    @Override
    public float conferenceScore() {
        return numberOfConf*5;

    }
}
