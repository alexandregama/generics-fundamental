package com.generics.fundamental;

import java.util.Collection;

public class FlushElements {

	public static <T> T writeAll(Collection<T> collection, Sink<T> sink) {
		T last = null;
		for (T element: collection) {
			last = element;
			sink.flush(element);
		}
		return last;
	}
	
}
