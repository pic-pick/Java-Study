package model;

public class BookDTO {
	int bookPrice;
	String BookDate;
	int bookStock;
	String pubNo;
	
	public BookDTO(String bookNo, String bookName, String bookAuthor, int bookPrice,
			   String bookDate, int bookStock, String pubNo) {
	this.bookNo = bookNo;
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
	this.bookPrice = bookPrice;
	this.bookDate = bookDate;
	this.bookStock = bookStock;
	this.pubNo = pubNo;
}
	String bookNo;
	String bookName;
	String bookAuthor;
	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookDate() {
		return BookDate;
	}

	public void setBookDate(String bookDate) {
		BookDate = bookDate;
	}

	public int getBookStock() {
		return bookStock;
	}

	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}

	public String getPubNo() {
		return pubNo;
	}

	public void setPubNo(String pubNo) {
		this.pubNo = pubNo;
	}
	
	@Override
	public String toString() {
		String Builder builder = new StringBuilder();
		
	}
	
	public BookDTO() {}
}
