public class Remove10s {
	public static void main(String[] args) {
		int[] a= { 1, 2, 10, 10, 10, 3 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 10) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				a[a.length - 1] = 0;
				i--;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
