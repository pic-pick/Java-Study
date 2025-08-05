package oopApi.sec02;

public class SystemExitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++) {
			Systm.out.println(i);
			if (i==5) {
				System.exit(0);
				break;
			}
		}
		System.out.println("종료");
	}

}
