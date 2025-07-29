package oopClass.sec03;

class Tv {	//class 접근제한 생략 : default(동일 패키지 내에서 접근 가능)
	String color;	//접근제한 생략 : default(동일 패키지 내에서 접근 가능)
	boolean power;
	int channel;
	
	//Tv 기능
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class TvMain {

	public static void main(String[] args) {
		// Tv class 사용
		Tv t;	//참조변수만 선언
		t = new Tv();	//인스턴스 생성
		
		//멤버변수 접근
		t.color = "black";
		System.out.println("색상 : " + t.color);
		
		//멤버 메소드 접근
		System.out.println("전원 : " + t.power);
		t.power();
		System.out.println("전원 : " + t.power);
		
		//멤버변수 접근
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");

	}

}
