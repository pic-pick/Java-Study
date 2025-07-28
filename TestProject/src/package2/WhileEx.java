package package2;
import java.util.Scanner;
public class WhileEx {

	public static void main(String[] args) {
		//	사용자가 숫자 7을 입력할 때까지 계속 반복 입력받은 예제
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("숫자 입력 : ");
		num = sc.nextInt();
		
		while(num != 7) {
			System.out.print("다시입력 : ");
			num = sc.nextInt();
		}
		System.out.print("7입력. 종료");
		sc.close();
	}

}
