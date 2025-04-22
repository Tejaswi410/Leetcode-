package leetcode_que.Strings;
//https://leetcode.com/problems/sum-of-beauty-of-all-substrings

public class sum_of_beauty_of_all_substrings {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                int max = 0;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }
                ans += (max - min);
            }
        }
        return ans;
    }
}
