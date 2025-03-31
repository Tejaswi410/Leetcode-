package leetcode_que.Linked_List;
//https://leetcode.com/problems/intersection-of-two-linked-lists
//Main idea is We will reduce the search length. This can be done by searching the length of the shorter linked list.
//we will first find out the length of the two linked list and find the len1 - len2  if diff is negative then list2 is bigger else vice versa.
//Now we will shift the head pointer of bigger list to the diff achieved and starts iterating through there until its get null and in between if we find same node that would be intersection else just return head of the list.

public class intersection_node_LL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff = Diff(headA, headB);
        if(diff < 0){
            while(diff != 0){
                headB = headB.next;
                diff++;
            }
        }
        else{
            while(diff != 0){
                headA = headA.next;
                diff--;
            }
        }
        while(headB != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

    }

    public int Diff(ListNode head1, ListNode head2){
        int len1 = 0,len2 = 0;
        while(head1 != null || head2 != null){
            if(head1 != null){
                len1++;
                head1 = head1.next;
            }
            if(head2 != null){
                len2++;
                head2 = head2.next;
            }
        }
        return len1 - len2;
    }

    //optimised approach
    //Main idea is to use 2 pointers to iterate through 2 lists. one is pointing to list1 head and other is pointing to list2 head
    //using a while loop until we find the intersection and inside that we use ternary operator which states the n1 and n2 values if it gets null then value will be head of that corresponding list else increment that pointer.
    //just do this for both the lists.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA;
        ListNode n2 = headB;
        while(n1 != n2){
            n1 = n1 == null? headA : n1.next;
            n2 = n2 == null? headB : n2.next;
        }
        return n1;
    }
}
