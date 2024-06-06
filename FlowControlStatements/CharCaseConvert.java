
public class CharCaseConvert {
	public static void main(String[] args) {
		char ch = args[0].charAt(0);

		if (ch>='A' && ch<='Z') {
			System.out.println((char)((int)ch+32));
		} else {
			System.out.println((char)((int)ch-32));
	}
	}
}
