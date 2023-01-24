package codes;
import java.util.Scanner;
public class Sum_Of_Digit_Of_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int temp = 0;
		
		while(n != 0) {
		
				temp = temp + n % 10;
				 n = n / 10;
				 }
		System.out.println(temp);
		}
	}
