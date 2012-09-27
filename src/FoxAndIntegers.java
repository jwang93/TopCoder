
public class FoxAndIntegers {

	public int[] get(int AminusB, int BminusC, int AplusB, int BplusC) {
		
		for (int A = -100; A <= 100; A++) {
			for (int B = -100; B <= 100; B++) {
				for (int C = -100; C <= 100; C++) {
					if (AminusB == A-B && BminusC == B-C && AplusB == A+B && BplusC == B+C) {
						return new int[]{A, B, C};
					}
				}
			}
		}
		
		return new int[0];
	}
	
	public static void main (String[] args) {
		FoxAndIntegers a = new FoxAndIntegers();
		
	}

}
