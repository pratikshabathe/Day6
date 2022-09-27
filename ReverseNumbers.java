package bl.com.day6;
import java.util.Scanner;
public class ReverseNumbers {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse order");
		long n = sc.nextLong();
		sc.close();
		long revNum = 0;
		while(n > 0) {
			revNum = (revNum* 10) + n%10;
			n = n/10;
		}	
		System.out.println("revNum =" +revNum);
	}
	
	//OR:-
	//while(n > 0) {
	
	//	byte r = (byte) (n % 10);
	//	revNum = revNum * 10 + r;
	//	n /= 10;
//	}

	//System.out.printf("reverse number %d" , revNum);
//}
}
