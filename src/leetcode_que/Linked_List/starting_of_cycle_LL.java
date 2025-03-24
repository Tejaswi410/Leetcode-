package leetcode_que.Linked_List;
//https://leetcode.com/problems/linked-list-cycle-ii
//using tortise hare method , same as in detecting cycle the point at which we detect cycle we again initialize slow to head and now increase the slow and fast pointer by 1 step instead of slow by 1 and fast by 2.

public class starting_of_cycle_LL {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
