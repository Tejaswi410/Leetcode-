package leetcode_que.Arrays;
//https://leetcode.com/problems/plus-one
//we know digits[i] can be 0-9 so we have three conditions:
//1. If digits[i] < 9 then just add 1 to it and return.
//2. If digits[i] == 9 then update it to 0 and for loop is running from n-1 to 0 ,so it will take care of the rest.
//3. If digits contains all the digits as 9 then we'll make another array and update its 0th index to 1 and return the new array.

public class plus_one {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] New = new int[n+1];
        New[0] = 1;
        return New;
    }
}
