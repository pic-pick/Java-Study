package oopApi.sec04;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		// 포장객체와 기본 타입에 대한 자동 박싱/언박싱
		
		Integer obj = 100;//100기본값이 obj가 참조하게된 객체의 필드로 저장(객체 생성)
		System.out.println(obj.intValue());
		
		int value = obj;
		
		int result = obj + 100;
		System.out.println(result);
	}

}
