/**
 * Mergesort
 * Advantages: Guarantees to sort any array of N items in time propotional to N log N
 * Prime Disatvantage: It uses extra space proportional to N
 * 
 * Video: https://www.youtube.com/watch?v=e5ik2UGjHBk
 * Chapter: 2.2 (Page 270-287)
 * 
 * Time complexity:
 * Best: Ω(n log(n))
 * Average: Θ(n log(n))
 * Worst: O(n log(n))
 * 
 * Space complexity:
 * Worst: O(n)
 */


package algorithms;
import algorithms.extra.Sort;
import algorithms.extra.StringArray;

public class Merge extends Sort {
	
	private static Comparable[] aux;
	
	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		int i = lo, j = mid+1;
		
		for (int k = lo; k<= hi; k++)
			aux[k] = a[k];
		
		for (int k = lo; k <= hi; k++) 
			if 		(i > mid) 				a[k] = aux[j++];
			else if (j > hi) 				a[k] = aux[i++];
			else if (less(aux[j], aux[i]))  a[k] = aux[j++];
			else 							a[k] = aux[i++];
	}
	
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		int mid = lo + (hi-lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	
	public static void main(String[] args) {
		String[] a = StringArray.makeArray(10, 5);
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
