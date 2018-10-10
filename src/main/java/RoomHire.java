import java.util.ArrayList;

public class RoomHire {
    private int capacity;
    private String type;
    private int dailyRate;
    private ArrayList<Guest> guest;

    public RoomHire(int capacity, String type , int dailyRate){
        this.capacity = capacity;
        this.type = type;
        this.dailyRate = dailyRate;

    }


    public int hasCapacity() {
        return capacity;
    }

    public String hasType() {
        return type;
    }

    public int hasDailyRate() {
        return dailyRate;
    }


}
