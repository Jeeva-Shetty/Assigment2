package Library;

public class Book {
	int bookid,publicationyear;
	String title,author;
	boolean status;
	
	public Book(int bookid, String title, String author, int publicationyear, boolean status) 
	{
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.publicationyear = publicationyear;
		this.status = true;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getPublicationyear() {
		return publicationyear;
	}

	public void setPublicationyear(int publicationyear) {
		this.publicationyear = publicationyear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
