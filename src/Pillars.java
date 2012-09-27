import java.util.HashMap;
import java.util.Map;

//deal with something called loss of generality
public class Pillars {

/*
	public double getExpectedLength(int w, int x, int y) {
		
		Map <String, Double> memo = new HashMap<String, Double>();
		double count = 0.0;
		
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				String key = getKey(i, j);
				String old_key = getKey(i-1, j-1);
				double diff = i - j;
				if (!memo.containsKey(old_key)) {
					memo.put(key, getDist(diff, w));
				}
				else {
					memo.put(key, memo.get(old_key));
					memo.remove(old_key);
				}
				count += memo.get(key);
			}
		}
		
		return count / (double)(x*y);
	}
	
	public double getDist(double diff, int width) {
		return Math.sqrt(Math.pow(diff, 2) + Math.pow(width, 2));
	}
	
	public String getKey(int a, int b) {
		return "key" + a + "," + b;
	}
*/

	 double[] cache = new double[123456];
	  public double getExpectedLength(int w, int x, int y) {
	    int a = Math.min(x, y);
	    int b = Math.max(x, y);
	    System.out.println("Value of a: " + a + " , Value of b: " + b);
	    for (int i = 1; i <= b; i++) {
	      cache[i] = cache[i-1] + getDist(i, w);
	      System.out.println("Value of cache[" + i + "] ==> " + cache[i]);
	    }
	    double rez = 0;
	    for (int i = 1; i <= a; i++) {
		 System.out.println("Value of cache[" + i + "-1] ==> " + cache[i-1]);
	      System.out.println("Value of cache[b-" + i + "] ==> " + cache[b-i]);

	      rez += cache[i-1] + w + cache[b - i];
	      System.out.println("Value of rez: " + rez);
	    }
	    rez /= x;
	    rez /= y;
	    return rez;
	  }

		public double getDist(double diff, int width) {
			return Math.sqrt(Math.pow(diff, 2) + Math.pow(width, 2));
		}
	  
	public static void main (String[] args) {
		Pillars p = new Pillars();
		int[] a = {1, 1, 2, 10, 1000};
		int[] b = {1, 5, 3, 15, 100000};
		int[] c = {1, 1, 15, 23, 100000};
		for (int i = 0; i < a.length; i++) {
			//System.out.println(p.getExpectedLength(a[i], b[i], c[i]));
		}
		System.out.println(p.getExpectedLength(3, 3, 3));
		
	}
}
