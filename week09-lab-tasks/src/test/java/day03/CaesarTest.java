package day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    Caesar caesar;

    @BeforeEach
    void setUp() {
        caesar = new Caesar(2);
    }

    @Test
    void getOffsetTest() {
        assertEquals(2, caesar.getOffset());
    }

    @Test
    void encryptTest() {
        assertEquals("crrng", caesar.encrypt("apple"));

        caesar = new Caesar(28);
        assertEquals("crrng", caesar.encrypt("apple"));

        caesar = new Caesar(13);
        assertEquals("apple", caesar.encrypt(caesar.encrypt("apple")));
    }
}