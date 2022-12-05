public class Book extends Document{
    private String title;

    Book(String[] authors, Date date, String title){
        super(authors,date);
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}
