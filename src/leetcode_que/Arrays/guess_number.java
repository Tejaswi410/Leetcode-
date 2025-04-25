package leetcode_que.Arrays;
//https://leetcode.com/problems/guess-number-higher-or-lower?envType=problem-list-v2&envId=binary-search

public class guess_number {
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(guess(mid) == -1){
                high = mid - 1;
            }
            else if(guess(mid) == 1){
                low = mid + 1;
            }
            else return mid;
        }
        return low;
    }
}
