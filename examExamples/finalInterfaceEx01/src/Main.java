public class Main {
    public static void main(String[] args) {

        Student s1 = new BachelourStudent(10,50,90);
        Student s2 = new MasterStudent(10,50,90,5);
        Student s3 = new PhDStudent(10,50,90,2,1);

        System.out.println();

        System.out.println( ((ConferenceScoreBehaviour)s3).conferenceScore());
        //((ArticleScoreBehaviour)s2),articleScore();

        //s2.articleScore();

        //((ProjectScoreBehaviour)s3).projectScore();



    }
}