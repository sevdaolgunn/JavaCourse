public class Date {
        int day;
        int month;
        int year;


        Date(int day,int month,int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public String toString(){
            return day + "/" + month + "/" + year;
        }
    }

