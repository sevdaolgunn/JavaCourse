import java.util.Collection;
import java.util.Comparator;

public class SeatNumberComparator  implements Comparator<Ticket> {


    @Override
    public int compare(Ticket ticket1,Ticket ticket2) {
        return ticket1.seatNumber - ticket2.seatNumber;
    }
}
