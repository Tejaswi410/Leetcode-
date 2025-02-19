package leetcode_que.Arrays;
//https://leetcode.com/problems/merge-sorted-array

public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1 contains space for m+n elements and for the nth elements it contains zeroes
        int i= m-1;          //pointer to last element of nums1 (excluding zeroes)
        int j= n-1;         //pointer to last element of nums2
        int k = m+n-1;     //pointer to last index of nums1 i.e. zero
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){     //no matter which element is bigger it places it to the last index i.e. kth index and decrement the k pointer
                nums1[k--]= nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){      //this is used if nums2 arrays still has elements
            nums1[k--]= nums2[j--];
        }
    }
}
