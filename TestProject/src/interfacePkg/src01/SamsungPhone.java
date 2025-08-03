package interfacePkg.src01;

public class SamsungPhone implements ISmartPhone {
	//클래스가 interface를 구현하고 설정되면(implements) interface의 모든 정의된 메서드를 재정의 해야 
	//클래스이므로 클래스가 갖는 필드, 메서드 추가 가능
	
	String name;
	
	public SamsungPhone() {
		name = "삼성폰";
		
	}
	
	@Override
	public void sendCall() {
		System.out.println(name + "으로 전화를 겁니다");
	}
	
	@Override
	public void receiveCall() {
		System.out.println(name + "으로 전화를 받습니다");
	}
	
	@Override
	public void sendSMS() {
		
	}
	
	@Override
	public void receiveSMS() {
		
	}
}
