package leetcode_que.Linked_List;
//https://leetcode.com/problems/partition-list?envType=problem-list-v2&envId=linked-list
//Main idea is to create 2 list : smaller(for nodes values < x) , greater( for node values >= x)
//we traverse the whole LL and check the node value : if it is smaller than append it to smaller list else append it to greater list
//lastly append smaller list's tail to greater list's head and return smallerlist's head.next

public class partition_list {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);
        ListNode smallerTail = smallerHead;
        ListNode greaterTail = greaterHead;

        while(head != null){
            if(head.val < x){
                smallerTail.next = head;
                smallerTail = smallerTail.next;
            }
            else{
                greaterTail.next = head;
                greaterTail = greaterTail.next;
            }
            head = head.next;
        }
        smallerTail.next = greaterHead.next;
        greaterTail.next = null;
        return smallerHead.next;
    }
}
