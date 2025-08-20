package com.mc.alogorithm.d_datastructure.list;

public class Node<E> {
	
	private Node<E> next;
	private E data;
	
	public Node<E> next() {
		return next;
		
	}
	
	public void next(Node<E> next) {
		this.next = next;
	}

	public void data(E data) {
		this.data = data;
	}
	
	public String toString() {
		return data.toString();
	}
}
