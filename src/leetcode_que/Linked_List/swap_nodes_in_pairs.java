package leetcode_que.Linked_List;
//https://leetcode.com/problems/swap-nodes-in-pairs?envType=problem-list-v2&envId=linked-list
//firstly create a dummy node and point it to head of the LL and now create a pointer lets say point
//we will swap 2 nodes (swap1,swap2)[basically changing links of the nodes] and then point will go to next of the 2 swapped nodes.
//lastly we'll return dummy's next node that would be head.
public class swap_nodes_in_pairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode point = dummy;
        while(point.next != null && point.next.next != null){
            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;

            swap1.next = swap2.next;
            swap2.next = swap1;

            point.next = swap2;
            point = swap1;
        }
        return dummy.next;
    }
}
