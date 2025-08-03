package interfacePkg.src01;

public interface ISmartPhone {
	//생성자가 없는 interface이므로 선언할 때 초기화 해야 함 : 상수
	//상수필드
	String name = "smartphone";
	//구현되는 클래스의 메소드 설계도 역할
	public void sendCall();
	public void receiveCall();
	public void sendSMS();
	public void receiveSMS();
}
