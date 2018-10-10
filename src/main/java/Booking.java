public class Booking {
    private int daysBooked;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int daysBooked){
        this.bedroom = bedroom;
        this.daysBooked = daysBooked;

    }

    public int hasNumberOfDaysBooked() {
        return daysBooked;
    }

    public int roomBill() {
        return daysBooked * bedroom.hasDailyRate();
    }
}
