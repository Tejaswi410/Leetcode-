package leetcode_que.Linked_List;
//https://leetcode.com/problems/remove-linked-list-elements?envType=problem-list-v2&envId=linked-list
//using dummy node and 2 pointer i.e. prev and curr prev will point to dummy and dummy is connected to head of the LL
//we will check if curr.val is equals to given val if it does then prev.next will point to curr.next and curr will point to null.

public class remove_node_byVal {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
