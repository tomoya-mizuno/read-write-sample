package sample;

public class TodaysAlgorithm3 {
	public static void main(String[] args) {
		int k = 3;
		int s = 6;
		
		System.out.println(countPatterns(k, s));
	}
	
	public static int countPatterns(int k, int s) {
		if (k < 2 || k > 2500) return 0;
		if (s < 0 || s > 3 * k) return 0;
		
		int count = 0;
		
		for (int x = 0; x <= k; x++) {
			for (int y = 0; y <= k; y++) {
				for (int z = 0; z <= k; z++) {
//					System.out.println(x + " " + y + " " + z);
					if (x + y + z == s) count++;
				}
			}
		}
		return count;
	}
}
