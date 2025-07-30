package oopClass.sec13;

public class Share {
	int a; //인스턴트 필드
	static int staticA;	//static필드
	
	public void set(int n) { //인스턴스 메소드
		a+=n;
		staticA += n;
	}
	
	public int showA() {
		return a;
	}

	static public int showStaticA() {
		return staticA;
	}
}
