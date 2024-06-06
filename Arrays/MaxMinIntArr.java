public class MaxMinIntArr {
	public static void main(String[] args) {
		int[] a = { 5, 7,12, 7, 235, 12, 7, 45, 2, 56 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		System.out.println(max +"  "+ min);
	}

}
