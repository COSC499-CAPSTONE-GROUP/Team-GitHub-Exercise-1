package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.min;

public class minTest {
    @Test
    public void testingMin1() {
        assertEquals(0, min.findMin(new int[] {0, 1, 2, 3, 4, 5}));
    }

    @Test
    public void testingMin2() {
        assertEquals(20, min.findMin(new int[] {20, 40, 60, 80, 100}));
    }
}