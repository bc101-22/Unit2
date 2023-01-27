package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    int[] intArray1 = {1, 2, 3, 4, 5, 6};
    int[] intArray2 = {1, 3, 5};
    int[] emptyArray = {};


    @Test
    public void testBinarySearchFindsTarget() {
        assertEquals(3, BonusBinarySearch.binarySearch(intArray1, 3));
        assertEquals(BonusBinarySearch.binarySearch(intArray2, 1),1);
    }
    @Test
    public void testBinarySearchReturnsCorrectValueWhenTargetNotInArray() {
        assertEquals(BonusBinarySearch.binarySearch(intArray2, 2),-1);
        assertEquals(BonusBinarySearch.binarySearch(emptyArray, 1), -1);
    }

}
