package codes;
import java.util.Scanner;
public class SumOf_N_NaturalNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
  
		//		Using While Loop
		
		int n = s.nextInt();		
		int i = 1;
		int sum = 0;
		
		while(i <= n) {
			sum += i;
			System.out.print(sum+" ");
			i++;

			
			//Using For Loop			
			
			
//			     int sum = 0;
//
//			     for (int i = 1; i <= n; i++)
//			         sum = sum + i;
//			       System.out.println (sum);
		}
	}
}


