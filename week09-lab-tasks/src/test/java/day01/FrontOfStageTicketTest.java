package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {

    FrontOfStageTicket frontOfStageTicket;

    @BeforeEach
    void setUp() {
        frontOfStageTicket = new FrontOfStageTicket(
            "The Band", LocalDateTime.of(2010, 10, 20, 20, 0), 2000, "AB12");
    }

    @Test
    void getCodeTest() {
        assertEquals("AB12", frontOfStageTicket.getCode());
    }

    @Test
    void entryTimeTest() {
        assertEquals(LocalTime.of(18, 0), frontOfStageTicket.entryTime());
    }
}