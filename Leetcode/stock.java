public class stock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int[] prices2={2,3,4,5,6,4};
        System.out.println(stock(prices));
    }
    static int stock(int[] prices){
        int buy=prices[0];
        int profit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i]-buy;
            }
        }
        return profit;
    }
}
