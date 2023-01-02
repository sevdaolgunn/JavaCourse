public class EMail extends Document {
    private String subject;
    private String[] to;

    public EMail(String[] authors, String subject, String[] to, Date date) {
        super(authors, date);
        this.subject = subject;
        this.to = to;
    }


    public String getSubject() {
        return subject;
    }

    public void  getTo() {
        String ar[] = to;
        for (String t : ar) {
            System.out.println(t);
        }



    }
}
