package genericCollection.sec11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		
		int size = set.size();
		System.out.println("total object : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println("\t");
		}
	}

}
