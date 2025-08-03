package genericCollection.sec08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		//성능비교
		//List = ArrayList
		//ArrayList = ArrayList
		//LinkedList = LinkedList
		
		List<String> listArrList = new ArrayList<String>();
		List<String> listLinkedList = new LinkedList<String>();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		
		long startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			listArrList.add(String.valueOf(i));
		}
		
		ㄷ
		
	}
}
