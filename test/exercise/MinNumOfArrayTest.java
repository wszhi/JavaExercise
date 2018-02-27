package exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinNumOfArrayTest {
    @Test
    public void should_return_0_when_array_length_is_0() throws Exception {
        MinNumOfArray minNumOfArray = new MinNumOfArray();
        int[] test = {};
        assertEquals(0,minNumOfArray.minNumberInRotateArray(test));
    }

    @Test
    public void should_return_1_when_array_is_3_4_1_2() throws Exception {
        MinNumOfArray minNumOfArray = new MinNumOfArray();
        int[] test = {3,4,1,2};
        assertEquals(1,minNumOfArray.minNumberInRotateArray(test));
    }
}