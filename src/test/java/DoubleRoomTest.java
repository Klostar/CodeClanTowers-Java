import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleRoomTest {

    DoubleRoom doubleRoom;
    Guest guest;

    @Before
    public void before(){
        doubleRoom = new DoubleRoom(1);
        guest = new Guest();
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, doubleRoom.hasRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, doubleRoom.hasCapacity());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(10, doubleRoom.hasDailyRate());
    }

    @Test
    public void numberOfGuests(){
        assertEquals(0, doubleRoom.numberOfGuests());
    }

    @Test
    public void checkIn(){
        doubleRoom.checkIn(guest);
        assertEquals(1 , doubleRoom.numberOfGuests());
    }

    @Test
    public void checkOut(){
        doubleRoom.checkIn(guest);
        assertEquals(1 , doubleRoom.numberOfGuests());
        doubleRoom.checkOut(guest);
        assertEquals(0, doubleRoom.numberOfGuests());

    }
}

