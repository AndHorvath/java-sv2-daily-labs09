package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

    // --- attributes ---------------------------------------------------------

    private String code;

    // --- constructors -------------------------------------------------------

    public FrontOfStageTicket(String band, LocalDateTime dateTime, int price, String code) {
        super(band, dateTime, price);
        this.code = code;
    }

    // --- getters and setters ------------------------------------------------

    public String getCode() { return code; }

    // --- public methods -----------------------------------------------------

    public LocalTime entryTime() {
        return super.entryTime().minusHours(1);
    }
}