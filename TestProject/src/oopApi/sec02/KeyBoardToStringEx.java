package oopApi.sec02;

import java.io.IOException;

public class KeyBoardToStringEx {

	public static void main(String[] args) throws IOException {
		// 사용자로부터 키보드 입력받고 문자열로 출력
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		//keyborad로부터의 입력은 입력 종료기호는 enter까지 전달됨
		System.out.println(readByteNo + "바이트");
		String str = new String(bytes,0,readByteNo-2);
		System.out.println(str);
	}

}
