package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    // --- attributes ---------------------------------------------------------

    private List<Person> people;

    // --- constructors -------------------------------------------------------

    public Concert() {
        this.people = new ArrayList<>() ;
    }

    // --- getters and setters ------------------------------------------------

    public List<Person> getPeople() { return people; }

    // --- public methods -----------------------------------------------------

    public void addPerson(Person person, LocalTime localTime) {
        if (person.getTicket().entryTime().isBefore(localTime)) {
            people.add(person);
        } else {
            throw new IllegalArgumentException(
                "No entry at specified time with specified ticket.");
        }
    }
}