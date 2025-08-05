package oopException.sec03;

public class CatchOrderEx {

	public static void main(String[] args) {
		// 다중 catch구문 있을 시 catch 순서
		try {
			String data = "a3";
			int var1 = Integer.parseInt(data);
			System.out.println(var1+10);
		}catch(Exception e) {
			System.out.println("오류발생 : 상위 클래스");
		}catch(NumberFormatException e) {
			System.out.println("오류발생 : 변환오류");
		
		}finally {
			
		}

	}

}
