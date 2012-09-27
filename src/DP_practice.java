
/*
 * try to implement a solution that will find the minimum number of coins needed to sum to a number B 
 * the coins you have are 1, 3, 5 and they are given in an array V, V0 = 1, V1 = 3, etc... 
 * 
 */

public class DP_practice {
	
	public int calc(int sum, int[] vals) {
		
		int[] dp = new int[sum+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		
		dp[0] = 0;
		for (int i = 0; i < sum+1; i++) {
			for (int p = 0; p < dp.length; p++) {
				System.out.print(dp[p] + ", ");
			}
			System.out.println("");
			for (int j = 0; j < vals.length; j++) {
				if (vals[j] == i) dp[i] = 1;
				if (vals[j] < i) {
					if ((dp[i-vals[j]] + 1) < dp[i]) { //i think you are adding 1 for the coin vals[j] 
						dp[i] = dp[i-vals[j]] + 1;
 					}
				}
			}
		}
		return dp[sum];
	}
	
	
	public static void main (String[] args) {
		DP_practice a = new DP_practice();
		int sum = 11;
		int[] vals = {1, 3, 5};
		System.out.println("___________________");
		System.out.println("Here is the result: " + a.calc(sum, vals));
	}

}
