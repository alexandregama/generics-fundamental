package com.generics.fundamental;

public class MaximumElement {

	public static <T extends Comparable<T>> T maxElement(T x, T y, T z) {
		T max = x;
		
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = x;
		}
		return max;
	}
	
}
