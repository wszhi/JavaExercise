package array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class printSubArrayTest {
    @Test
    public void should_contains_all_sub_array() throws Exception {
        printSubArray printSubArray = new printSubArray();
        Integer[] testArray = {10, 20, 30};
        List list = printSubArray.printAllSubArray(testArray);
        assertEquals(7, list.size());
        assertTrue(list.contains(Arrays.asList(10)));
        assertTrue(list.contains(Arrays.asList(20)));
        assertTrue(list.contains(Arrays.asList(30)));
        assertTrue(list.contains(Arrays.asList(10, 20)));
        assertTrue(list.contains(Arrays.asList(10, 30)));
        assertTrue(list.contains(Arrays.asList(20, 30)));
        assertTrue(list.contains(Arrays.asList(10, 20, 30)));
    }
}