package leetcode_que;
//https://leetcode.com/problems/split-array-largest-sum
import java.util.*;

public class split_array_largest_sum {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = nums[0];
        int high = 0;
        for(int i = 0;i<n;i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(cnt_partitions(nums,mid) > k){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
    }

    public int cnt_partitions(int[] arr,int maxsum){
        int n = arr.length;
        int partition = 1;
        long sum = 0;
        for (int i = 0; i < n;i++){
            if(sum + arr[i] <= maxsum){
                sum += arr[i];
            }
            else{
                partition++;
                sum = arr[i];
            }
        }
        return partition;
    }
}
