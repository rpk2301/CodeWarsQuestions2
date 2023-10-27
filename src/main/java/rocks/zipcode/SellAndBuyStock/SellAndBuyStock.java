package rocks.zipcode.SellAndBuyStock;

public class SellAndBuyStock {


    public static int maxProfit(int[] prices) {
        int maxProf=0;
        for(int i=0;i<prices.length-1;i++)
        {
            for(int z=i+1;z<prices.length;z++)
            {
                if(prices[z]-prices[i]>maxProf)
                {
                    maxProf = prices[z]-prices[i];
                }
            }
        }
        return maxProf;
    }
    }
