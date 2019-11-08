import static org.junit.Assert.*;

public class StringsTest {

    @org.junit.Test
    public void uniqueLetters() {
        String actual = Strings.uniqueLetters("harrasses");
        String expected = "he";
        assertEquals(expected, actual);
        actual = Strings.uniqueLetters("mississippi");
        expected = "m";
        assertEquals(expected, actual);
        actual = Strings.uniqueLetters("missouri");
        expected = "mour";
        assertEquals(expected, actual);
        actual = Strings.uniqueLetters("orinoco");
        expected = "rinc";
        assertEquals(expected, actual);
        actual = Strings.uniqueLetters("belinda");
        expected = "belinda";
        assertEquals(expected, actual);
        actual = Strings.uniqueLetters("barbara");
        expected = "";
        assertEquals(expected, actual);
    }
}