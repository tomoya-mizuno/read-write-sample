package sample;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(generateFibonacci(8));
	}
	
	public static int generateFibonacci(int n) {
		int an = 0;
		if (n == 0) {
			an = 0;
		}
		if (n == 1) {
			an = 1;
		}
		if (n >= 2) {
			an = generateFibonacci(n - 1) + generateFibonacci(n - 2);
		}
		return an;
	}
}
