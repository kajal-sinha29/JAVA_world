package inheritance;

public class Book extends Item {
	
	String author;
	int edition;
	int pages;
	
	public Book()
	{
		super.title = "JAVA8";
		super.publisher = "Mac graw hill";
		super.year_published = 2020;
		super.ISBN = 23456786;
		super.price = 500;
		author = "NAGESWAR RAO";
		edition = 10;
		pages = 555;
	}

	public Book(String b_title, String b_publisher, int b_year, long b_ISBN, int b_price,String auth, int edit, int pag)
	{
		super(b_title, b_publisher, b_year, b_ISBN, b_price);
		author = auth;
		edition = edit;
		pages = pag;
		
	}
	
	public String toString()
	{
		return super.toString()+"   "+"Author = "+author+"   "+"edition = "+edition+"   "+"no of pages = "+pages;
	}
	
}
