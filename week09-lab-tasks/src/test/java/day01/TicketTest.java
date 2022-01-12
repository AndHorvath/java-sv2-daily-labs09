package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    Ticket ticket;

    @BeforeEach
    void setUp() {
        ticket =
            new Ticket("The Band", LocalDateTime.of(2010, 10, 20, 20, 0), 1000);
    }

    @Test
    void getBandTest() {
        assertEquals("The Band", ticket.getBand());
    }

    @Test
    void getDateTimeTest() {
        assertEquals(LocalDateTime.of(2010, 10, 20, 20, 0), ticket.getDateTime());
    }

    @Test
    void getPriceTest() {
        assertEquals(1000, ticket.getPrice());
    }

    @Test
    void entryTimeTest() {
        assertEquals(LocalTime.of(19, 0), ticket.entryTime());
    }
}