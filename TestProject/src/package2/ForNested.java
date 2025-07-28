package package2;

public class ForNested {
	
	public static void main(String[] args) {
		//	구구단 전체 테이블 형식으로 출력 예제
		//	2~9단 
		for(int n=1; n<=9; n++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + "X" + n + "=" + dan*n + '\t');
			}
			System.out.println();
		}
	}
}
