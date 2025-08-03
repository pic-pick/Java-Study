package genericCollection.sec06;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayLsit 콜렉션 : 제네릭 타입이 아닌 경우
		ArrayList<E> list = new ArrayList();
		
		// 리스트 항목 추가 : add (매개변수 e) -> ArrayList 마지막에 추가
		list.add(100);
		list.add("홍길동");
		list.add(7.7);
		list.add("자바");
		list.add("홍길동");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		list.add(0,"변경");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		list.add(0,"변경");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
