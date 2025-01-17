package leetcode_que;
import java.util.*;
//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets

public class min_days_to_make_bouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;  //using long to prevent overflow
        int n = bloomDay.length;
        if (val > n) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0 ;i < n ;i++){
            low = Math.min(low , bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(bloomDay,mid,m,k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean possible(int[] arr,int day,int m,int k){
        int n = arr.length;
        int cnt = 0;
        int nofb = 0;  //no. of bouquets
        for (int i = 0;i < n;i++){
            if(arr[i] <= day){  //if the curr ind is less than or equal to day it means flower is already bloomed hence increase the cnt
                cnt++;
            }
            else{
                nofb += (cnt/k);
                cnt = 0;
            }
        }
        nofb += (cnt/k);
        if (nofb >= m) return true;
        else{
            return false;
        }
    }
}
}
