import java.util.Scanner;

public class CharDifferentiate {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char ch = s.next().charAt(0);
		int ascii = (int) ch;
		if (ascii >= 47 && ascii <= 57) {
			System.out.println("Number");
		} else if (ascii >= 65 && ascii <= 122) {
			System.out.println("Alphabet");
		} else
			System.out.println("Symbol");
	}
}
