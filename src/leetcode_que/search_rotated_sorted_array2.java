package leetcode_que;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii
/* we use the same approach here which we have used in search in rotated sorted array 1 . Here we have only one difference that it may contain duplicate elements
and instead of index we have to return true or false so we will add just one check that if arr[low] ,arr[mid],arr[high] is same then just increment the low pointer and decrement
the high until condition become false.
 */

public class search_rotated_sorted_array2 {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return true;
            if(nums[low] == nums[mid] && nums[high] == nums[mid]) {
                low ++;
                high--;
                continue;
            }
            if(nums[low] <= nums[mid]){  //left part is sorted
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{   //right part is sorted
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}
