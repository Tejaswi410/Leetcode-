package daily_que;
//https://leetcode.com/problems/clear-digits?envType=daily-question&envId=2025-02-10

public class feb_10 {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for( char c: s.toCharArray()){
            if(Character.isDigit(c)){
                res.deleteCharAt(res.length() - 1);
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
