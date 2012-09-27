
public class BallAndHats {

	public int getHat(String hats, int numSwaps) {
		if (numSwaps == 0) {
			for (int i = 0; i < hats.length(); i++) {
				if (hats.charAt(i) == 'o') return i;
			}
		}
		
		if (hats.charAt(0) == 'o' || hats.charAt(2) == 'o') {
			if (numSwaps%2 == 0) return 0;
			else return 1;
		}
		
		if (numSwaps%2 == 0) return 1;
		return 0;
	}
	
	public static void main (String[] args) {
		BallAndHats a = new BallAndHats();
		String hats = ".o.";
		int num = 399;
		System.out.println(a.getHat(hats, num));
	}
}
