public class OneAnd4 {
	public static void main(String[] args) {
		int[] a= { 1, 4, 1, 3, 1, 4, 1 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 4 || a[i] == 1) {
				continue;
			} else {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
	}
}
