public class Main {
    public static void main(String[] args) {
      //  Seasons seasons = Seasons.WINTER;
      //  System.out.println(seasons);
        //   Course course1 = Course.MATH1;
        //   System.out.println(course1);

        Course[] allCourse = Course.values();  //Bir enum türünün sahip olduğu bütün sabitleri görmek istersek.
        for (Course c : allCourse){
            System.out.println(c + "  given by  " + c.getLecturer());
        }

        //System.out.println(course1.getLecturer());
    }
}