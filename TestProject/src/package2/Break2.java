package package2;

public class Break2 {

	public static void main(String[] args) {
		// 중첩 반복일 때 break 범위
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower ='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
					break;	
				}
				if(upper == 'K') {
					break Outter;	//Outter라는 라벨이 설정된 반복문을 취소
				}
			}
		}

		System.out.println("프로그램 실행 종료");
	}

}
