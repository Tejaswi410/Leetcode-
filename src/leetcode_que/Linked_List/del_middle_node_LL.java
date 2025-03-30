package leetcode_que.Linked_List;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list
//tortise and hare method is used to find the middle node... slow pointer will reach before the middle node then just change the links to delete the middle node.

public class del_middle_node_LL {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        fast = head.next.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(slow.next != null) slow.next = slow.next.next;
        return head;
    }
}
