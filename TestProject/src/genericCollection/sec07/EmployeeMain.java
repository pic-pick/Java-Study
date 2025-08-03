package genericCollection.sec07;

import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee(100,"김사원",3000);
		Employee e2 = new Employee(101,"이대리",5000);
		
		list.add(e1);
		list.add(e2);
		list.add(new Employee(102,"박과장",7000));
		
		for(int i=0; i<list.size(); i++) {
			Employee emp = list.get(i);
			System.out.println(emp);
		}
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		System.out.println();
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
