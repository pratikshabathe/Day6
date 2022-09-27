package bl.com.day6;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to generate primes");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			boolean isPrime = true;
			
			for (int k = 2; k <= Math.sqrt(i); k++) {
				if (i % k ==0) {
					isPrime = false;
					break;				
				}
			}
			if(isPrime) {System.out.println(i + " ");
		}
			
		}	
	}
}