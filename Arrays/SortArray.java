import java.util.Arrays;
public class SortArray {
	public static void main(String[] args) {
		int[] a = {12,25,24,6,3,5,37,8,9};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
