import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleRoomTest {

    SingleRoom singleRoom;
    Guest guest;

    @Before
    public void before(){
        singleRoom = new SingleRoom(1);
        guest = new Guest();
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, singleRoom.hasRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, singleRoom.hasCapacity());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(5, singleRoom.hasDailyRate());
    }

    @Test
    public void numberOfGuests(){
        assertEquals(0, singleRoom.numberOfGuests());
    }

    @Test
    public void checkIn(){
        singleRoom.checkIn(guest);
        assertEquals(1 , singleRoom.numberOfGuests());
    }

    @Test
    public void checkOut(){
        singleRoom.checkIn(guest);
        assertEquals(1 , singleRoom.numberOfGuests());
        singleRoom.checkOut(guest);
        assertEquals(0, singleRoom.numberOfGuests());

    }
}
