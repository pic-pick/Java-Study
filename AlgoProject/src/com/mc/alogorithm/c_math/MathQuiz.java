package com.mc.alogorithm.c_math;

public class MathQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("최소 : %d", lcm(12,18));
	 
	}
	
	// 최대공약수 (유클리드 호제법)
	private static int gcd(int a, int b) {
	    if (b == 0) return a;
	    return gcd(b, a % b);
	}

	// 최소공배수
	private static int lcm(int a, int b) {
	    return (a * b) / gcd(a, b);
	}
}
