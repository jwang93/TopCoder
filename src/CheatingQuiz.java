
/**
 * @author jaywang
 * a smarter way to implement would have been to use sets 
 */

public class CheatingQuiz {
	
	public int[] howMany(String answers) {
		
		int numA = 0, numB = 0, numC = 0;
		for (int i = 0; i < answers.length(); i++) {
			char cur = answers.charAt(i);
			if (cur == 'A') numA++; else if (cur == 'B') numB++; else if (cur == 'C') numC++;
		}
		
		int[] ret = new int[answers.length()];
		for (int i = 0; i < ret.length; i++) {
			char cur = answers.charAt(i);
			if (numA > 0 && numB > 0 && numC > 0) {
				ret[i] = 3;
				if (cur == 'A') numA--; else if (cur == 'B') numB--; else if (cur == 'C') numC--; continue;
			}
			if ((numA == 0 && numB > 0 && numC > 0) ||
					(numB == 0 && numA > 0 && numC > 0) ||
					(numC == 0 && numB > 0 && numA > 0)) {
				ret[i] = 2;
				if (cur == 'A') numA--; else if (cur == 'B') numB--; else if (cur == 'C') numC--; continue;

			}
			ret[i] = 1;
			if (cur == 'A') numA--; else if (cur == 'B') numB--; else if (cur == 'C') numC--;
		}
		return ret;
	}
	
	public static void main (String[] args) {
		CheatingQuiz a = new CheatingQuiz();
		String test = "CBACBACBAABCCAABABBCACBBCABCABCACAABBBCABBBBBBCCCC";
		int[] result = a.howMany(test);
		System.out.print("[" + result[0] + ", ");
		for (int i = 1; i < result.length - 1; i++) {
			System.out.print(result[i] + ", ");
		}
		System.out.print(result[result.length-1] + "]");
	}

}
