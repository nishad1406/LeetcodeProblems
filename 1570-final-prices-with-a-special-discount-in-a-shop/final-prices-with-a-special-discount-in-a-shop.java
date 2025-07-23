class Solution {
    public int[] finalPrices(int[] prices) {
        int [] splPrices= new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int finalPrice=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=finalPrice){
                    finalPrice=finalPrice-prices[j];
                    break;
                }
            }
            splPrices[i]=finalPrice;
        }
        return splPrices;
    }
}