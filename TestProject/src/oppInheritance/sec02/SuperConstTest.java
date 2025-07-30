package oppInheritance.sec02;

class A {
	public A() {
		System.out.println("기본 생성자 A");
	}
	public A (int x) {
		System.out.println("매개변수 생성자 A"+x);
	}
}

class B extends A{
	public B() {
		System.out.println("기본 생성자 B");
	}
	public B (int x) {
		System.out.println("매개변수 생성자 B"+x);
	}
}

class C extends B {
	public C() {
		System.out.println("기본 생성자 C");
	}
	//생성자 오버로
	public C(int x) {
		super(x);	//B클래스의 매개변수가 있는 생성자 선택 - 명시적 생성자 호출
		System.out.println("매개변수 생성자 C"+x);
	}
}

public class SuperConstTest {

	public static void main(String[] args) {
		// C클래스 인스턴스 생성
		C c =new C();	//명시적으로 부모 클래스 생성자 호출하지 않은, 매개변수가 없는 기본 생성자가 자도응로 호출 됨
		
		// C클래스 인스턴스 생성 - 매개변수가 있는 생성자 메소드 사용
		C c1 = new C(5);
	}

}
