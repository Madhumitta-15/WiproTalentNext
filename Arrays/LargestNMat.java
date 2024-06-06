import java.util.Scanner;
public class LargestNMat {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[][] mat = new int[3][3];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = s.nextInt();
				max = Math.max(max, mat[i][j]);
			}
		}
		System.out.println("Max element is " + max);
	}

}
