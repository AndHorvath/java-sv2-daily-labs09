package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    StringLists stringLists;

    @BeforeEach
    void setUp() {
        stringLists = new StringLists();
    }

    @Test
    void shortestWords() {
        assertEquals(
            new ArrayList<>(Arrays.asList("aa", "bb", "dd")),
            stringLists.shortestWords(new ArrayList<>(Arrays.asList("aaa", "aa", "bb", "cccc", "dd"))));
    }
}