
public class BoardSplitting {
	
	public int minimumCuts (int desiredLength, int desiredCount, int actualLength) {
		int count = 0, remains = 0, cuts = 0;
		int i = 1;
		while (count < desiredCount) {
			
			//desiredLenth = 5, desiredCount = 4, actualLength = 4
			System.out.println("Iteration: " + i + " , Remains: " + remains + " Count: " + count);
			while (remains < desiredLength) {
				remains += actualLength;
				System.out.println("Remains are ramping up to: " + remains);
			}
			
			//regardless of whether you execute the if or the else, you will have a desiredLength chunk 
			if (remains == desiredLength) {
				remains = 0;
			}
			
			else {
				remains -= desiredLength; //you cut out a desiredLength chunk for yourself 
				cuts++;
			}
			
			count++;
			i++;
		}
	
		return cuts;
	}
	
	public static void main (String[] args) {
		BoardSplitting a = new BoardSplitting();
		int d = 6, b = 100, c = 3;
		System.out.println(a.minimumCuts(d, b, c));
		
	}

}
