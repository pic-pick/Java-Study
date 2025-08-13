package game_project.info;

import game_project.start.*;

import java.util.Scanner;

public class AppInfo {
	static Scanner sc = new Scanner(System.in);
	private static void appInfoPrint() {
		System.out.println();
		System.out.println("********************************");
		System.out.println("         애플리케이션 정보");
		System.out.println("--------------------------------");
		System.out.println("제목 : STAR 게임");
		System.out.println("제작자 : 오승환");
		System.out.println("내용 : 가위바위보 게임/숫자 알아맞히기 게임");
		System.out.println("********************************");
		System.out.println();
	}
	
	private static void gaBaBoPrint() {
		System.out.println();
		System.out.println("********************************");
		System.out.println("         가위바위보 게임");
		System.out.println("가위 바위 보 게임 입니다.");
		System.out.println("********************************");
		System.out.println();
	}
	
	private static void GuessPrint() {
		System.out.println();
		System.out.println("********************************");
		System.out.println("         숫자 알아맞히기 게임");
		System.out.println("숫자 알아 맞히기 게임 입니다.");
		System.out.println("********************************");
		System.out.println();
	}
	
	public static void info() {
		
		appInfoPrint();
		
		
		boolean run = true;
		while(run) {
			AppStart.showMenu();
			System.out.print("메뉴 번호 입력 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				appInfoPrint();
//				AppStart.showMenu();
				break;
			case 2:
				gaBaBoPrint();
//				AppStart.showMenu();
				break;
			case 3:
				GuessPrint();
//				AppStart.showMenu();
				break;
			case 4:
				run = false;
			}
			
		}
	}
}
