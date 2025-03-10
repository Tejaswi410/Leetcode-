package leetcode_que.Arrays;
//https://leetcode.com/problems/kth-missing-positive-number

public class kth_missing_positive_no {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int  high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
}
