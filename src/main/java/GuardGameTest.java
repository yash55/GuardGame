import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yash on 2/25/16.
 */
public class GuardGameTest {

    GuardGame gg;

    @Before
    public void setUp() throws Exception {
        gg = new GuardGame();
    }

    @Test
    public void testAnswer() throws Exception {

        long inputValue = 123;
        int expected = 6;
        assertEquals(expected, gg.answer(inputValue));

        inputValue = 0;
        expected = 0;
        assertEquals(expected, gg.answer(inputValue));

        inputValue = 12345678;
        expected = 9;
        assertEquals(expected, gg.answer(inputValue));

        inputValue = 123999999;
        expected = 6;
        assertEquals(expected, gg.answer(inputValue));

        inputValue = 1239999999;
        expected = 6;
        assertEquals(expected, gg.answer(inputValue));

    }
}