import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalTest {

    @Test
    void ticketTotalForKids() {
        assertEquals(500, 1000*.5);
    }

    @Test
    void ticketTotalForSeniors() {
        assertEquals(600, 1000*.6);
    }
}