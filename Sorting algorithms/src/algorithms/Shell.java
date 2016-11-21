package algorithms;

import algorithms.extra.Sort;
import algorithms.extra.StringArray;

public class Shell extends Sort {
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N/3) h = 3*h+1;
		while (h >= 1) {
			for (int i=1; i<N; i++) 
				for (int j=i; j>0 && less(a[j], a[j-1]); j--)
					exch(a, j, j-1);
			h = h/3;
		}
	}
	
	public static void main(String[] args) {
		String[] a = StringArray.makeArray(10, 5);
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
