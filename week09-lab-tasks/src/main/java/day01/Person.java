package day01;

public class Person {

    // --- attributes ---------------------------------------------------------

    private Ticket ticket;

    // --- constructors -------------------------------------------------------

    public Person(Ticket ticket) {
        this.ticket = ticket;
    }

    // --- getters and setters ------------------------------------------------

    public Ticket getTicket() { return ticket; }
}