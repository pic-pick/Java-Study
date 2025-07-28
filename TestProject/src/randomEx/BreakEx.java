package randomEx;
import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		// 인출 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		//현재 잔액
		int balance = 100000;
		
		System.out.println("현재 잔액 : " + 100000);
		while(true) {
			System.out.print("인출액 입력 : ");
			int withdrawal = sc.nextInt();
			
			// 인출액이 현재 잔액보다 작을 경우
			if (withdrawal > balance) {
				System.out.println("잔액부족, 현재 잔액 : " + balance);
				break;
			}
			
			// 인출액 계산
			balance -= withdrawal;
		}
		sc.close();
		
	}

}
