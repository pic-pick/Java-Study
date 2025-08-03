package oppInheritance.sec10;

public class AnimalMain {

	public static void main(String[] args) {
		// 자동타입변환 사용가능 멤버 예외 예제
		Animal ani;
		ani = new Animal();
		ani.show();
		ani.sound();
		
		ani = new Cat();
		ani.show();
		ani.sound();
		
		ani = new Dog();
		ani.show();
		ani.sound();
	}

}
