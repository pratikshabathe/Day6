package bl.com.day6;

import java.util.Scanner;

public class MonthlyPayment {
	
	static double Payment(double p, double r , double n) {
		double m = (p*r) / (1 -Math.pow(1 + r, -n));
		m = Math.round(m*100) / 100;
		return m;
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter principle amount :");
		double a = sc.nextDouble();
		System.out.println("Enter rate of interast :");
		double b = sc.nextDouble();
		b = (b/100)/12;
		System.out.println("Enter time period in year :");
		double c = sc.nextDouble();
		c = c*12;
		double pay = Payment(a, b, c);
		System.out.println("Payment :" +pay);
	}
}
