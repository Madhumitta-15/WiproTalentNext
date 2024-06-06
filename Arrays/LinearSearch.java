import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a = new int[7];
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		int n = s.nextInt();
		boolean f=false;
		int i;
		for (i = 0; i < a.length; i++) {
			if (n == a[i]) {
				f=true;
				break;
			}
		}
		if(f)
		System.out.println(i);
		else
		System.out.println("Not found");
	}

}
