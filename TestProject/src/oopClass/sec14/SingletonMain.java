package oopClass.sec14;

public class SingletonMain {
	
	public static void main(String[] args) {
		//싱글톤 패턴클래스 사용
		//Singleton obj1 = new Singleton(); //컴파일 에러, 생성자 private으로 접근제한 되어 있
		
		//Singleton객체 필요할 경우 메서드 getInstance 활용
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체 입니다.");
		}else {
			System.out.println("다른 singleton 객체 입니다.");
		}
	}
}
