package leetcode_que.sliding_window;
//https://leetcode.com/problems/max-consecutive-ones-iii?envType=problem-list-v2&envId=sliding-window
//Main idea is to convert this problem into finding at most k zeros
//we will use sliding window and two pointer approach to solve this, we will first run a while loop until it reaches n
//if the element is zero we will increase zero count and if it exceeds  k then we will move the left pointer and simulataneously move right pointer but we will not update the len until we get the zeros <= k
//when we encounter nums[left] == 0 then decrease zero count and now starts to update length and max length
// we will always update right pointer
public class max_consecutive_ones_3 {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int zero = 0;
        int max = 0,len = 0;
        while(right < nums.length){
            if(nums[right] == 0) zero++;
            if(zero > k){
                if(nums[left] == 0) zero--;
                left++;
            }
            if(zero <= k){
                len = right - left + 1;
                max = Math.max(max,len);
            }
            right++;
        }
        return max;
    }
}
