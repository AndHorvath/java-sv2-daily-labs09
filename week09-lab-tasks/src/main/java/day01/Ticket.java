package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    // --- attributes ---------------------------------------------------------

    private String band;
    private LocalDateTime dateTime;
    private int price;

    // --- constructors -------------------------------------------------------

    public Ticket(String band, LocalDateTime dateTime, int price) {
        this.band = band;
        this.dateTime = dateTime;
        this.price = price;
    }

    // --- getters and setters ------------------------------------------------

    public String getBand() { return band; }
    public LocalDateTime getDateTime() { return dateTime; }
    public int getPrice() { return price; }

    // --- public methods -----------------------------------------------------

    public LocalTime entryTime() {
        return LocalTime.of(dateTime.getHour() - 1, dateTime.getMinute());
    }
}