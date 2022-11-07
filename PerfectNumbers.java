package bl.com.day6;

import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		sc.close();
		
		int factorSum = 1;
		for(int i = 2; i <= n /2; i++) {
			if (n % i == 0) factorSum += i;
		}
		if (factorSum == n) {
			System.out.println(" it is perfect number");
		}else {
			System.out.println("it is not perfect number ");
		}
	}
}
