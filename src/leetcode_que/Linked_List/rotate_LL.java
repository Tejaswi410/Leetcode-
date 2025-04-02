package leetcode_que.Linked_List;
//https://leetcode.com/problems/rotate-list
//Main idea is to find the len and tail of LL after that just doing k = k%len makes bigger k values into smaller one so that rotating would be easier
//because if size and k value will be same then no need to rotate LL just return head same with the multiples of k
//for e.g. if size is 5 and k is 5/10/15...then no need to rotate but if it is 9/13... then it will give remainder and it would be smaller ofcourse
//then we will find new lastnode and just change the links to rotate.

public class rotate_LL {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int len = 1;
        ListNode tail = head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        if(k % len == 0) return head;
        k = k % len;
        ListNode lastnode = newlast(head,len - k); //len-k will give the new last node which will points to null after rotating
        tail.next = head;
        head = lastnode.next;
        lastnode.next = null;
        return head;

    }

    public ListNode newlast(ListNode head,int k){
        int cnt = 1;
        ListNode temp = head;
        while(temp != null){
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
}
