package codes;
import java.util.Scanner;
public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int temp;
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		int ans;
		
		for(int i = 1; i <= n; i++) {
			temp = a + b;
			System.out.print(" "+temp+"");
			a = b;
			b = temp;
			
			
			
			
		}

	}

}
