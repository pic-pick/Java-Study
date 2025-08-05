package oopException.sec01;
class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		// 사용자 정의 클래스에 대해 강제 형변환 연산을 진행할 떄
		Dog = dog = new dog();

		Cat = cat new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog)animal;
	}

}

