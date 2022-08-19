package ua.levelup.Homework11;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHomework11 {
    @Test
    public void test1() {
        assertEquals("bbcd", new Function().swapCharacters("abcd", 'a', 'b'));
        assertEquals("dcbb", new Function().reverseString("bbcd"));
    }
}
