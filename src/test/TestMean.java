package test;

 import static org.junit.Assert.*;
 import org.junit.Test;
 import main.mean;

 public class TestMean {
 	@Test
 	public void test_max1() {
 		assertEquals(4, mean.calculateMean(new int[] {1, 2, 3, 4, 5,6,7}));
 	}

 	@Test
 	public void test_max2() {
        assertEquals(18, mean.calculateMean(new int[] {10, 12, 13, 14, 5,61,17}));
 	}
 }