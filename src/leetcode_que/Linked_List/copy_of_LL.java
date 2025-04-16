package leetcode_que.Linked_List;
//https://leetcode.com/problems/copy-list-with-random-pointer?envType=problem-list-v2&envId=linked-list
//To solve this problem I've done it in three steps:
//(1) Create a copynode inbetween the original LL
//(2) Introduce random pointers to the copynode
//(3) Remove the copynodes from the original LL and create a separate copy list of the original one
//This way we can solve this in O(3N) time complexity and O(N) space complexity(copy of the list which is mandatory).
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class copy_of_LL {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        copynodes(head);
        randomPointers(head);
        return getdeepcopy(head);
    }

    //This if for creating copynodes inbetween the original LL
    public void copynodes(Node head){
        Node temp = head;
        while(temp != null){
            Node copynode = new Node(temp.val);
            Node nextnode = temp.next;
            copynode.next = nextnode;
            temp.next = copynode;
            temp = nextnode;
        }
    }

    //This if for introducing random pointers to the copynodes so that copynodes reflect the same attributes as original LL
    public void randomPointers(Node head){
        Node temp = head;
        while(temp != null){
            Node copynode = temp.next;
            if(temp.random != null){
                //here we point the copynode.random to temp.random.next because temp.random will point to the node which is in the original list
                //but we have to make list which is exact replica of original list so we have to point it to random node but in the copynode list
                //hence we have pointed it to random.next as we've already created a copynode at temp.next.
                copynode.random = temp.random.next;
            }
            else{
                copynode.random = null;
            }
            temp = temp.next.next;
        }
    }

    //This one is for getting the deep copy i.e. remove the copynodes from the original LL and make it a separate List as of original LL
    public Node getdeepcopy(Node head){
        Node temp = head;
        Node dummynode = new Node(-1);
        Node res = dummynode;
        while(temp != null){
            res.next = temp.next;
            res = res.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummynode.next;
    }
}
