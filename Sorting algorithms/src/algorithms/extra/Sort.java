package algorithms.extra;
/**
 * Sort super used for Sort classes
 * @author Tormod
 */

import edu.princeton.cs.algs4.*;
public class Sort {
	
	/**
	 * Sorting method
	 * @param a
	 */
	public static void sort(Comparable[] a){
		System.err.println("Sort method not implemented");
	}
	
	/**
	 * is v less than w?
	 * @param v
	 * @param w
	 * @return true/false
	 */
	protected static boolean less(Comparable v, Comparable w) {return (v.compareTo(w) < 0);}
	
	/**
	 * Exchange i and j in array a
	 * @param a
	 * @param i
	 * @param j
	 */
	protected static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i]; a[i] = a[j]; a[j] = t;
	}
	
	/**
	 * print array on a single line
	 * @param a
	 */
	protected static void show(Comparable[] a) {
		for (int i=0; i< a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	/**
	 * Test whether the array entries are in order
	 * @param a
	 * @return true/false
	 */
	public static boolean isSorted(Comparable[] a) {
		for (int i=1; i<a.length; i++)
			if (less(a[i], a[i-1])) return false;
		return true;
	}
	
	/**
	 * Read strings from standard input, sort them, and print
	 * @param args
	 */
	public static void main(String[] args) {
		String[] a = StringArray.makeArray(10, 5);
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
