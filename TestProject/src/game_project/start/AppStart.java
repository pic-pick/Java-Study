package game_project.start;

import java.util.Scanner;
import game_project.game.*;
import game_project.info.*;

public class AppStart {

	private static void showMenu() {
		
				
				System.out.println("              메뉴");
				System.out.println("--------------------------------");
				System.out.println("1. 애플리케이션 정보");
				System.out.println("2. 가위바위보 게임");
				System.out.println("3. 숫자 알아맞추기 게임");
				System.out.println("4. 종료");
				System.out.println("---------------------------------");
	}
	
	public static void main(String[] args) {
		// 메인 시작 화면
		
		Scanner sc = new Scanner(System.in);
		// 웰컴 출력
		System.out.println("********************************");
		System.out.println("    게임에 오신 것을 환영합니다^^");
		System.out.println("********************************");
		
		
		//프로그램 종료
		boolean run = true;
		while(run) {
			showMenu();
			// case 입력
			System.out.print("메뉴 번호 입력 : ");
			int choice = sc.nextInt();
			//System.out.println("********************************");
			switch (choice) {
			case 1: // 애플리케이션 정보
				AppInfo.info();
				break;
			case 2: // 가위바위보 게임
				GaBaBo.play();
				break;
			case 3:	// 숫자 알아맞추기 게임
				Guess.play();
				break;
			case 4:	// 종료
				run = false;
				System.out.println("********************************");
				System.out.println("            종료합니다");
				System.out.println("********************************");
			default:
				System.out.println("다시 입력하세요.");
			}	
		}
		
		
		


	}

}
