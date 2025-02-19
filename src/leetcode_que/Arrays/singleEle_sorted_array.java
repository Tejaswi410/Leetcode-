package leetcode_que.Arrays;
//https://leetcode.com/problems/single-element-in-a-sorted-array

public class singleEle_sorted_array {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-2;
        if (n==1) return nums[0];  //if arr contains only one element then it will be the ans for sure.
        if(nums[0] != nums[1]) return nums[0];  //if 1st element is not equal to next element then that will be the ans.
        if(nums[n-1] != nums[n-2]) return nums[n-1];  //if last element is not equal to 2nd last element then it will be the ans.
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) return nums[mid];
            else if( (mid % 2 == 0 && nums[mid] == nums[mid+1]) || (mid % 2 ==1 && nums[mid] == nums[mid-1])){  //this condition make sure that we will find the element in the correct half i.e. we will eliminate the wrong half.
                low = mid + 1;
            }
            else{
                high = mid -1;
            }

        }
        return -1;
    }
}
