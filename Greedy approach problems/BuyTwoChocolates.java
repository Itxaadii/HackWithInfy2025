import java.util.Scanner;
import java.util.Arrays;
public class BuyTwoChocolates {

    public int buyChoco(int[] prices, int money) {
       Arrays.sort(prices);
        int minprice = prices[0];
        int secminprice = prices[1];
        
        if (minprice + secminprice > money) {
            return money;
        }

        return money - (minprice + secminprice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BuyTwoChocolates btc = new BuyTwoChocolates();  // changed from 'Solution' to 'buytwochocolates'

        // Ask user for array size
        System.out.print("Enter number of chocolates (array size): ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        // Take array input
        System.out.println("Enter prices of chocolates:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Take money input
        System.out.print("Enter the amount of money you have: ");
        int money = scanner.nextInt();

        // Call the method and print result
        int result = btc.buyChoco(prices, money);  // use the instance 'btc'
        System.out.println("Remaining money after buying two cheapest chocolates: " + result);

        scanner.close();
    }
}
