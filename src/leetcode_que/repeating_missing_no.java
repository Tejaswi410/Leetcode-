package leetcode_que;

public class repeating_missing_no {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = repeating_missing(a);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] repeating_missing(int[] arr){
        int n= arr.length;
        int sn = (n * (n+1))/2;
        int s2n = (n* (n+1) * (2*n+1))/6;
        int s=0,s2=0;
        for(int i=0;i<n;i++){
            s+= arr[i];
            s2 += (arr[i] * arr[i]);
        }
        int val1 = sn - s;//x - y
        int val2 = s2n - s2;//x2 - y2
        val2 = val2/val1;  //because x2-y2 can be written as (x+y)(x-y) so x+y= x2-y2/(x-y)
        int x = (val1 + val2 )/2;  //now x+y and x-y will be added ,and we get 2x = k
        int y = x - val1;
        int[] ans = {x,y};
        return ans;

    }
}
