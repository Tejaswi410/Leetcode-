package leetcode_que.Linked_List;
//https://leetcode.com/problems/middle-of-the-linked-list
//this method states that slow pointer will go one step ahead and fast pointer will go 2 steps ahead it means when fast
//reaches n steps slow will be at n/2 and that is what we want i.e. middle of LL (n/2).simple but very effective algorithm.

public class middle_of_LL {
    public ListNode middleNode(ListNode head) {
        //Tortise-Hare algorithm/Method
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
