public class Main {
    public static void main(String[] args) {
        Document document = new Document(new String[] {"sevda","selda"},
                new Date(8,01,2022));
        //System.out.println(document.getAuthors()); //address
        document.addAuthor("seda");

        String ar[] = document.getAuthors();
        for (String a: ar){
            System.out.println(a);
        }

        EMail eMail = new EMail(new String[] {"ali", "hasan"},"teknik bir hata meydana geldi",
                new String[] {"Karabuk University"},new Date(12,12,2022));
        System.out.println(eMail.getSubject());
        eMail.getTo();


        Book book = new Book("Kayıp Tanrılar Ülkesi",new String[] {"Ahmet Ümit"},
                new Date(11,11,2011));
        book.getTitle();
        book.showInfo();

    }
}