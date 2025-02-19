package leetcode_que.Arrays;
//https://leetcode.com/problems/search-in-rotated-sorted-array
/* A simple approach is used in this problem as we know array is sorted and rotated by k position, so we know that some part of the array is sorted while other part
is not sorted hence we simply apply binary search and find the element . first we find either the left part is sorted or right part then we check if target element
lies between low and mid(if left part is sorted) if it does then use binary search in it and vice versa. If target element lies between the sorted part then search
in it otherwise search in other part.
 */

public class Search_rotated_sorted_array {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]){  //to check left part is sorted or not
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{   //to check right part is sorted or not
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
