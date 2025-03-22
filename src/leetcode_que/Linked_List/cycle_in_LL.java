package leetcode_que.Linked_List;
//https://leetcode.com/problems/linked-list-cycle
//using tortise-hare method/algorithm

public class cycle_in_LL {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
