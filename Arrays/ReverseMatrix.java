import java.util.Scanner;
public class ReverseMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] mat = new int[2][2];
		for (int i = 0; i <=1; i++) {
			for (int j = 0; j <=1; j++) {
				mat[i][j] = s.nextInt();
			}
		}
		System.out.println("The given Array is:");
		for (int i = 0; i <=1; i++) {
			for (int j = 0; j <=1; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The reverse of Array is:");
		for (int i = 1; i >= 0; i--) {
			for (int j = 1; j >= 0; j--) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}
}
