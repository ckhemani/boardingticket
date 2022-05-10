import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTest {



    BoardingPass boardingPass;

    @BeforeEach
    void checkBefore(){
        boardingPass = new BoardingPass();
        System.out.println("Check Before Each");
    }

    @AfterEach
    void checkAfter(){
        System.out.println("Check After Each");
    }

    @Test
    void checkPrice() {
        assertEquals(1,1,"This is test");
    }

    @Test
    void getDateAndTime() {
    }


    @Test
    void generateETA() {
        Assertions.assertEquals(9, 9, 2, "\"ETA is: \")");
    }
}