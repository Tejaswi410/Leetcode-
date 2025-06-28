package leetcode_que.Linked_List;
import java.util.*;
//https://leetcode.com/problems/merge-k-sorted-lists?envType=problem-list-v2&envId=linked-list
//To optimise the process of merging K sorted lists, we can utilise a min heap-based approach where we define a priority queue to maintain the sorted order based on node values.
//Push all the heads of all K linked lists into a priority queue.
//While the priority queue is not empty, extract the head ie. node with the minimum value, append it to our merged list and
// push it’s next node into the priority queue.
//This iterative process ensures that at each step, the algorithm selects the smallest available node value among the heads of the linked lists.
//This minimum value is appended to the merged list, and we then move to the next node from the same list for further merging until all lists are merged into a single sorted linked list.

public class merge_k_sorted_LL {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null)
                heap.offer(node);
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (!heap.isEmpty()) {
            ListNode minNode = heap.poll();
            current.next = minNode;
            current = current.next;
            if (minNode.next != null) {
                heap.offer(minNode.next);
            }
        }

        return dummy.next;
    }
}
