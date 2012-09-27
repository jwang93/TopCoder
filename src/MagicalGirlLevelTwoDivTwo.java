import java.util.ArrayList;

public class MagicalGirlLevelTwoDivTwo {
	
	public class Point {
	    public int x = 0;
	    public int y = 0;
	    //constructor
	    public Point(int a, int b) {
	        x = a;
	        y = b;
	    }
	}
	
	public String isReachable(int[] jumpTypes, int x, int y) {
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(0,0));
		Point end = new Point(x, y);
		
		int count = 0;
		
		for (int p = 0; p < list.size(); p++) {
			
			
			//System.out.println("# of points: " + list.size());
			
			for (int i = 0; i < 8; i++) {
				for (int m = 0; m < jumpTypes.length; m++) {
					int[] dx = {jumpTypes[m], jumpTypes[m], -jumpTypes[m], -jumpTypes[m], 1, 1, -1, -1}; 
					int[] dy = {1, -1, 1, -1, jumpTypes[m], -jumpTypes[m], jumpTypes[m], -jumpTypes[m]};
					Point v = new Point((list.get(p).x + dx[i]), (list.get(p).y + dy[i]));
					if (Math.abs(v.x) > 30 || Math.abs(v.y) > 30) {
						continue;
					}
					list.add(v);
				}
			}
			
			System.out.println("List size on iteration " + count + " is " + list.size());
			for (int q = 0; q < list.size(); q++) {
				System.out.print("(" + list.get(q).x + ", " + list.get(q).y + ") //  ");
			}
			
			
			
			for (int j = 1; j < list.size(); j++) {
				double temp = distance(list.get(j), end);
				if (temp == 0.0) return "YES";
				double min = 0;
				if (temp > min) {
					list.remove(list.get(j));	
					System.out.println("Removed!");
				}
			}
			
			count++;
			if (count == 5) break;
		}
			
		return "NO";
	}
	
	
	/**
	 * @param a = point a
	 * @param b = point b
	 * @return = the distance between two points 
	 */
	public double distance (Point a, Point b) {
		int dx = (int) Math.pow((a.x - b.x), 2);
		int dy = (int) Math.pow((a.y - b.y), 2);
		return Math.sqrt(dx + dy);
	}
	
	public ArrayList<Point> cleanup (ArrayList<Point> a, Point end) {
		
		double min = (double) Integer.MAX_VALUE;
		Point ret = null;
		
		for (int b = 0; b < a.size(); b++) {
			double dist = distance(a.get(b), end);
			if (dist < min) {
				min = dist;
				ret = a.get(b);
			}
		}
		
		ArrayList<Point> r = new ArrayList<Point>();
		r.add(ret);
		return r;
	}
	
	public static void main (String[] args) {
		MagicalGirlLevelTwoDivTwo a = new MagicalGirlLevelTwoDivTwo();
		int[] test = {3};
		System.out.println(a.isReachable(test, 5, 4));
	}
	
}
