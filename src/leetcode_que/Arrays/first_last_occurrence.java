package leetcode_que.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

public class first_last_occurrence {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {first(nums,target),last(nums,target)};
        return ans;
    }

    public int first(int[] nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int first = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){  //if target is found then we search in the left half of the array because first position of the target will lie on the smaller index
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return first;
    }

    public int last(int[] nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){  //if target is found then we search in the right half of the array because last position of the target will lie on the bigger index
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return last;
    }
}
