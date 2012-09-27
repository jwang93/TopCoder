
public class BinaryPolynomialDivTwo {
	
	public int countRoots(int[] a) {
		if (calc(a, 0) == 0 && calc(a, 1) == 0) return 2; 
		else if (calc(a, 0) == 0 || calc(a, 1) == 0) return 1;
		return 0;
	}
	
	public int calc (int[] a, int b) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) sum += (a[i] * Math.pow(b, i));
		return sum % 2;
	}
	
	public static void main (String[] args) {
		//2, 1, 0, 2, 1
		BinaryPolynomialDivTwo a = new BinaryPolynomialDivTwo();
		int[] test = {0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1};
		int[] test2 = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1};
		int[] test3 = {1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1};
		int[] test4 = {0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
		int[] test5 = {0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1};

		System.out.println(a.countRoots(test));
		System.out.println(a.countRoots(test2));
		System.out.println(a.countRoots(test3));
		System.out.println(a.countRoots(test4));
		System.out.println(a.countRoots(test5));

	}
}
