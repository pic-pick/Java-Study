package oopApi.sec05;

import java.util.Random;

public class RandomSeed {

	public static void main(String[] args) {
		
		// Random 클래스 객체 생성 시 seed 전달
		Random r = new Random(3);       // 실행시마다 난수를 발생시키는 연산에서 사용할 seed 값이 다르게 구성

		for (int i = 0; i < 5; i++) {
		    int x = r.nextInt(10) + 1; // 1 ~ 10까지의 정수
		    System.out.print(x + " ");
		}
	}

}
