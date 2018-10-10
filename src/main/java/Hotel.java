import java.util.ArrayList;

public class Hotel {
    private ArrayList<SingleRoom> singleRooms;
    private ArrayList<DoubleRoom>doubleRooms;
    private ArrayList<RoomHire>roomHires;

    public Hotel(){
    singleRooms = new ArrayList<>();
    doubleRooms = new ArrayList<>();
    roomHires = new ArrayList<>();

    }

    public int numberSingleRooms() {
        return singleRooms.size();
    }

    public void addSingleRoom(SingleRoom singleRoom) {
       singleRooms.add(singleRoom);

    }
    public int numberDoubleRooms() {
        return doubleRooms.size();
    }

    public void addDoubleRoom(DoubleRoom doubleRoom) {
        doubleRooms.add(doubleRoom);

    }
}
