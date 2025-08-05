package oopException.sec01;

public class NullpointerExceptionEx {

	public static void main(String[] args) {
		// null을 참조하는 객체변수를 통해 메서드 접근하려 할 떄 발생하는 예외
		String data = null;
		int[] arr = {1,2,3};
		String data1 = "100";
		String data2 = "a100";
		//System.out.println(data.toString());
		System.out.println(arr[5]);

		int value1 = Integer.parseInt(data1); // 문자열 → 정수 변환
		int value2 = Integer.parseInt(data2); // 문자열 → 정수 변환

		System.out.println(value1 + value2);
	}

}
