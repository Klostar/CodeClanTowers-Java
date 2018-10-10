import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;
    SingleRoom singleRoom;
    DoubleRoom doubleRoom;
    RoomHire roomHire;
    Guest guest;

    @Before
    public void before(){

        hotel = new Hotel();
        singleRoom = new SingleRoom(1);
        doubleRoom = new DoubleRoom(2);
        roomHire = new RoomHire(3,"Meeting Room",15);
        guest = new Guest();
    }
    
    @Test
    public void numberSingleRooms(){
        assertEquals(0, hotel.numberSingleRooms());
    }

}
