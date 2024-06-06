import java.util.Arrays;
public class MaxMin2 {
	public static void main(String[] args) {
		int[] a = { 8,6,15,4,2,45,75,24,3};
		Arrays.sort(a);
		System.out.println(a[a.length-2] + " " + a[a.length-1] + " " + a[0] + " " + a[1]);
	}
}
