package com.generics.fundamental;

public interface Sink<T> {

	void flush(T t);
	
}
