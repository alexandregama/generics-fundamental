# Generics Fundamentals

### Erasure of Generic Types

```java
public class Node<T> {

	private T data;
	
	private Node<T> next;
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
	public T getData() {
		return data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
}
```

The Java compiler will replace the **T** with **Object** because the type was not bounded. The result will be as follow:

```java
public class Node {

    private Object data;
    
    private Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() { return data; }
    // ...
}
```

We are enable to write our Node class bounde the type with Comparable. As you can see below, T extends Comparable.

```java
public class AnotherNode<T extends Comparable<T>> {

	private T data;
	
	private AnotherNode<T> node;
	
	public AnotherNode(T data, AnotherNode<T> node) {
		this.data = data;
		this.node = node;
	}
	
	public T getData() {
		return data;
	}
	
	public AnotherNode<T> getNode() {
		return node;
	}
	
}
```

The Java Compiler will use the **Comparable** type to replace the type, instead of use **Object** type. This happens because the type **Comparable** was bounded. The result will be as follow:

```java
public class AnotherNode {

	private Comparable data;
	
	private AnotherNode node;
	
	public AnotherNode(Comparable data, AnotherNode node) {
		this.data = data;
		this.node = node;
	}
	
	public Comparable getData() {
		return data;
	}
	
	public AnotherNode getNode() {
		return node;
	}
	
}
```

### Erasure of Generic Methods

In the following code we used Generic Method to count the quantity of some element in a generic array:

```java
public class ArrayCounter {

	/*
	 * Here the anArray parameter was not bounde with a Type, so the java compiler will use Object.
	 * Will result:
	 * public static int count(Object[] anArray, Object element) {
	 */
	public static <T> int count(T[] anArray, T element) {
		int count = 0;
		for (T e: anArray) {
			if (e.equals(element)) {
				count++;
			}
		}
		return count;
	}
	
}

```

Note the no type was bounded in the method. The Iava Compiler will update the **T** with **Object** as follows:

```java
public class ArrayCounter {

	public static int count(Object[] anArray, Object element) {
		int count = 0;
		for (Object e: anArray) {
			if (e.equals(element)) {
				count++;
			}
		}
		return count;
	}
	
}

```
