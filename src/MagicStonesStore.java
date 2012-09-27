public class MagicStonesStore {

	public String ableToDivide (int n) {		
		for (int i = 2; i < n + 1; i++) if (isPrime(i) && isPrime((2 * n) - i)) return "YES";
		return "NO";
	}

	public boolean isPrime (int n) {
		for (int i = 2; i <= (int) Math.sqrt(n); i++) if (n % i == 0) return false;
		return true;
	}
}


