package codes;
import java.util.Scanner;
public class Gratest_Of_ThreeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first Number: ");
		int a = s.nextInt();
		System.out.println("Enter Second Number: ");
		int b = s.nextInt();
		System.out.println("Enter Third Number: ");
		int c = s.nextInt();
		
		if(a > b && a > c) {
			System.out.println(a+" "+"is a Grater");
		}else if(b > a && b > c) {
			System.out.println(b+" "+"is a Grater");
		}else if(c > b && c > a) {
			System.out.println(c+" "+"is a Grater");
		}
		
		

	}

}
