public class StandardTicket extends Ticket {
    protected double price ;

    public StandardTicket(int seatNumber, int number){
        super(seatNumber,number);
    }

    @Override
    public void print() {
        System.out.println();

    }

    @Override
    public double computePrice() {
        return 10;
    }
}
