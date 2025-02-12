package daily_que;
//https://leetcode.com/problems/remove-all-occurrences-of-a-substring?envType=daily-question&envId=2025-02-11


public class feb_11 {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s = s.replaceFirst(part,"");
        }
        return s;
    }
}
