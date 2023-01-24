package codes;
import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Year: ");
		int n = s.nextInt();
		
		if(n % 400 == 0) {
			System.out.println(n+" "+"is a Leap Year");
		}else if(n % 4 == 0 && n % 100 != 0) {
			System.out.println(n+" "+"is a Leap Year");
		}else {
			System.out.println(n+" "+"is not a Leap Year");
		}
		

	}

}
