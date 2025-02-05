package daily_que;
import java.util.*;
//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal?envType=daily-question&envId=2025-02-05

public class fifth_feb {
    public boolean areAlmostEqual(String s1, String s2) {
        int mismatchCount = 0;
        char firstCharFromS1 = 0, firstCharFromS2 = 0;

        for (int i = 0; i < s1.length(); ++i) {
            char charFromS1 = s1.charAt(i), charFromS2 = s2.charAt(i);
            if (charFromS1 != charFromS2) {
                if (++mismatchCount > 2 ||
                        (mismatchCount == 2 && !(charFromS1 == firstCharFromS2 && charFromS2 == firstCharFromS1))) {
                    return false;
                }
                firstCharFromS1 = charFromS1;
                firstCharFromS2 = charFromS2;
            }
        }
        return mismatchCount != 1;
    }
}

