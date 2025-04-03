package leetcode_que.Linked_List;
//https://leetcode.com/problems/merge-two-sorted-lists
//same sorting LL logic is used.

public class merge_sorted_LL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        else if(list2 != null){
            temp.next = list2;
        }
        return dummy.next;
    }
}
