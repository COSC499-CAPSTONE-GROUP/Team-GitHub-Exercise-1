import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

    /*
     * public static void main(String[] args) {
     * }
     */

    @Test
    public void test1() {
        int[] arrayInput = { 27, 27, 15, 15, 11 };
        int expected = 15;
        // assertEquals(new ModeFinding().mode(arrayInput), expected);
    }

    @Test
    public void test2() {
        int[] arrayInput = { 3, 2, 1 };
        int expected = 1;
        // assertEquals(new ModeFinding().mode(arrayInput), expected);
    }

    @Test
    public void test3() {
        int[] arrayInput = { 3, 2, 1, 3 };
        int expected = 3;
        // assertEquals(new ModeFinding().mode(arrayInput), expected);
    }
}
