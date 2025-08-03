package oppInheritance.sec11;

public class CatMain {

	public static void main(String[] args) {
		// 강제 타입 변환
		Animal ap = null;
		
		ap = new Dog();
		ap.show();
		ap.sound();
		
		ap.animalMethod();	//Animal 클래스의 메서드가 호출 - Dog 클래스에서 재정의 하지 않음
		
		Dog d = (Dog)ap;
		d.dogMethod();
		
		//instansof : 객체가 참조하고 있는 인스턴스의 타입 검사를 진행하는 연산자
		Animal aa = new Animal();
		Dog dd = (Dog)aa;
	}

}
