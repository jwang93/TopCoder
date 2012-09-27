
public class TwoRectangles {
	public String describeIntersection(int[] A, int[] B) {
		//critical numbers: x_left, y_bottom, x_right, y_top
		
		//a = A[0], b = A[1], c = A[2], d = A[3]
		//e = B[0], f = B[1], g = B[2], h = B[3] 

		int a = helper(Math.max(A[0], B[0]) - Math.min(A[2], B[2]));
		int b = helper(Math.max(A[1], B[1]) - Math.min(A[3], B[3]));
		
		//a value of -1 for a means that the x intervals are not synced up 
		//a value of -1 for b means that the y intervals are not synced up
		//you could very well have the x values synced up and have the y values not and thus have none 
		
		System.out.println("Value of a: " + a + "    // Value of b: " + b);
		if (a == 1 && b == 1) return "rectangle";
		if (a == -1 || b == -1) return "none";
		if (a == 0 && b == 0) return "point";
		return "segment";
		
	}
	
	public int helper (int diff) {
		if (diff < 0) return 1; //good
		if (diff > 0) return -1; // bad --> it means that no intersection 
		return 0; //point
	}

	public static void main (String[] args) {
		TwoRectangles a = new TwoRectangles();
		int[] b = {1, 1, 2, 2};
		int[] c = {3, 1, 4, 2};
		System.out.println(a.describeIntersection(b, c));
	}
}
