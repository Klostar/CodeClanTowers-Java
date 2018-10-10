import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;
    Bedroom singleBed;
    Bedroom doubleBed;
    RoomHire roomHire;
    Guest guest;
    Booking booking;

    @Before
    public void before(){

        hotel = new Hotel();
        singleBed = new Bedroom(1,1,5,"Single");
        doubleBed = new Bedroom(2,2,10,"Double");
        roomHire = new RoomHire(3,"Meeting Room",15);
        guest = new Guest();



        hotel.addBedroom(singleBed);
        hotel.addBedroom(doubleBed);

        booking = hotel.bookRoom(singleBed,2);
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

    @Test
    public void countRooms(){
        assertEquals(2, hotel.numberOfBedrooms());
    }

    @Test
    public void numberOfVacantRooms(){
        assertEquals(1, hotel.numberOfVacantRooms());
    }

    @Test
    public void bookRoom(){
        assertEquals(true , singleBed.getBookingStatus());
    }



}
