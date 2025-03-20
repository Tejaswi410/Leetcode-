package daily_que;

public class palindrome_number {
    public boolean isPalindrome(int x) {
        int og = x;
        return isReverse(x) == og;
    }

    public int isReverse(int x){
        int revNum = 0;
        while (x > 0) {
            revNum = revNum * 10 + x % 10;
            x = x / 10;
        }
        return revNum;
    }
}
