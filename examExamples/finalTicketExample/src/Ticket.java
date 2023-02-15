abstract public class Ticket {
    public int number;
    protected int seatNumber;

    public Ticket(int seatNumber, int number){
        this.seatNumber = seatNumber;
        this.number = number;
    }

    abstract public void print();
    abstract public double computePrice();
}
