package codes;
import java.util.Scanner;
public class Star_ptr_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Using While Loop
		
		int n = s.nextInt();
		int i = 1;
		
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
		
				//Using For Loop
		
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

	}

}
