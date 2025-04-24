package leetcode_que.Arrays;
//https://leetcode.com/problems/sqrtx

public class sqrt_of_x {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while(left < right){
            int mid = (left + right + 1) >>> 1;
            if(mid <= x/mid){
                left = mid;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }
}
