package leetcode_que;

public class MaxWealthLC {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int p= 0; p<accounts.length;p++){
            int rowsum = 0;
            for(int acc =0; acc<accounts[p].length;acc++){
                rowsum += accounts[p][acc];
            }
            if(rowsum > max)
                max = rowsum;


        }
        return max;

    }
}
