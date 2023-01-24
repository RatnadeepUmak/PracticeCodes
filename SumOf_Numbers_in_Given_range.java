package codes;
import java.util.Scanner;
public class SumOf_Numbers_in_Given_range {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int n = s.nextInt();
		System.out.println("Enter Second Number: ");
		int c = s.nextInt();
		
		int sum = 0;
		
		for(int i = n; i <= c; i++) {
			sum = sum + i;
			System.out.println(sum);
			
		
		}
	}

}
