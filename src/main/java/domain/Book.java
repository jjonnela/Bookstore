package domain;

public class Book {
	private String bookTitle, bookAuthor, bookISBN;
	private int bookYear;
	private double bookPrice;

	public Book(String bookTitle, String bookAuthor, String bookISBN, int bookYear, double bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookISBN = bookISBN;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookISBN=" + bookISBN + ", bookYear="
				+ bookYear + ", bookPrice=" + bookPrice + "]";
	}

	
	
	
}

