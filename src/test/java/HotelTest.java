import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;
    Bedroom bedroom;
    RoomHire roomHire;
    Guest guest;

    @Before
    public void before(){

        hotel = new Hotel();
        bedroom = new Bedroom(1,1,5,"Single");
        roomHire = new RoomHire(3,"Meeting Room",15);
        guest = new Guest();
    }

    @Test
    public void numberSingleRooms(){
        assertEquals(0, hotel.numberSingleRooms());
    }

    @Test
    public void addSingleRoom(){
        hotel.addBedroom(bedroom);
        assertEquals(1,hotel.numberSingleRooms());
    }



    @Test
    public void numberOfRoomsForHire(){
        assertEquals(0, hotel.numberOfRoomsForHire());
    }

    @Test
    public void addRoomForHire(){
        hotel.addRoomForHire(roomHire);
        assertEquals(1,hotel.numberOfRoomsForHire());
    }

//    @Test
//    public void findVacantRooms(){
//    hotel.addRoomForHire(roomHire);
//    hotel.addBedroom(bedroom);
//
//    assertEquals(3, hotel.findVacantRooms());
//
//
//    }

}
