public class Book implements Comparable<Book> {
    String name;
    double price;

    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalPrice(){
        return price+ 0.08 * price;
    }

    public int compareTo(Book book) {
        return (int) (price - book.price);

    }

    @Override
    public String toString() {
        return name+" "+ this.price;
    }
}
