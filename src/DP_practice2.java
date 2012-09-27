import java.util.Random;


/*
 * problem statement:
 * A table composed of N x M cells, each having a certain quantity of apples, is given. 
 * You start from the upper-left corner. At each step you can go down or right one cell. 
 * Find the maximum number of apples you can collect. 
 */

public class DP_practice2 {
	
	public int calc (int[][] a) {
		
		int[][] dp = new int[a.length][a[0].length]; //[rows][columns]
		dp[0][0] = a[0][0];

		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				dp[i][j] = a[i][j];
				if (j > 0 && i > 0) dp[i][j] += Math.max(dp[i-1][j], dp[i][j-1]);
				else if (j > 0) dp[i][j] += dp[i][j-1];
				else if (i > 0) dp[i][j] += dp[i-1][j];
			}
		}

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + ", ");
			}
			System.out.println("");
		}	

		System.out.println("");

		
		return dp[a.length-1][a[0].length-1];
	}
	
	public static void main (String[] args) {
		DP_practice2 a = new DP_practice2();
		Random rand = new Random();
		int[][] test = new int[3][3];
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[0].length; j++) {
				test[i][j] = rand.nextInt(10);
				System.out.print(test[i][j] + ", ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println(a.calc(test));
		System.out.println("");

	}

}
