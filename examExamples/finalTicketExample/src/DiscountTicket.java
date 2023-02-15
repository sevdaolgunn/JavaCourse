public class DiscountTicket extends StandardTicket{
    protected double discount;

    public DiscountTicket(int seatNumber, int number, double discount){
        super(seatNumber,number);
        this.discount = discount;
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public double computePrice() {
        return super.computePrice() - super.computePrice()*discount;
    }
}
