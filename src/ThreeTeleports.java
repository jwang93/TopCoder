import java.util.ArrayList;
import java.util.Arrays;


public class ThreeTeleports {
	
	public int shortestDistance(int xMe, int yMe, int xHome, int yHome, String[] teleports) {
		
		int best = getTime(xMe, yMe, xHome, yHome);

		for (int i = 0; i < teleports.length; i++) {
				
			printInfo(teleports, xMe, yMe, xHome, yHome);
			String used = teleports[i];
			String[] temp = removeElement(teleports, used);
			String[] t = used.split(" ");
			System.out.println("Recursion Best: " + best);
			int alt = getTime(xMe, yMe, Integer.parseInt(t[0]), Integer.parseInt(t[1])) + 10 + shortestDistance(Integer.parseInt(t[2]), Integer.parseInt(t[3]), xHome, yHome, temp);
			System.out.println("Best: " + best + ", Alt: " + alt);
			best = Math.min(best, alt);
			alt = getTime(xMe, yMe, Integer.parseInt(t[2]), Integer.parseInt(t[3])) + 10 + shortestDistance(Integer.parseInt(t[0]), Integer.parseInt(t[1]), xHome, yHome, temp);
			best = Math.min(best, alt);
		}
		return best;
	}
	
	public void printInfo(String[] teleports, int a, int b, int c, int d) {
		System.out.println("----------------------------------");
		System.out.println("Teleport Info:");
		for (String s : teleports) System.out.println(s);
		System.out.println("Starting coordinate: " + a + ", " + b);
		System.out.println("Ending coordinate: " + c + ", " + d);
		System.out.println("----------------------------------");
	}
	
	public int getTime(int a, int b, int c, int d) {
		return Math.abs(a-c) + Math.abs(b-d);
	}
	
	public String[] removeElement(String[] a, String b) {
		ArrayList<String> temp = new ArrayList<String>(Arrays.asList(a));
		temp.remove(b);
		String[] ret = new String[temp.size()];
		return temp.toArray(ret);
	}
	
	public static void main (String[] args) {
		ThreeTeleports a = new ThreeTeleports();
		String[] c = {"1000 1003 1000 1004", "18 20 1 1", "1000 1005 1000 1006"};
		System.out.println(a.shortestDistance(0, 0, 20, 20, c));

		
	}
}
