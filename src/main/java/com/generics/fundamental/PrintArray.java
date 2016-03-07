package com.generics.fundamental;

public class PrintArray {

	public static <E> void printArrayOf(E[] inputArray) {
		
		System.out.println("Printing array: ");
		for (E element: inputArray) {
			System.out.println(element);
		}
	}
	
}
