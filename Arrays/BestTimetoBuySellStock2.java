/* 122 You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day, ensuring you never hold more than one share of the stock.

Find and return the maximum profit you can achieve.

 */

import java.util.Scanner;

public class BestTimetoBuySellStock2 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int buy = prices[0];
        int profit = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            if (prices[i] > buy) {
                profit+=prices[i]-buy;
           
        }buy = prices[i];
    }return profit;

      
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        BestTimetoBuySellStock2 obj = new BestTimetoBuySellStock2();
        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);

        sc.close();
    }
}
