package Practice2;
public class CoinChange {

    public static int countWaysToMakeChange(int[] coins, int amount) {
        return countWaysRecursive(coins, amount, coins.length - 1);
    }

   
    private static int countWaysRecursive(int[] coins, int amount, int index) {
      
        if (amount == 0) {
            return 1;
        }
        
       
        if (amount < 0 || index < 0) {
            return 0;
        }

       
        int includeCurrentCoin = countWaysRecursive(coins, amount - coins[index], index);

      
        int excludeCurrentCoin = countWaysRecursive(coins, amount, index - 1);

       
        return includeCurrentCoin + excludeCurrentCoin;
    }

  
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;

        int result = countWaysToMakeChange(coins, amount);
        System.out.println("Number of ways to make change for " + amount + ": " + result);
    }
}
