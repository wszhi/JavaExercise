package exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeListTest {

    @Test
    public void should_return_sort_node_list() throws Exception {
        MergeList mergeList = new MergeList();
        MergeList.ListNode listNode  = new MergeList.ListNode(1);
        listNode.next = new MergeList.ListNode(2);
        listNode.next.next = new MergeList.ListNode(5);

        MergeList.ListNode listNode2  = new MergeList.ListNode(3);
        listNode2.next = new MergeList.ListNode(4);
        listNode2.next.next = new MergeList.ListNode(6);
        MergeList.ListNode result = mergeList.Merge(listNode,listNode2);
        assertEquals(1,result.val);
        assertEquals(2,result.next.val);
        assertEquals(3,result.next.next.val);
        assertEquals(4,result.next.next.next.val);
        assertEquals(5,result.next.next.next.next.val);
        assertEquals(6,result.next.next.next.next.next.val);
    }
}