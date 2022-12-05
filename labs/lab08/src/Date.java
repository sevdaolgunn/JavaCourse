public class Date {
    int day;
    String month;
    int year;

    Date(int day,String month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void getDate() {
        System.out.println(day+
                " " + month + " " + year);
    }
}
