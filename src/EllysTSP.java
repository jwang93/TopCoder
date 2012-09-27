
public class EllysTSP {
	
	public int getMax(String places) {
		
		int numC = 0; int numV = 0;
		
		for (int i = 0; i < places.length(); i++) {
			if (places.charAt(i) == 'C') numC++;
			else numV++;
		}
				
		if (numC == 0 && numV == 0) return 0;
		if (numC == 0 || numV == 0) return 1;
		
		int dif = Math.abs(numC - numV);
		
		if (dif > 1) {
			int ret = 0; int min = Math.min(numC, numV); int max = Math.max(numV, numC);
			min--; ret++; max = max - 2; ret = ret + 2;
			return ret + 2*min;
		}
		
		return numC + numV;
	
	}
	
	public static void main (String[] args) {
		EllysTSP a = new EllysTSP();
		String test = "VVVCVVVVVCCVCCVVVCCVCVCVVVCCCCVCCVCVCVCVVVVCVCVVVV";
		System.out.println(a.getMax(test));
	}

}
