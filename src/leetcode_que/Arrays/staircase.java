package leetcode_que.Arrays;
//https://leetcode.com/problems/arranging-coins?envType=problem-list-v2&envId=binary-search

public class staircase {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long ans = 0;
        while(start <= end){
            long mid = start + (end - start)/2;
            long coins_needed =(mid * (mid +1))/2;
            if(coins_needed <= n){
                ans = mid;
                start = mid + 1;
            }
            else if(coins_needed > n){
                end = mid - 1;
            }
        }
        return (int)ans;
    }
}
