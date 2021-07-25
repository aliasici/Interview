package LeetCode.forloop;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {2,5,6,8};

        System.out.println("maxProfit(prices) = " + maxProfit(prices));

    }

    public static int maxProfit(int[] prices){

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
            }else {
                max = Math.max(max, prices[i] - min);
            }

        }
        return max;
    }
}
