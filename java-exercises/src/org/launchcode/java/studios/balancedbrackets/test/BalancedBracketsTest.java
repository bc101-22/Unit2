package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testEmptyString() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void testBalancedBrackets() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testBalancedBracketsWithText() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testUnbalancedBrackets1() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[[[]]"));
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]]][[[]"));
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("["));
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testUnbalancedBracketsWithText() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

}
