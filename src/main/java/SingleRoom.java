import java.util.ArrayList;

public class SingleRoom {
    private int roomNumber;
    private ArrayList<Guest>guests;
    private int capacity;
    private int dailyRate;

    public SingleRoom(int roomNumber){
        this.roomNumber = roomNumber;
        this.capacity = 1;
        this.guests = new ArrayList<>();
        this.dailyRate = 5;

    }

    public int hasRoomNumber() {
        return roomNumber;
    }


    public int hasCapacity() {
        return capacity;
    }

    public int hasDailyRate() {
        return dailyRate;
    }

    public int numberOfGuests() {
        return guests.size();
    }

    public void checkIn(Guest guest){
        guests.add(guest);
    }

    public void checkOut(Guest guest) {
        guests.remove(guest);
    }
}
