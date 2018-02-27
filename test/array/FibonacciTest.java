package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void should_return_0_when_n_is_0() throws Exception {
        assertEquals(0,new Fibonacci().fibonacci(0));
    }

    @Test
    public void should_return_1_when_n_is_1() throws Exception {
        assertEquals(1,new Fibonacci().fibonacci(1));
    }

    @Test
    public void should_return_1_when_n_is_2() throws Exception {
        assertEquals(1,new Fibonacci().fibonacci(2));
    }

    @Test
    public void should_return_2_when_n_is_3() throws Exception {
        assertEquals(1,new Fibonacci().fibonacci(2));
    }
}