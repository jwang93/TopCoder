
public class RainyRoad {

	public String isReachable(String[] road) {
		
		for (int i = 0; i < road[0].length(); i++) if (road[0].charAt(i) == 'W' && road[1].charAt(i) == 'W') return "NO";
		return "YES";
	}
	
	public static void main (String[] args) {
		RainyRoad a = new RainyRoad();
		String[] test = 	{".W..W..", "...WWW."}	;
		System.out.println(a.isReachable(test));
	}
}

