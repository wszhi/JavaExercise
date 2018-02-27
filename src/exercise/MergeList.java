package exercise;

/*
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
思路：
构造一个新链表，把原来的两个链表的第一个值进行对比，取小的值为新链表第一个值，把这个节点从原来的链表中去掉，新链表当前节点的下一个节点就可以通过递归得到结果了
 */
public class MergeList {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            result.val = list2.val;
            list2 = list2.next;
        } else if (list2 == null) {
            result.val = list1.val;
            list1 = list1.next;
        } else if (list2.val < list1.val) {
            result.val = list2.val;
            list2 = list2.next;
        } else {
            result.val = list1.val;
            list1 = list1.next;
        }

        result.next = Merge(list1, list2);
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
