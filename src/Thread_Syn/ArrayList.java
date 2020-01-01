package Thread_Syn;

import java.util.Arrays;

public class ArrayList<E> {
	private int size;
	private Object[] elementData;
	
	public ArrayList(int capacity) {
		elementData = new Object[capacity];
	}
	
	public ArrayList() {
		this(10);
	}
	
	public int size() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) elementData[index];
	}
	
	
	// Synchronized on total method.
	
//	public synchronized void add(E element) {
//		int length = elementData.length;
//		if(size >= length) {
//			int newLength = length*2;
//			elementData = Arrays.copyOf(elementData, newLength);
//		}
//		elementData[size++] = element;
//	}
	
	// Synchronized on specific code part.
	public void add(E element) {
		int length = elementData.length;
		synchronized(elementData) {
			if(size >= length) {
				int newLength = length*2;
				elementData = Arrays.copyOf(elementData, newLength);
			}
			elementData[size++] = element;
		}
	}
}
