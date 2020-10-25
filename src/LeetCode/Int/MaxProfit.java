package LeetCode.Int;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,2,5,4,3,6,1};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i =0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
           }else{
                max = Math.max(max, prices[i] -min);
            }
        }
        return max;
    }
}
