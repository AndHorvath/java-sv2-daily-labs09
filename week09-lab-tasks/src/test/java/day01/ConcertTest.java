package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    Concert concert;

    String band;
    LocalDateTime dateTime;
    Ticket ticketA;
    Ticket ticketB;
    Person personA;
    Person personB;
    IllegalArgumentException exception;

    @BeforeEach
    void setUp() {
        concert = new Concert();
    }

    @Test
    void getPeopleTest() {
        assertEquals(0, concert.getPeople().size());
    }

    @Test
    void addPersonTest() {
        band = "The Band";
        dateTime = LocalDateTime.of(2010, 10, 20, 20, 0);
        ticketA = new Ticket(band, dateTime, 1000);
        ticketB = new FrontOfStageTicket(band, dateTime, 2000, "AB12");
        personA = new Person(ticketA);
        personB = new Person(ticketB);

        concert.addPerson(personA, LocalTime.of(19, 19));
        assertEquals(1, concert.getPeople().size());
        assertEquals(personA, concert.getPeople().get(0));

        concert.addPerson(personB, LocalTime.of(18, 18));
        assertEquals(2, concert.getPeople().size());
        assertEquals(personB, concert.getPeople().get(1));

        exception = assertThrows(
            IllegalArgumentException.class, () -> concert.addPerson(personA, LocalTime.of(18, 18)));
        assertEquals("No entry at specified time with specified ticket.", exception.getMessage());
    }
}