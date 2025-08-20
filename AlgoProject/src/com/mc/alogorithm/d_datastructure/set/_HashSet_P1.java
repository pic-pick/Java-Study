package com.mc.alogorithm.d_datastructure.set;

@SuppressWarnings("uncheked")
public class _HashSet_P1<E> {
	
	private Object[] table;
	private int arraySize = 6;
	private int size;
	
	public _HashSet_P1() {
		this.table = new Object[arraySize];
	}
	
	public _HashSet_P1(int initalCapacity) {
		this.table = new Object[initalCapacity];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return this.size;
	}
	// 해시함수의 원칙
	// 같은 값이 들어오면 언제나 같은 값을 반환
	// 다른 값이 들어오면 언제나 다른 값을 반
	// 해시충돌 : 다른 값이 드러왔는데 해시함수가 같은 해시값을 반환하는 경우
	private int hash(E e) {
		int hashCode = Math.abs(e.hashCode());
		return hashCode%arraySize;
	}
	
	public boolean add(E e) {
		if(size == arraySize) {
			arraySize *= 2;
			Object[] temp = new Object[arraySize];
			for(int i=0; i<table.length; i++) {
				if(table[i] == null) continue;
				int index = hash((E)table[i]);
				temp[index] = table[i];
			}
			
			table = temp;
		}
		
		int index = hash(e);
		if(table[index] != null) return false;
		
		table[index] = e;
		size++;
		
		return true;
	}
}
