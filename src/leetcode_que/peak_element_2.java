package leetcode_que;
import java.util.*;
//https://leetcode.com/problems/find-a-peak-element-ii

public class peak_element_2 {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = n - 1;
        int[] ans = { -1, -1 };
        while (low <= high) {
            int mid = (low + high) / 2;
            int col_index = Max_element(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[mid - 1][col_index] : -1;  //checking if left element exists or not if it does then use that element for comparison else use -1
            int right = mid + 1 < n ? mat[mid + 1][col_index] : -1;  //checking if right element exists or not if it does then use that element for comparison else use -1
            if (mat[mid][col_index] > left && mat[mid][col_index] > right) {
                ans[0] = mid;
                ans[1] = col_index;
                break;
            } else if (mat[mid][col_index] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public int Max_element(int[][] arr, int n, int m, int row) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] > max) {
                max = arr[row][i];
                index = i;
            }
        }
        return index;
    }
}
