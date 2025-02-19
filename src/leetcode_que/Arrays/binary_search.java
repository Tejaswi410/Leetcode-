package leetcode_que.Arrays;
//https://leetcode.com/problems/binary-search

public class binary_search {
    //simple binary search
        public int search(int[] nums, int target) {
            int n = nums.length;
            int start = 0;
            int end = n-1;
            while (start<=end){
                int mid = start + (end -start)/2;  // Instead of (start+end)/2 we used [start + (end-start)/2] to prevent potential overflow issues that can occur when calculating the midpoint in large arrays.
                if(target < nums[mid]) end=mid-1;
                else if(target > nums[mid]) start=mid+1;
                else{
                    return mid;
                }
            }
            return -1;
        }

}
