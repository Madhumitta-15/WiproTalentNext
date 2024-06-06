public class EvenFirst {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 4, 2 };
		int l = 0;
		int h = a.length - 1;
		int[] arr = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				arr[l++] = a[i];
			} else
				arr[h--] = a[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
