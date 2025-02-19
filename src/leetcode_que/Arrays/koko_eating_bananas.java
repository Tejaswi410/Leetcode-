package leetcode_que.Arrays;
//https://leetcode.com/problems/koko-eating-bananas
/* The main idea is to find the maximum no. in the piles of array and now just apply binary search on it to find the total no.of hrs taken by koko
to eat all the bananas.
 */

public class koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(piles[i],max);  //finding the max pile in the array so that we can point the high the pointer to it
        }
        int low = 0;
        int high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(totalhrs(piles,mid) <= h){ // if this satisfies then we got our ans but it may take more hours .... we might get less no. of hrs to eat all the bananas so we trim down our search space and make it low to high= mid -1 as arr is sorted.
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

    }


    /* Here we are just find how much total hrs it will take to eat all piles of bananas if variable(bananas_hourly) is given
    for e.g. if bananas_hourly is 3, and we have piles 3,6,8,10 then it will take 1+2+3+4= 10 hrs in total to eat all the piles
    of bananas.
     */
    public int totalhrs(int[] arr,int bananas_hourly){
        int n = arr.length;
        int total = 0;
        for (int i = 0;i < n ;i++){
            total += Math.ceil((double)arr[i]/(double)bananas_hourly);
        }
        return total;
    }
}
