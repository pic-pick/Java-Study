package game_project.game;

import java.util.Random;
import java.util.Scanner;

public class GaBaBo {
	//변환 불가능한 상수 배열 선언
	private static final String[] CHOICES = {"가위","바위","보"};
	
	//가위바위보 게임 함수
	public static void play() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//System.out.println("********************************");
		System.out.println("          가위바위보 게임");
		System.out.println("가위 바위 보 게임:1.가위, 2.바위, 3.보");
		System.out.println("================================");
		
		boolean run = true;
		while(run) {
			// 사용자 선택
			System.out.print("번호 입력 : ");
			int huSelect = sc.nextInt();
			
			// 입력 확인
		    if (huSelect < 1 || huSelect > 3) {
		        System.out.println("입력 오류. 1~3 사이의 숫자를 입력하세요.");
		        continue;
		    }
			
			// 컴퓨터 선택
			int comSelect = rand.nextInt(3) + 1;
			
			// 번호 → 가위 바위 보 문자열 변환
		    String[] CHOICES = {"가위", "바위", "보"};
		    String comStr = CHOICES[comSelect - 1];
			
		    // 결과 판정
		    if (comSelect == huSelect) {
		        System.out.println("비겼습니다!");
		    } else if ((comSelect == 1 && huSelect == 2) ||
		               (comSelect == 2 && huSelect == 3) ||
		               (comSelect == 3 && huSelect == 1)) {
		        System.out.println("이겼습니다!");
		    } else {
		        System.out.println("졌습니다!");
		    }
		    
		    System.out.println("컴퓨터는 "+comStr+"입니다.");
		    System.out.println("--------------------------------");
		    // 재시작 여부 묻기
		    System.out.print("계속하시겠습니까?(y/n): ");
		    String stopNgo = sc.next();
		    System.out.println("--------------------------------");

		    if (stopNgo.equalsIgnoreCase("n")) {
		        run = false;
		        System.out.println("********************************");
		        System.out.println("게임을 종료합니다.");
		        System.out.println("********************************");
		        System.out.println();
		    }
		}
		
		
//		System.out.println("제작자 : 오승환");
//		System.out.println("내용 : 가위바위보 게임/숫자 알아맞히기 게임");
//		System.out.println("--------------------------------");
//		System.out.println("********************************");

	}
}
