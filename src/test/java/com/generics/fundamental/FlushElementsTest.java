package com.generics.fundamental;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class FlushElementsTest {

	@Test
	public void shouldFlushElementsUsingWildcards() throws Exception {
		Collection<Integer> elements = asList(1, 2, 5, 8);
		
		Sink<Integer> sink = (t -> System.out.println("Flushing Element: " + t));
		
		Integer lastFlushedElement = FlushElements.writeAll(elements, sink);
		
		assertThat(lastFlushedElement, is(equalTo(8)));
	}
	
	@Test
	@SuppressWarnings("unused")
	public void shouldFlushElementsUsingDifferentWildcards() throws Exception {
		Collection<Integer> elements = asList(2, 5, 6);
		
		// This compile without problems, because Sink<Object> respect the signature of Sink<T>
		Sink<Object> sink = (t -> System.out.println("Flushing Element: " + t));
		
		/* This code won't compile! That happens because Collection<Integer> and Sink<Object> need to use the same type
		 * They need to be writen as Collection<Integer> and Sink<Integer> or Collection<Object> and Sink<Object>
		 */ 
//		FlushElements.writeAll(elements, sink);
	}
	
	@Test
	public void shouldFlushElementsUsingObject() throws Exception {
		Collection<Object> elements = Arrays.asList(1, 4, 6);
		
		Sink<Object> sink = (t -> System.out.println("Flushing Elements: " + t));
		
		Object lastFlushedElement = FlushElements.writeAll(elements, sink);
		
		assertThat(lastFlushedElement, is(equalTo(6)));
	}
	
}
