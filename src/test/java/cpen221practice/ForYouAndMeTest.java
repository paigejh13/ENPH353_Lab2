package cpen221practice;

import cpen221practice.ForYouAndMe;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForYouAndMeTest {

    private ForYouAndMe fyam;

    @Before
    public void setup() {
        fyam = new ForYouAndMe();
    }

    @Test
    public void noNameGiven() {
        String input = null;
        String expected = "One for you, one for me.";

        assertEquals(expected, fyam.youandme(input));
    }

    @Ignore("Remove to run test")
    @Test
    public void aNameGiven() {
        String input = "Alice";
        String expected = "One for Alice, one for me.";

        assertEquals(expected, fyam.youandme(input));
    }

    @Ignore("Remove to run test")
    @Test
    public void anotherNameGiven() {
        String input = "Bob";
        String expected = "One for Bob, one for me.";

        assertEquals(expected, fyam.youandme(input));
    }
}
