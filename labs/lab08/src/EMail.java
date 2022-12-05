public class EMail extends Document {
    private String subject;
    private String[] to;

    EMail( String[] authors, Date date, String subject, String[] to ){
        super(authors,date);
        this.subject = subject;
        this.to = to;

    }

    public String getSubject(){
        return subject;
    }

    public String[] getTo() {
        String array[] = to;
        for (String t : array){
            System.out.println(t);
        }
        return to;
    }
}
