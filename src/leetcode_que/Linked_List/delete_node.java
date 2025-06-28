package leetcode_que.Linked_List;
import java.util.*;
//https://leetcode.com/problems/delete-node-in-a-linked-list?envType=problem-list-v2&envId=linked-list


  class ListNode {
      int val;
      ListNode next;
      ListNode() { val = x; }
  }

public class delete_node {
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
