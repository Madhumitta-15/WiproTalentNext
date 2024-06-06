import java.util.ArrayList;
public class Ignore6and7 {
	public static void main(String[] args) {
		int[] a = { 10, 3, 6, 1, 2, 7,9 };
		ArrayList<Integer> list = new ArrayList<>();
		int totalSum = 0;
		int tempSum = 0;
		boolean count = true;
		for (int i = 0; i < a.length; i++) {
			totalSum += a[i];
			if (a[i] == 6) {
				count = false;
				if (!list.contains(6))
					list.add(6);
			}
			if (count == false) {
				tempSum += a[i];
			}
			if (a[i] == 7) {
				if (list.contains(6)) {
					count = true;
					list = new ArrayList<>();
				}
			}

		}
		if (list.isEmpty()) {
			totalSum -= tempSum;
		}
		System.out.println(totalSum);
	}

}
