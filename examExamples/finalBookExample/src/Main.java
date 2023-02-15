import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Küçük Kadınlar",45);
        Book b2 = new Book("Körlük",35);
        Book b3 = new Book("Nefes Nefese",50);
        Book b4 = new Book("Kayıp Tanrılar Ülkesi",60);

        LinkedList books = new LinkedList();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        ListIterator iterator = books.listIterator();

        Collections.sort(books);

        while(iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("**************************");



        while(iterator.hasPrevious())
            System.out.println(iterator.previous());







    }
}