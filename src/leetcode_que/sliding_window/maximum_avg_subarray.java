package leetcode_que.sliding_window;
//https://leetcode.com/problems/maximum-average-subarray-i\
//first we wil find the sum of the elements from 0 to kth index and then from k to n
//while finding the sum  from k to n we will maintain the window by removing the leftmost element and adding the rightmost element everytime
//we will update the max sum in every iteration as we get the max sum we can surely get the max avg subarray by sliding window approach
public class maximum_avg_subarray {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += (nums[i] - nums[i - k]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum * 1.0 / k;
    }
}
