package functions;
import java.util.Scanner;
public class NcR {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int r = s.nextInt();
		
		int num = 1;
		for(int i = 1; i<= n; i++) {
			num = num * i;
		}
		int dem1 = 1;
		for(int i = 1; i<= r; i++) {
			dem1 = dem1 * i;
		}
		int dem2 = 1;
		for(int i = 1; i<= n - r; i++) {
			dem2 = dem2 * i;
		}
		int ans = num/(dem1 * dem2);
		System.out.println(ans);

	}

}
