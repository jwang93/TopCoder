import java.util.ArrayList;


public class AkariDaisukiDiv2 {
	
	
	public int countTuples(String S) {
		
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> d = new ArrayList<String>();
		
		for (int startFirst = 1; startFirst < S.length(); startFirst++) {
			for (int startSecond = startFirst + 1; startSecond < S.length(); startSecond++) {
				for (int length = 1; length < S.length(); length++) {
					if (startFirst + length > startSecond || startSecond + length >= S.length()) {
						break;
					}
					
					String A = S.substring(0, startFirst);
					String X1 = S.substring(startFirst, startFirst + length);
					String B = S.substring(startFirst + length, startSecond);
					String X2 = S.substring(startSecond, startSecond + length);
					String C = S.substring(startSecond + length);
					
					if (!X1.equals(X2)) continue;
					
					boolean was = false;
					
					for (int i = 0; i < a.size(); i++) {
						if (a.get(i).equals(A) && b.get(i).equals(B) && c.get(i).equals(C) && d.get(i).equals(X2)) {
							was = true;
							break;
						}
						
						if (A.equals("") || B.equals("") || C.equals("") || X1.equals("")) {
							was = true;
							break;
						}
					}
					
					if (!was) {
						a.add(A); b.add(B); c.add(C); d.add(X1);
					}
				}
			}
		}
		
//		for (int i = 0; i < a.size(); i++) {
//			System.out.println("Here is A: " + a.get(i) + ", B: " + b.get(i) + ", C: " + c.get(i) + ", D: " + d.get(i));
//		}
		
		return a.size();
		
	}
	
	
	public static void main (String[] args) {
		AkariDaisukiDiv2 a = new AkariDaisukiDiv2();
		int b = a.countTuples("abaaaaaxxaaaaabbaaaaaaaaaxxaabaaaaxxaaaxaaaaxx");
		System.out.println(b);
	}

}
