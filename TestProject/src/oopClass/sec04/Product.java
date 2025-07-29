package oopClass.sec04;
import java.util.Scanner;
class ProdInfo {
	String prdName;
	int prdPrice;
	int prdSold;
	int prdStock;
	
	void inputPrdInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명: ");
		prdName = sc.next();

		
		System.out.print("가격: ");
		prdPrice = sc.nextInt();

		
		System.out.print("판매 재고: ");
		prdSold = sc.nextInt();

		
		System.out.print("재고 수량: ");
		prdStock = sc.nextInt();

		
		sc.close();
	}
	
	void showPrdInfo() {
		System.out.println("상품명: " + prdName);
		System.out.println("가격: " + prdPrice);
		System.out.println("판매 재고: " + prdSold);
		System.out.println("재고 수량: " + prdStock);
	}
	
	void showSalesAmount() {
		int sale = prdPrice * prdSold;
		System.out.println("매출액: " + sale);
	}
	
	void showStockAmount() {
		int stock = prdPrice * prdStock;
		System.out.println("재고액: " + stock);
	}
	
}

public class Product {
	
	public static void main(String[] args) {
		// 매출액, 재고액 계산출력
		ProdInfo p;
		p = new ProdInfo();
		
		System.out.println("****상품 정보 입력****");
		p.inputPrdInfo();
		System.out.println("****상품 정보 출력****");
		p.showPrdInfo();
		p.showSalesAmount();
		p.showStockAmount();
	}

}
