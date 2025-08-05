package genericCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortCollention {
	
	static void printList(ArrayList<String> list) {
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String ele = iter.next();
			String sep;
			if(iter.hasNext())
				sep = "->";
			else
				sep = "\n";
			System.out.print(ele + sep);
		}
	}
	
	public static void main(String[] args) {
		// 	콜렉션 객체에 사용 가능한 sort, recerse 메소드
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("트랜스포머");
	    myList.add("스타워즈");
	    myList.add("매트릭스");
	    myList.add("터미네이터");
	    myList.add("아바타");
	    
	    System.out.print("리스트순서 : ");
	    for (String m : myList) {
	        System.out.print(m + " | ");
	    }
	    
	    System.out.print("\n오름차순 정렬 : ");
        Collections.sort(myList);
        printList(myList);

        System.out.print("\n내림차순 정렬 : ");
        Collections.reverse(myList);   // 현재 리스트를 뒤집기
        printList(myList);

	}

}
