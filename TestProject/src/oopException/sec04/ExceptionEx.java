package oopException.sec04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		// 예외처리 연습문제
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		sc.close();
		try {
			int div = num1/num2;
			System.out.println("나누기 결과 : " + div);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(InputMismatchException e) {
			System.out.println("숫자(정수)형태로 입력해야 합니다.");
		}
	}

}
