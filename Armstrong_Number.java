package codes;
import java.util.Scanner;
public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int t1 = n;
		int len = 0;
		
		
		while(t1 != 0) {
			len = len + 1;
			t1 = t1 / 10;
		}
		int t2 = n;
		int rem;
		int ans = 0;
		while(t2 != 0) {
			int mul = 1;
			rem = t2 % 10;
			for(int i = 1; i <= len; i++) {
				mul = mul * rem;
			}
			ans = ans + mul;
			t2 = t2 / 10;
		}
		if(n == ans) {
			System.out.println(n+" "+"is Armstrong Number...");
		}else {
			System.out.println(n+" "+"is not a Armstrong Number...");
		}
	}

}
