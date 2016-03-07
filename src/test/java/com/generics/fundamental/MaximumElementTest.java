package com.generics.fundamental;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumElementTest {

	@Test
	public void shouldFindTheLargestElementBetweenThreeIntegers() throws Exception {
		Integer largestInteger = MaximumElement.maxElement(8, 10, 3);
		
		assertEquals(10, largestInteger, 0);
	}
	
	@Test
	public void shouldFindTheLargestElementBetweenThreeStrings() throws Exception {
		String largestString = MaximumElement.maxElement("Blue", "Orange", "Green");
		
		assertEquals("Orange", largestString);
	}

	@Test
	public void shouldFindTheLargestElementBetweenThreeDoubles() throws Exception {
		Double largestDouble = MaximumElement.maxElement(8.0, 10.0, 3.0);
		
		assertEquals(10.0, largestDouble, 0);
	}	
}
