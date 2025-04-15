package leetcode_que.Linked_List;
//https://leetcode.com/problems/reverse-nodes-in-k-group?envType=problem-list-v2&envId=linked-list
//Here we've divided the whole algorithm into 3 functions:(1) reverse k groups, (2) get_kth_Node, (3) reverse
//get_kth_Node func gives the kth element to reverse the LL from temp to kthNode
// Reverse func just simply reverses the LL given to it
//In reverseKgroup func first we get the KthNode and points kthNode.next = null and reverse the LL from temp to kthNode before reversing we've already store the nextkthNode
//after reversing we if it is first k group then we have to change head as LL is reversed else just connect the prevLastNode of reversed LL to the kthNode
//just repeat this process till we get less elements than k for reversing in that case we'll just connect it to the prevLastNode.

public class reverse_k_groups {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLastNode = null;
        while(temp != null){
            ListNode kthNode = getKthNode(temp,k);
            if(kthNode == null){
                if(prevLastNode != null) prevLastNode.next = temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if(temp == head){
                head = kthNode;
            }
            else{
                prevLastNode.next = kthNode;
            }
            prevLastNode = temp;
            temp = nextNode;
        }
        return head;
    }

    public ListNode getKthNode(ListNode temp,int k){
        for(int i=1; i<k ; i++){
            if(temp == null) return null;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
}
