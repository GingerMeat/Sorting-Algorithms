package algorithms;

import algorithms.extra.*;
import edu.princeton.cs.algs4.*;

public class Insertion extends Sort {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i=1; i<N; i++) 
			for (int j=i; j>0 && less(a[j], a[j-1]); j--)
				exch(a, j, j-1);
	}
	
	public static void main(String[] args) {
		String[] a = StringArray.makeArray(10, 5);
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
