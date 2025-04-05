package leetcode_que.Linked_List;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list
//main idea is to make fast pointer n steps ahead and then start slow pointer from head and increase one step ahead for both slow and fast pointer
//so that slow pointer will come before the deleting node(node that we want to delete) and then just delete that node.
//suppose the length of LL is l and we have to delete the nth node then the node which is going to be deleted is (l-n+1)[+1 comes bcoz of 0th indexed]
//so for deleting (l-n+1)th node we have to reach (l-n)th node hence we first put fast pointer (l-n) steps ahead of slow pointer and then one step taken by both the pointers.
//Initially slow pointer is n steps behind fast pointer and eventually (l-n) behind the fast so we will reach at (l-n)th node.

public class del_nth_node_from_end_LL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0; i<n ;i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;
    }
}
