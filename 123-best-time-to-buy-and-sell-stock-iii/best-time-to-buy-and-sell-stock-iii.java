class Solution {
    public int maxProfit(int[] prices) {

        int buy1 = Integer.MIN_VALUE ; 
        int buy2 = Integer.MIN_VALUE ; 
        int s1 = 0 ;
        int s2 = 0 ;
        int profit = 0 ;
        for ( int price : prices){
            buy1 = Math.max(buy1 , -price) ;
            s1 = Math.max(buy1 + price , s1);
            buy2  = Math.max(buy2, s1 - price);
            s2 = Math.max(s2, buy2 + price);
        }
        return s2; 
    }
}