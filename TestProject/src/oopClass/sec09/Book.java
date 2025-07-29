package oopClass.sec09;

public class Book {
	String title;
	String author;
	int price;
	
	public Book() {
		this("자바스크립트", "이몽룡", 12000);
	}
	
	public Book(String t, String au, int p) {
		title=t;
		author = au;
		price = p;
	}
	
	public void show() {
		System.out.println("도서명 : " + title);
		System.out.println("저자명 : " + author);
		System.out.println("가격 : " + price);
	}
}
