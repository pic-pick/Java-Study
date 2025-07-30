package oppInheritance.sec01;

// Parent 클래스 상속
public class Child extends Parent {
	private int c;
	
	public void setChild() {
		c=20;
	}
	
	public void showChild() {
		showParent();	//부모클래스 메소드 사용
		System.out.println(c);
	}
}
