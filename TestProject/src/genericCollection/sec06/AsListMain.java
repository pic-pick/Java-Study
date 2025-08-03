package genericCollection.sec06;

import java.util.Arrays;
import java.util.List;

public class AsListMain {

	public static void main(String[] args) {
		// Arrays클래스의 asList메소드 : 초기화된 List 생
		List<String> list1 = Arrays.asList("홍길동", "이룡룡", "성춘향");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int name : list2) {
			System.out.println(name);
		}
		
		list2.set(1,5);
		for(int no : list2) {
			System.out.println(no);
		}
		
		list2.add(10);
		for(int no : list2) {
			System.out.println(no);
		}
	}

}
