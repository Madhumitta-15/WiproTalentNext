import java.util.Scanner;
public class SumAvg {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int[] a = new int[7];
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum / (a.length * 1.0);
		System.out.println( sum + "  " + avg);

	}

}
