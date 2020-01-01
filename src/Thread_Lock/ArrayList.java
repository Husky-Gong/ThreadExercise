package Thread_Lock;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayList<E> {
	private int size;
	private Object[] elementData;
	
	private Lock lck = new ReentrantLock();
	
	public ArrayList(int capacity) {
		elementData = new Object[capacity];
	}
	
	public ArrayList() {
		this(10);
	}
	
	public int size() {
		lck.lock();
		try {
			test();
			return size;
		}finally {
			lck.unlock();
		}
	}
	
	public void test() {
		lck.lock();
		try {
			System.out.println("Just for testing~");
		}finally {
			lck.unlock();
		}
	}
	
	@SuppressWarnings("hiding")
	public <E> void add(E element) {
		lck.lock();
		try {
			int length = elementData.length;
			if(length >= size) {
				elementData = Arrays.copyOf(elementData, length*2);
			}
			elementData[size++] = element;
		}finally {
			lck.unlock();
		}
	}
}
