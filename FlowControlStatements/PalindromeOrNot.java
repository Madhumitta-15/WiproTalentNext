
import java.util.Scanner;
public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp=n;
		int rev=0;
		while(n>0){
			int a=n%10;
			rev=(rev*10)+a;
			n/=10;
		}
		if(temp==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	}
}
