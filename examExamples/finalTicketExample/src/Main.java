import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new StandardTicket(10,1);
        Ticket t2 = new DiscountTicket(22, 2, 0.1);
        Ticket t3 = new DiscountTicket(12,3,0.2);
        Ticket t4 = new StandardTicket(35,4);

        List<Ticket> tickets = new ArrayList<Ticket>();

        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);

        List<Integer> seatNumbers = new ArrayList<>();
        for (Ticket t : tickets)
            seatNumbers.add(t.seatNumber);

        System.out.println(t1.computePrice());
        System.out.println(t2.computePrice());
        System.out.println(t4.computePrice());




        TicketSeller ts = new TicketSeller(tickets);

        ts.Sell(t1);
        ts.Sell(t2);
        ts.Sell(t3);
        ts.Sell(t4);

        System.out.println(ts.getIncomes());

        static void SortAndPrint(List<Ticket> tickets){
            SeatNumberComparator seatNumberComparator = new SeatNumberComparator();
            Collections.sort(tickets,seatNumberComparator);

            for(Ticket t:tickets)
                t.print();
        }
    }
}