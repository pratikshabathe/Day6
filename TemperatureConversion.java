package bl.com.day6;

import java.util.Scanner;

public class TemperatureConversion {
	
	public static void main(String[] args) {
		double f;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose type of Conversion \n 1. Fahrenheit to Celsius  \n 2. celsious to Fahrenheit");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: 
			System.out.println("Enter Fahrenheit temperature");
			f = sc.nextDouble();
			c = (f-32)*5/9;		
			System.out.println("Celsious temperature is = " +c);	
			break;
		
		case 2: 
			System.out.println("Enter Celsious temperature");
			c = sc.nextDouble();
			f = (c*9/5) + 32 ;	
			System.out.println("Fahrenheit temperature is = " +c);	
			break;
			
			default: 
				System.out.println("choose valid choice");
		}
	}
}
