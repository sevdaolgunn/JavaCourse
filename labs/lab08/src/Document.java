public class Document {
    private String[] authors;
    private Date date;

    Document(String[] authors, Date date){
        this.authors = authors;
        this.date = date;
    }
    public String[] getAuthors(){

        return authors;
    }

    public void addAuthor(String name){
        String[] authorArray = new String[this.authors.length+1];

        int i;

        for (i=0; i<this.authors.length; i++){
            authorArray[i] = authors[i];
        }
        authorArray[i] = name;
        this.authors = authorArray;
    }

    public Date getDate() {
        return this.date;
    }

    public void getAuthor(){
        String array[] = authors;
        for (String a : array){
            System.out.println(a);
        }
    }




}
