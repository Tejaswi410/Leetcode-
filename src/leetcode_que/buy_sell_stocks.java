package leetcode_que;

public class buy_sell_stocks {
    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        //buy_sell_stocks(stocks);
        buy_sell_stocks_another_approach(stocks);
    }

    public static void buy_sell_stocks(int[] stocks){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<stocks.length;i++){
            if(buyprice < stocks[i]){
                int profit = stocks[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = stocks[i];
            }
        }
        System.out.println(maxprofit);
    }

    public static void buy_sell_stocks_another_approach(int[] stocks){
        int buyprice = stocks[0];
        int profit = 0;
           for(int i=0;i<stocks.length;i++){
               if(stocks[i] < buyprice){
                   buyprice = stocks[i];
               }
               else if ((stocks[i] - buyprice)>profit){
                    profit = stocks[i] - buyprice;
               }
           }
        System.out.println(profit);
    }

}
