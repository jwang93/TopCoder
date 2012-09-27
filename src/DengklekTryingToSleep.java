import java.util.Arrays;

public class DengklekTryingToSleep {
 
  public int minDucks(int[] ducks) {
    Arrays.sort(ducks);
    return ducks[ducks.length - 1] - ducks[0] - ducks.length + 1;
  }
  
  public static void main (String[] args) {
	  DengklekTryingToSleep a = new DengklekTryingToSleep();
	  int[] b = {95, 35, 24, 43, 73, 38, 12, 41, 44, 100, 89, 36, 26, 39, 34, 
			  74, 83, 68, 16, 19, 93, 60, 67, 48, 86, 33, 2, 50, 97, 80, 29, 92, 
			  85, 71, 23, 17, 42, 70, 98, 65};
	  System.out.println(a.minDucks(b));
	  
  }
 
}