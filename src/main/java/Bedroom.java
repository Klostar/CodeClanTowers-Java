import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private ArrayList<Guest>guests;
    private int capacity;
    private int dailyRate;
    private Boolean booked;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, int dailyRate, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.dailyRate = dailyRate;
        this.booked = false;
        this.roomType = roomType;
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
