package leetcode_que.Arrays;
import java.util.*;
//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold

public class smallest_divisor_threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int ele:nums){
            max = Math.max(ele,max);
        }
        int low = 1;
        int high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(sum(nums,mid) <= threshold){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public int sum(int[] nums,int d){
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum+=Math.ceil((double)nums[i] / (double)d);
        }
        return sum;
    }
}
