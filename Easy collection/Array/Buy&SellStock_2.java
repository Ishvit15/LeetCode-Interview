class BuyAndSellStock_2{
    public int buyAndSellStock_2(int[] prices){
        int profit = 0;
        int days = prices.length;
        for(int i=1; i < days; i++){
            /*
                Eg. [7,1,5,3,4,6]  : Correct output = 7; (5-1) + (6-3) gives us maximum profit
                According to the logic implemented : 
                (5-1) + (4-3) + (6-4) giving us the correct result 
            */
            if(prices[i-1] < prices[i])
                profit = profit + prices[i]-prices[i-1];
        }
    }
}