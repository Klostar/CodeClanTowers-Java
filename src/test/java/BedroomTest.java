import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1,1,5,"Single");
        guest = new Guest();
    }

    @Test
    public void hasRoomType(){
        assertEquals("Single", bedroom.hasRoomType());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.hasRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.hasCapacity());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(5, bedroom.hasDailyRate());
    }

    @Test
    public void numberOfGuests(){
        assertEquals(0, bedroom.numberOfGuests());
    }

    @Test
    public void checkIn(){
        bedroom.checkIn(guest);
        assertEquals(1 , bedroom.numberOfGuests());
    }

    @Test
    public void checkOut(){
        bedroom.checkIn(guest);
        assertEquals(1 , bedroom.numberOfGuests());
        bedroom.checkOut(guest);
        assertEquals(0, bedroom.numberOfGuests());

    }

    @Test
    public void getBookingStatus(){
        assertEquals(false , bedroom.getBookingStatus());
    }

    @Test
    public void changeStatus(){
        assertEquals(true, bedroom.changeStatus());
    }
}
