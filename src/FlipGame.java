
public class FlipGame {

	public int minOperations(String[] board) { //code works but the complexity is too slow 
		
		int operations = 0;
		while (!isBoardZero(board)) {
			int a = 0;
			for (int i = 0; i < board.length; i++) {
				String s = board[i];
				a = findRightmostOne(s) >= a ? findRightmostOne(s) : a;
				//System.out.println(s);
				s = modifyString(s, a);
				board[i] = s;
				//System.out.println(s);
				//System.out.println(board[0] + ", " + board[1] + ", " + board[2]);
			}
			operations++;	
		}
		return operations;
	}
	
	
	public String modifyString(String s, int place) {
		if (place == -1) return s;
		String newStr = "";
		for (int i = 0; i <= place; i++) {
			if (s.charAt(i) == '0') newStr += '1';
			else newStr += '0';
		}
		return newStr + s.substring(place + 1);
	}
	
	public int findRightmostOne(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') return i;
		}
		return -1;
	}
	
	public boolean isBoardZero(String[] board) {
		for (String s : board) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != '0') {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main (String[] args) {
		FlipGame a = new FlipGame();
		String[] board = 	{"000000000000001100000000000000", "000000000000011110000000000000", "000000000000111111000000000000", "000000000001111111100000000000", "000000000011111111110000000000", "000000000111111111111000000000", "000000001100111111001100000000", "000000011000011110000110000000", "000000111100111111001111000000", "000001111111111111111111100000", "000011111111111111111111110000", "000111111111000000111111111000", "001111111111100001111111111100", "011111111111110011111111111110", "111111111111111111111111111111"};
		System.out.println("Solution: " + a.minOperations(board));
	}
}
