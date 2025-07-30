package oppInheritance.sec03;

public class EmployeeMain {

	public static void main(String[] args) {
		// toString 사용
		EmployeeTostring emp1 = new EmployeeTostring("1234","홍길동","마케팅");
		EmployeeTostring emp2 = new EmployeeTostring("5678","이몽룡","영업부");
		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
