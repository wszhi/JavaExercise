package recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpFloorTest {
    @Test
    public void should_return_1_when_jump_1_floor() throws Exception {
        assertEquals(1, new JumpFloor().jumpFloor(1));
    }

    @Test
    public void should_return_2_when_jump_2_floor() throws Exception {
        assertEquals(2, new JumpFloor().jumpFloor(2));
    }

    @Test
    public void should_return_3_when_jump_3_floor() throws Exception {
        assertEquals(3, new JumpFloor().jumpFloor(3));
    }

    @Test
    public void should_return_4_when_special_jump_3_floor() throws Exception {
        assertEquals(4, new JumpFloor().JumpFloorII(3));
    }
}