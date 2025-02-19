package leetcode_que.Arrays;
//https://leetcode.com/problems/search-a-2d-matrix?envType=problem-list-v2&envId=array
public class search_in_2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while ( i>=0 && j<matrix[0].length) {
            if (matrix[i][j] == target) {
                return true;
            } else if (target < matrix[i][j]) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
}
