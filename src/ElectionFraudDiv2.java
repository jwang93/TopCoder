
public class ElectionFraudDiv2 {
	
	public String IsFraudulent(int[] percentages) {
		double sum = 0.0, countNotZero = 0.0;
		for (Integer i : percentages) {
			sum += (double)i;
			if (i != 0) countNotZero++;
		}
		if (sum > 100.0) return (sum - countNotZero * 0.5 > 100.0) ? "YES" : "NO";
		else if (sum < 100.0) return (sum + (double)percentages.length * 0.49 < 100.0) ? "YES" : "NO";
		return "NO";
	}
	
	public static void main (String[] args) {
		ElectionFraudDiv2 a = new ElectionFraudDiv2();
		int[] test0 = {6, 0, 3, 2, 5, 4, 6, 2, 0, 0, 0, 3, 2, 3, 1, 0, 3, 2, 0, 4, 0, 0, 2, 0, 0, 2, 3, 0, 2, 3, 5, 1, 4, 0, 4, 5, 0, 3, 0};
		int[] test1 = {2, 5, 3, 2, 3, 3, 3, 1, 0, 2, 2, 0, 1, 4, 2, 3, 2, 2, 1, 1, 1, 2, 1, 1, 1, 2, 5, 3, 1, 1, 1, 3, 2, 3, 2, 4, 3, 1, 1, 0};
		int[] test2 = {2, 2, 2, 0, 1, 3, 0, 2, 2, 0, 1, 0, 0, 1, 0, 2, 2, 0, 3, 1, 1, 3, 2, 2, 2, 5, 1, 2, 2, 1, 2, 2, 2, 2, 5, 1, 0, 0, 5, 3, 4, 2, 5};
		int[] test3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 26, 0, 0, 0, 0, 15, 0, 0, 0, 17};
		int[] test4 = {0, 34, 34, 34};
		int[] test5 = {52, 52, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		System.out.println(a.IsFraudulent(test0));
		System.out.println(a.IsFraudulent(test1));
		System.out.println(a.IsFraudulent(test2));
		System.out.println(a.IsFraudulent(test3));
		System.out.println(a.IsFraudulent(test4));
		System.out.println(a.IsFraudulent(test5));

	}
}
