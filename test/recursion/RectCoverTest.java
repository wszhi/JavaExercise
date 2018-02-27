package recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectCoverTest {

    @Test
    public void should_return_1_when_rectangle_length_is_1() throws Exception {
        assertEquals(1,new RectCover().rectCover(1));
    }

    @Test
    public void should_return_2_when_rectangle_length_is_2() throws Exception {
        assertEquals(2,new RectCover().rectCover(2));
    }

    @Test
    public void should_return_3_when_rectangle_length_is_3() throws Exception {
        assertEquals(3,new RectCover().rectCover(3));
    }

    @Test
    public void should_return_5_when_rectangle_length_is_4() throws Exception {
        assertEquals(5,new RectCover().rectCover(4));
    }

    @Test
    public void should_return_8_when_rectangle_length_is_5() throws Exception {
        assertEquals(8,new RectCover().rectCover(5));
    }
}