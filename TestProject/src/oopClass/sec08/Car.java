package oopClass.sec08;

// 사용자 정의 클래스 생성 : 개발자가 필요한 변수(필드/속성), 함수(메서드) 정의
// 데이터를 다루기 위한 변수 : 멤버변수
// 데이터를 조작하기 위한, 기능을 수행하기 위한 함수 : 멤버 메소드
public class Car {
	//멤버변수, 데이터
	private String carNo;
	private String carName;
	private String carMaker;
	private int carYear;
	private int carCC;
	
	//생성자 메서드 private 필드를 초기화
	public Car(String carNo, String carName, String carMaker) {
		//멤버 필드와 매개변수명이 동일
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
	}
	

	public void setCarInfo(String no, String name, String maker, int carYear, int carCC) {
		carNo=no;	//private 멤버변수 : 클래스 내부에서는 접근 가능
		carName=name;
		carMaker=maker;
		this.carYear=carYear;
		this.carCC=carCC;
	}
	
	public void showCarInfo() {
		System.out.println("차량번호 : " + carNo);
		System.out.println("차종 : " + carName);
		System.out.println("차량제조사 : " + carMaker);
		System.out.println("차량연식 : " + carYear);
		System.out.println("차량배기량 : " + carCC);
	}
}
