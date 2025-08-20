package com.mc.alogorithm.a_ot;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swap();
		swap2();
		
	}

	public static void swap2() {
		int a = 11;
		int b = 16;
		// (a ^ b) ^ b = a
		// (a ^ b) ^ a = b
		a = a ^ b;
		b = a ^ b;
		a = b ^ a;
	}

	public static void swap() {
		int a = 10;
		int b = 15;
		
		int temp = a;
		a = b;
		b = temp;
	}

}
