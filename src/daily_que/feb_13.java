package daily_que;
import java.util.*;
//https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii?envType=daily-question&envId=2025-02-13

public class feb_13 {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for(int num: nums){
            queue.offer((long)num);
        }

        int ops = 0;
        while(queue.size() > 1 && queue.peek() < k){
            ops++;
            long first = queue.poll();
            long second = queue.poll();
            queue.offer(Math.min(first,second)*2 + Math.max(first,second));
        }
        return queue.peek() >= k? ops : -1;
    }
}
