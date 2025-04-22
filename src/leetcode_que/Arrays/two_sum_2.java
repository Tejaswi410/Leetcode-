package leetcode_que.Arrays;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted?envType=problem-list-v2&envId=binary-search

public class two_sum_2 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int low = 0, high = n-1;
        int[] ans = new int[2];
        while(low <= high){
            int result = numbers[low] + numbers[high];
            if(result < target){
                low++;
            }
            else if(result > target){
                high--;
            }
            else{
                ans[0] = low + 1;
                ans[1] = high + 1;
                break;
            }
        }
        return ans;
    }
}
