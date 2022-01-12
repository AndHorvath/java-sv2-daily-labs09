package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person personA;
    Person personB;

    Ticket ticketA;
    Ticket ticketB;
    String band;
    LocalDateTime dateTime;

    @BeforeEach
    void setUp() {
        band = "The Band";
        dateTime = LocalDateTime.of(2010, 10, 20, 20, 0);
        ticketA = new Ticket(band, dateTime, 1000);
        ticketB = new FrontOfStageTicket(band, dateTime, 2000, "AB12");

        personA = new Person(ticketA);
        personB = new Person(ticketB);
    }

    @Test
    void getTicketTest() {
        assertEquals(ticketA, personA.getTicket());
        assertEquals(ticketB, personB.getTicket());

        assertEquals(LocalTime.of(19, 0), personA.getTicket().entryTime());
        assertEquals(LocalTime.of(18, 0), personB.getTicket().entryTime());
    }
}