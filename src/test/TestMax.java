package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.FindMax;

public class TestMax {
	@Test
	public void test_max1() {
		assertEquals(91, FindMax.findMax(new int[] {5, 33, 78, 91, 2}));
	}
	
	@Test
	public void test_max2() {
		assertEquals(47, FindMax.findMax(new int[] {13, 27, 8, 47, 1}));
	}
}
