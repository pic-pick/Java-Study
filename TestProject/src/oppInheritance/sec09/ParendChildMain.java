package oppInheritance.sec09;

public class ParendChildMain {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent;
		parent = child ;
		
		parent.method1();
		parent.nethod2();
	}

}
