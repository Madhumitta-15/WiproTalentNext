import java.util.Scanner;
public class AlphabeticalOrder {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char c1=s.next().charAt(0);
		char c2=s.next().charAt(0);

		if ((int)c1<(int)c2) {
			System.out.println(c1 + "," + c2);
		} else
			System.out.println(c2 + "," + c1);
	}
}
