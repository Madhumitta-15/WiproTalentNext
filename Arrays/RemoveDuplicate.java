import java.util.LinkedHashSet;
public class RemoveDuplicate {
	public static void main(String[] args) {
	int[] a = {12,89,5,9,43,5,12,67,9,56};
	LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
		for(int i:set)
        System.out.print(i+" ");

	}
}
