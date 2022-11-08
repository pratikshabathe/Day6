package bl.com.day6;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {

		int m = 0;
		Scanner scanner = new Scanner(System.in);
		boolean keepGoing = true;
		
		while(keepGoing) {
			System.out.println("Month");
			m = scanner.nextInt();
			if(m < 1 || m>=12) {
			System.out.println("Months are between 1 and 12");
			}
			
			System.out.println("Day");
			int d = scanner.nextInt();
			if (d < 1 || d > 31) {
				System.out.println("Day are between 1 and 31");
				
		}

	       System.out.println("Year");
	       int y = scanner.nextInt();
	         if (y < -10000 || y > 10000) {
	            System.out.println("Years are between -10000 and 10000");
	         
	         }
		
	        
			int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 +y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + 31 * m0 / 12) % 7;  
	        boolean c = ( 1<= d0 && d0 <= 6);
	        
	        String b = null;
	          if (c) {
	             b = "Sunday";
	          } else {
	            if (c) {
	               b = "Monday";
	            } else {
	              if (c) {
	                 b = "Tuesday";
	            } else {
	              if (c) {
	                 b = "Wednesday";
	              } else {
	                if (c) {
	                   b = "Thursday";
	                } else {
	                  if (c) {
	                     b = "Friday";
	                  } else {
	                    if (c) {
	                       b = "Saturday";
	                    }                 
	                   }
	                  }
	               }
	             }
	             }
	          }
			System.out.println("The day of the week is " +b);
	    }

	}

}
