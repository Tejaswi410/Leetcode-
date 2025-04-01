package leetcode_que.Linked_List;
//https://leetcode.com/problems/sort-list
//using merge sort approach to solve this ...

public class sort_LL {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = findMiddle(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);
        return MergeList(left,right);
    }

    public ListNode MergeList(ListNode l1, ListNode l2){
        ListNode newnode = new ListNode(-1);
        ListNode temp = newnode;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null) temp.next = l1;
        if(l2 != null) temp.next = l2;
        return newnode.next;
    }

    public ListNode findMiddle(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast  = fast.next.next;
        }
        return slow;
    }
}
