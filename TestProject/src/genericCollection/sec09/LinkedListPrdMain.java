package genericCollection.sec09;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPrdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(1000, "마우스", 20000);
		Product p2 = new Product(1001, "키보드", 80000);
		Product p3 = new Product(1002, "모니터", 220000);
		
		//ArrayList<Product> list = new ArrayList<Product>();
		LinkedList<Product> list = new LinkedList<Product>();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for(Product prd : list) {
			System.out.println(prd);
		}
	}

}
