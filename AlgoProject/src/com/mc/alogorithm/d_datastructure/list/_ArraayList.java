package com.mc.alogorithm.d_datastructure.list;

import java.util.Iterator;

public class _ArraayList<E> implements Iterable<E> {
	
	private Object[] elementData;
	private int size;
	private int arraySize = 10;
	
	public _ArraayList() {
		elementData = new Object[arraySize];
	}
	
	public _ArraayList(int initialCapacity) {
		this.arraySize = initialCapacity;
		elementData = new Object[arraySize];
	}
	
	
	public int size() {
		return 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean add(E e) {
		return false;
	}
	
	public E get(int index) {
		return null;
	}
	
	public E set(int index, E element) {
		return null;
	}
	
	public E remove(int index) {
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	class _Interator implements Iterator<E> {
		
		private int pointer = 0;
		
		@Override
		public boolean hasNext() {
			return false;
		}
		
		@Override
		public E next() {
			return null;
		}
	}
}


