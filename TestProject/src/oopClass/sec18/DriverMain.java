package oopClass.sec18;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(taxi);
		driver.driver(bus);
	}

}
