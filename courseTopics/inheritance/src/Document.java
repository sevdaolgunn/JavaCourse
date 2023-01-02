public class Document {
    private String[] authors;
    private Date date;

    public Document(String[] authors, Date date) {
        this.authors = authors;
        this.date = date;
    }


    public void addAuthor(String name){
        String[] authorArray = new String[this.authors.length+1];
        int i;
        for (i = 0; i<this.authors.length;i++){
            authorArray[i] = this.authors[i];
        }
        authorArray[i] = name;
        this.authors = authorArray;

    }
    public String[] getAuthors() {
        return authors;
    }

    public void getAuthor(){
        String ar[] = authors;
        for(String a: ar){
            System.out.println(a + " ");
        }

    }
    public Date getDate() {
        return date;
    }
}
