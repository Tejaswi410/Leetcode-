package daily_que;
//https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n?envType=daily-question&envId=2025-02-19

public class feb_19 {
    String res;
    int count;

    public String getHappyString(int n, int k) {
        count = 0;
        res = "";
        backtrack(n, k, new StringBuilder(""));
        return res;
    }

    public boolean backtrack(int n, int k, StringBuilder cur) {
        if (cur.length() == n) {
            count++;
            if (count == k) {
                res = cur.toString();
                return true;
            }
            return false;
        }
        for (char ch = 'a'; ch <= 'c'; ch++) { // 2
            int len = cur.length();
            if (len > 0 && cur.charAt(len - 1) == ch)
                continue;
            cur.append(ch);
            if (backtrack(n, k, cur)) {
                return true;
            }
            cur.deleteCharAt(cur.length() - 1);
        }
        return false;
    }
}
