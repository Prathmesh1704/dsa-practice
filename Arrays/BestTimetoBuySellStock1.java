import java.util.Scanner;

public class BestTimetoBuySellStock1 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int buy = prices[0];
        int profit = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } 
            else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
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

        BestTimetoBuySellStock1 obj = new BestTimetoBuySellStock1();
        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);

        sc.close();
    }
}
