import java.util.Scanner;
public class ReverseDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev= 0;
		while (n > 0) {
			int rem= n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println("The reverse of the given number is: " + rev);
	}
}
