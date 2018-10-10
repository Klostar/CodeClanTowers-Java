import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;
    Bedroom singleBed;
    Bedroom doubleBed;
    RoomHire roomHire;
    Guest guest;

    @Before
    public void before(){

        hotel = new Hotel();
        singleBed = new Bedroom(1,1,5,"Single");
        doubleBed = new Bedroom(2,2,10,"Double");
        roomHire = new RoomHire(3,"Meeting Room",15);
        guest = new Guest();

        hotel.addBedroom(singleBed);
        hotel.addBedroom(doubleBed);
    }

    @Test
    public void numberSingleRooms(){
        assertEquals(0, hotel.numberSingleRooms());
    }

//    @Test
//    public void addBedRoom(){
//        hotel.addBedroom(singleBed);
//        assertEquals(1,hotel.numberSingleRooms());
//    }

    @Test
    public void numberOfRoomsForHire(){
        assertEquals(0, hotel.numberOfRoomsForHire());
    }

    @Test
    public void addRoomForHire(){
        hotel.addRoomForHire(roomHire);
        assertEquals(1,hotel.numberOfRoomsForHire());
    }

    @Test
    public void countRooms(){
        assertEquals(2, hotel.numberOfBedrooms());
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
