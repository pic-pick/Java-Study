package oppInheritance.sec08;

public class SportsCar extends MyCar {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public final void stop() {	//final지정으로 Override 사용 불가
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	
}
