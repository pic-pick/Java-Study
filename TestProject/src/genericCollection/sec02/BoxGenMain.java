package genericCollection.sec02;

public class BoxGenMain {

	public static void main(String[] args) {
		// 제네릭 큻래스 활용 : 객체 생성 시 구체적 타입 지정
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		//정수형 Box 인스턴스 생성 -> Integer 클래스 사용
		Box<Integer> box2 = new Box<Integer>();
		box2.set(7);//타입변환 없음
		int no = box2.get();
		System.out.println(no);
	}

}
