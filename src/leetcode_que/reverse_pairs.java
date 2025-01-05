package leetcode_que;
import java.util.*;
//https://leetcode.com/problems/reverse-pairs

public class reverse_pairs {
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
    }
/*array is divided into low to mid and mid+1 to high , left starts from low to mid and right starts from mid+1 to high
everytime array gets divided into parts and count the reverse pairs and gets sorted by merge sort .so in countpairs func
for every i we are going to check the second part of array i.e. mid+1 to high that if there exists nums[i] > 2*nums[right]
basically i<2*j . this is the whole idea to count the reverse pairs
 */
  public int countpairs(int[] nums,int low ,int mid,int high){
        int right = mid+1;
        int cnt = 0;
        for(int i = low ;i <= mid; i++){
            while(right <= high && (long)nums[i] > 2L*nums[right]) right++;
            cnt = cnt + (right -(mid+1));  /*it counts the elements that is already a reverse pair of some element and avoids counting it again.
            for e.g. if [15,17,18,20] and [2,4,5,6,7,9,12,13] - if 2,4,5,6,7 has reverse pair with 15 then they will have for 17,18,20 also so it avoids to count it again and again
                 */
        }
        return cnt;
    }

    public  int mergeSort(int[] nums, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(nums, low, mid);
        cnt += mergeSort(nums, mid + 1, high);
        cnt += countpairs(nums, low, mid, high);
        merge(nums,low,mid,high);
        return cnt;
    }

    public void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
