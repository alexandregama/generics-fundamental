package com.generics.fundamental;

import org.junit.Test;

public class PrintArrayTest {

	@Test
	public void shouldPrintAnArrayOfIntegers() throws Exception {
		Integer[] integers = {1,2,3};
		
		PrintArray.printArrayOf(integers);
	}
	
	@Test
	public void shouldPrintAnArrayOfStrings() throws Exception {
		String[] strings = {"A", "B", "C"};
		
		PrintArray.printArrayOf(strings);
	}
	
	@Test
	public void shouldPrintAnArrayOfDoubles() throws Exception {
		Double[] doubles = {1.0, 2.0, 3.0};
		
		PrintArray.printArrayOf(doubles);
	}
	
}
