public class Main {
    public static void main(String[] args) {

        Document document = new Document(new String[]{"Ahmet Ümit", "Ayşe Kulin"},
                new Date(8,"july",2022) );
        System.out.println(document.getAuthors());


        document.addAuthor("Sait Faik Abasıyanık");

        String array[] = document.getAuthors();

        for (String a : array){
            System.out.println(a);
        }

        Book book = new Book(new String[] {"Ali", "Ayşe"}, new Date(12,"June",2015),"Nefes Nefese");
        System.out.println(book.getTitle());
        book.getAuthor();



    }
}