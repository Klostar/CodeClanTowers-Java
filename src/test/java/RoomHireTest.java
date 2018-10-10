import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomHireTest {

    RoomHire roomHire;
    Guest guest;

    @Before
    public void before(){
        roomHire = new RoomHire(3, "Meeting Room",15);
        guest = new Guest();
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, roomHire.hasCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("Meeting Room", roomHire.hasType());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(15 , roomHire.hasDailyRate());
    }
}
