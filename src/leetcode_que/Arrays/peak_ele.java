package leetcode_que.Arrays;
//https://leetcode.com/problems/peak-index-in-a-mountain-array

public class peak_ele {
    public int peakIndexInMountainArray(int[] arr) {
        int n= arr.length;
        int low =0;
        int high=n-1;
        while(low<high){
            int mid= low + (high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
