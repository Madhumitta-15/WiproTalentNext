import java.util.Scanner;
public class CheckPrime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean prime=true;
		int n = s.nextInt();
		if (n < 2) {
			prime=false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				prime=false;
				break;
			}
		}
		if(prime)
		System.out.println("Prime Number");
		else
		System.out.println("Not a Prime");
	}

}
