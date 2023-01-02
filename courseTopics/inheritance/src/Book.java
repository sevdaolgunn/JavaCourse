public class Book extends Document{
    private String title;

    public Book(String title, String[] authors, Date date) {
        super(authors, date);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    void showInfo(){
        System.out.println("Title: "+this.title+" " +
                " Date:"+this.getDate());
        System.out.println("Author:"); getAuthor();
    }
}
