import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTest {

    @BeforeEach
    void checkBefore(){
        System.out.println("Check Before Each");
    }

    @AfterEach
    void checkAfter(){
        System.out.println("Check After Each");
    }

    @Test
    void checkPrice() {
        assertEquals(6 ,6);
    }

    @Test
    void getDateAndTime() {
    }

    @Test
    void generateETA() {
    }

    @Test
    void generateBoardingPass() {
    }

}