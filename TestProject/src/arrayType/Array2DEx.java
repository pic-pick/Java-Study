package arrayType;
import java.util.Scanner;
public class Array2DEx {

	public static void main(String[] args) {
		// 영어 단어의 뜻을 알아 맞히는 프로그램
		Scanner sc = new Scanner(System.in);
		//2차원 배열 선언/데이터 초기화
		String[][] arr = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		//q1 문제
		System.out.print("Q1.chair의 뜻은?:");
		
		String Q1 = sc.next();
		System.out.println();
		
		if(Q1.equals(arr[0][1])) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다. 정답은 의자입니다.");
		}
		
		
		//q2 문제
		System.out.print("Q2.computer의 뜻은?:");
		
		String Q2 = sc.next();
		System.out.println();
		
		if(Q2.equals(arr[1][1])) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다. 정답은 노트입니다.");
		}

		//q3 문제
		System.out.print("Q3.integer의 뜻은?:");
		
		String Q3 = sc.next();
		System.out.println();
		
		if(Q3.equals(arr[2][1])) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다. 정답은 정수입니다.");
		}	
		
	}

}
