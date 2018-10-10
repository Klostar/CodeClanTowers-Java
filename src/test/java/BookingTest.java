import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom singleBed;

    @Before
    public void before(){
        singleBed = new Bedroom(1,1,5,"Single");
        booking = new Booking(singleBed,2);
    }

    @Test
    public void hasNumberOfDaysBooked(){
        assertEquals(2, booking.hasNumberOfDaysBooked());
    }
    
}
