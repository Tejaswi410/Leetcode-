package leetcode_que.Linked_List;
//https://leetcode.com/problems/reverse-linked-list

public class reverse_LL {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode back = null;
        ListNode curr = head;
        ListNode front = null;
        while(curr != null){
            front = curr.next;
            curr.next = back;
            back = curr;
            curr = front;
        }
        return back;
    }
}
