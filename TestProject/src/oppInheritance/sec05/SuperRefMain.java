package oppInheritance.sec05;

public class SuperRefMain {
	int x;	//디폴트 타입의 인스턴스 멤버 변수 선언 -> 동일 패키지 클래스에게는 상속됨 
	int y;
	
	public SuperClass() {
		x=5;
		y=50;
	}
	
	class SubClass extends SuperClass {
		int x; 	//인스턴스 멤버 변수
		
		public SubClass() {
			x=10;
		}
		
		public void show() {
			System.out.println(x);
			System.out.println("this.x : " + this.x);
			System.out.println("super.x : " + super.x);
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		// 

	}

}
