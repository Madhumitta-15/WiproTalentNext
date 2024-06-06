
import java.util.Scanner;
public class PrimeBetweenRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		for (int i = x; i <= y; i++)
			if (isPrime(i))
				System.out.println(i);

	}
	public static boolean isPrime(int n) {
		 if (n <2)
			return false;


		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
