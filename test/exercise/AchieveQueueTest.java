package exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AchieveQueueTest {
    @Test
    public void should_return_1_when_pop_once_given_push_1_2_3() {
        AchieveQueue achieveQueue = new AchieveQueue();
        achieveQueue.push(1);
        achieveQueue.push(2);
        achieveQueue.push(3);
        assertEquals(1,achieveQueue.pop());
    }

    @Test
    public void should_return_3_when_push_1_2_3_pop_twice_push_4_5_pop_once() {
        AchieveQueue achieveQueue = new AchieveQueue();
        achieveQueue.push(1);
        achieveQueue.push(2);
        achieveQueue.push(3);
        assertEquals(1,achieveQueue.pop());
        assertEquals(2,achieveQueue.pop());
        achieveQueue.push(4);
        achieveQueue.push(5);
        assertEquals(3,achieveQueue.pop());
    }
}