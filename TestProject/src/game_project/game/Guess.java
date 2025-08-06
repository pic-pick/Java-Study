package game_project.game;

import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void play() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("********************************");
		System.out.println("        숫자 알아맞히기 게임");
		System.out.println("숫자 알아 맞히기 게임 입니다");
		System.out.println("--------------------------------");
		System.out.println("어떤 숫자일까요? 알아 맞혀보세요^^ (1~10)");
		System.out.println("--------------------------------");
		
		int answer = rand.nextInt(10) + 1; // 1~10 랜덤 숫자
		
		boolean run = true;
		System.out.print("숫자 입력 : ");
		int inputNum = sc.nextInt();
		while(run) {
			System.out.println("--------------------------------");
			if(answer == inputNum) {
				System.out.println("드디어 맞혔습니다~ 나의 숫자는 "+answer+"입니다.");
				System.out.println("================================");
				System.out.println();
				run = false;
			} else {
				System.out.print("아닙니다. 다시 맞혀보세요^^ 다시 입력 : ");
				inputNum = sc.nextInt();
			}
		}
		
		
	}
}
