package day03;

public class Caesar extends Encryption {

    // --- attributes ---------------------------------------------------------

    private int offset;

    // --- constructors -------------------------------------------------------

    public Caesar(int offset) {
        this.offset = offset;
    }

    // --- getters and setters ------------------------------------------------

    public int getOffset() { return offset; }

    // --- public methods -----------------------------------------------------

    @Override
    public String encrypt(String input) {
        int defaultTranslation = 'a' - 1;
        int alphabetSpan = 'z' - 'a' + 1;
        StringBuilder encrypted = new StringBuilder();
        for (char character : input.toLowerCase().toCharArray()) {
            encrypted.append(Character.toString(
                (character - defaultTranslation + offset) % alphabetSpan + defaultTranslation));
        }
        return encrypted.toString();
    }
}