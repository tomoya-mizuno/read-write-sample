package sample;

import java.util.Scanner;

public class TodaysAlgorithm4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int restMoney = 1000 - Integer.parseInt(sc.nextLine());
		
		System.out.println(countCoins(restMoney));
		
		sc.close();
	}
	
	public static int countCoins(int money) {
		if (money < 1 || money >= 1000) return 0;
		
		int coinCount = 0;
		
		while (money > 0) {
			if (money >= 500) {
				money -= 500;
				coinCount++;
			} else if (money >= 100) {
				money -= 100;
				coinCount++;
			} else if (money >= 50) {
				money -= 50;
				coinCount++;
			} else if (money >= 10) {
				money -= 10;
				coinCount++;
			} else if (money >= 5) {
				money -= 5;
				coinCount++;
			} else {
				money -= 1;
				coinCount++;
			}
		}
		return coinCount;
	}
}
