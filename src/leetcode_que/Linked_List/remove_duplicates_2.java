package leetcode_que.Linked_List;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii?envType=problem-list-v2&envId=linked-list
//Main idea is to use two pointer approach to solve this
//Using prev and curr pointer to find the duplicates and incrementing curr till we find same val nodes when distinct nodes are found then we do prev.next = curr.next

public class remove_duplicates_2 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
            while(curr.next != null && curr.next.val == curr.val){
                curr = curr.next;
            }
            if(prev.next == curr){ //if prev and curr node values are not same then prev will go to curr and we start doing same process again(finding the duplicates)
                prev = curr;
            }
            else{
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
