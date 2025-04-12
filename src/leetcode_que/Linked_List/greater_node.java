package leetcode_que.Linked_List;
import java.util.*;
//https://leetcode.com/problems/next-greater-node-in-linked-list?envType=problem-list-v2&envId=linked-list
//Main idea is to traverse the LL from tail so that we get the larger values for every ith node
//1.store the node values in arraylist for easy reverse traversal
//2.while traversing the arraylist from right to left : pop the elements of stack if it is not empty AND having lower values than current value in arraylist
//3. after poping the elements from stack if it is still not empty and has greater value then store it into ans array that is our ans for ith index.
//4. for every iteration push the values into the stack.

public class greater_node {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while(head != null){
            values.add(head.val);
            head = head.next;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        int LLsize = values.size();
        int[] ans = new int[LLsize];

        for(int i=LLsize - 1; i>=0 ;i--){
            while( !stack.isEmpty() && stack.peek() <= values.get(i)){
                stack.pop();
            }

            if( !stack.isEmpty()){
                ans[i] = stack.peek();
            }

            stack.push(values.get(i));
        }
        return ans;
    }
}
