package daily_que;
import java.util.*;
//https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum?envType=daily-question&envId=2025-02-25

public class feb_25 {
    public int numOfSubarrays(int[] arr) {
        int mod = (int)(Math.pow(10,9) + 7);
        int ans = 0;
        int even = 1;
        int odd = 0;
        int prefix = 0;
        for(int num: arr){
            prefix += num;
            if(prefix % 2 == 0){
                ans += odd;
                even++;
            }
            else{
                ans += even;
                odd++;
            }
            ans %= mod;
        }
        return ans;
    }
}
