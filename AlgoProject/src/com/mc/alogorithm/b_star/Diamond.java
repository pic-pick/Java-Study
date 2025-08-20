package com.mc.alogorithm.b_star;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i = 0; i <=input; i++) {
			for(int j=1; j<=input-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = input; i > 0; i--) {
			for (int j = input - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = i * 2 - 1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
