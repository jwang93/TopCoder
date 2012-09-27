import java.util.Arrays;

public class UnsortedSequence {
	
	public int[] getUnsorted (int[] s) {
		int i = 0;
		Arrays.sort(s);
		if (s.length == 0 || s[0] == s[s.length - 1]) return new int[0];
		while (s[i+1] != s[s.length - 1]) i++;
		int save = s[s.length - 1];		
		s[i+1] = s[i];
		s[i] = save;		
		return s;
	}
	
	public static void main (String[] args) {
		UnsortedSequence a = new UnsortedSequence();
		int[] b = {549, 630, 624, 85, 955, 757, 841, 967, 377, 932, 309, 945, 440, 627, 324, 538, 539, 119, 83, 930, 542, 834, 116, 640, 659, 705, 931, 978, 307, 674, 387, 22, 746, 925, 73, 271, 830, 778, 574, 98, 513, 987, 291, 162};
		int[] result = (a.getUnsorted(b));
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
	}
}
