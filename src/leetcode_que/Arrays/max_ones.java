package leetcode_que.Arrays;
//https://leetcode.com/problems/max-consecutive-ones
public class max_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max_count = Math.max(count, max_count);
        }
        return max_count;
    }
}
