package codes;
import java.util.Scanner;
public class Palindrome_Or_Not {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n = s.nextInt();
		int rem;
		int reverse = 0;
		int temp;
		
		temp = n;
		while(temp != 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp = temp / 10;
		}if(n == reverse) {
			System.out.println("is Palindrome");		
			}else {
				System.out.println("is not Palindrome");
			}

	}

}
