import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<RoomHire> roomHires;

    public Hotel() {
        bedrooms = new ArrayList<>();
        roomHires = new ArrayList<>();

    }

    public int numberSingleRooms() {
        return bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);

    }


    public int numberOfRoomsForHire() {
        return roomHires.size();
    }


    public void addRoomForHire(RoomHire roomHire) {
        roomHires.add(roomHire);
    }

    public int numberOfBedrooms() {
        return bedrooms.size();
    }

    public int numberOfVacantRooms() {
        int vacantRooms = 0;
        for( Bedroom bedroom : bedrooms){
            if( bedroom.getBookingStatus()== false){
                vacantRooms ++;
            }

        }
        return vacantRooms;
    }


    public Booking bookRoom(Bedroom singleBed, int daysBooked) {
        //create a booking
        //change the booked status to bedroom to true
      Booking booking = new Booking(singleBed,daysBooked);
      singleBed.changeStatus();

      return booking ;
    }
}