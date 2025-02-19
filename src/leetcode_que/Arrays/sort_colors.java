package leetcode_que.Arrays;
//https://leetcode.com/problems/sort-colors
public class sort_colors {
    //colors in the form of numbers ...primarily 0,1 and 2
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low =0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if (nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }

    public void swap(int arr[],int x,int y){
        int temp =  arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
