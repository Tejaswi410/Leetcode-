package leetcode_que.Linked_List;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list?envType=problem-list-v2&envId=linked-list
//using two pointer approach(start and end) we can remove duplicates
//Main idea is to check value by comparing start and end node values if it equals then remove the end node and point it to next node
//then again compare and the process continues till end != null else just increment the start and end pointer by 1 node.

public class remove_duplicates_LL {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode start = head;
        ListNode end = start.next;
        while(end != null){
            if(start.val == end.val){
                start.next = end.next;
                end.next = null;
                end = start.next;
            }
            else{
                start = start.next;
                end = end.next;
            }
        }
        return head;
    }
}
