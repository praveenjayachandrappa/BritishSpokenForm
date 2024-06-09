import org.example.BritishSpokenTime;
import org.junit.Test;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class BritishSpokenTimeTest {

    @Test
    public void testMidnight() {
        LocalTime time = LocalTime.of(0, 0);
        String expected = "midnight";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoon() {
        LocalTime time = LocalTime.of(12, 0);
        String expected = "noon";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testOneOClock() {
        LocalTime time = LocalTime.of(1, 0);
        String expected = "one o'clock";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testFivePastTwo() {
        LocalTime time = LocalTime.of(2, 5);
        String expected = "5 past two";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testTenPastThree() {
        LocalTime time = LocalTime.of(3, 10);
        String expected = "10 past three";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testHalfPastSeven() {
        LocalTime time = LocalTime.of(7, 30);
        String expected = "half past seven";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testQuarterToTen() {
        LocalTime time = LocalTime.of(9, 45);
        String expected = "quarter to ten";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwentyFiveToEight() {
        LocalTime time = LocalTime.of(7, 35);
        String expected = "25 to eight";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCaseOneMinutePastMidnight() {
        LocalTime time = LocalTime.of(0, 1);
        String expected = "1 past twelve";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCaseOneMinuteToMidnight() {
        LocalTime time = LocalTime.of(23, 59);
        String expected = "1 to twelve";
        String actual = BritishSpokenTime.getBritishSpokenTime(time);
        assertEquals(expected, actual);
    }
}
