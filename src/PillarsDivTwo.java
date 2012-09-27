public class PillarsDivTwo {
	
	double[][] dp;
	
	public double maximalLength(int[] height, int w) {
		int N = height.length;
		dp = new double[height.length][101]; //starts off being all populated to 0
		
		for (int i = N-2; i >= 0; i--) {
			for (int j = 1; j <= height[i]; j++) {
				for (int k = 1; k <= height[i+1]; k++) {

					//comments for pedagogical purposes
					System.out.println("Height of " + (i+1) + " Pillar is " + k);
		        	System.out.println("Height of " + i + " Pillar is " + j);
		        	System.out.println("Value of i is " + i);
		        	
		        	int diff = j-k;
		        	System.out.println("Here is the dp of the previous - dp[i+1][k] => " + "dp[" + (i+1) + "][" + j + "] => " + dp[i+1][k]);
		        	double dist = Math.sqrt( (w*w) + Math.pow(diff, 2)) + dp[i+1][k];
		          	
		        	System.out.println("Current Distance is " + dist);
		        	
		        	if (dist > dp[i][j]) {
		          		System.out.println("Distance has been taken over because dist (" + dist + ") is greater than " + dp[i][j]);
		          		dp[i][j] = dist;
		          		System.out.println("This is the dp[i][j] = " + "dp[" + i + "][" + j + "] => " + dp[i][j]);
		        	}
		        	
		        	else System.out.println("Distance has NOT been taken over because dist (" + dist + ") is less than " + dp[i][j]);
		        	System.out.println("**********************************************************************************");
		        	System.out.println();
				}
				
	        	System.out.println();
	        	System.out.println();
			}
		}
		
		double max = 0;
		for (int i = 1; i <= height[0]; i++) {
			max = Math.max(max, dp[0][i]);
		}
		return max;
	}

	public static void main (String[] args) {
		  PillarsDivTwo a = new PillarsDivTwo();
		  int[] b = {4, 2, 3, 5};
		  int c = 2;
		  
		  double result = a.maximalLength(b, c);
		  
		  System.out.println("Result: " + result);
	  }
}