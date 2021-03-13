package inheritance;

public class Item {

	String title;
	String publisher;
	int year_published;
	long ISBN;
	int price;
	
	public Item()
	{
		title = "JAVA";
		publisher = "DREAMTECH";
		year_published = 2020;
		ISBN = 123456789;
		price = 500;
		
	}
	
	public Item(String tit, String pub, int yr, long IS, int pr)
	{
		title = tit;
		publisher = pub;
		year_published = yr;
		ISBN = IS;
		price = pr;
	}
	
	public String toString()
	{
		return "Title = "+title+"   "+"Publisher = "+publisher+"   "+"Published in = "+year_published+"   "+"ISBN no = "+ISBN+"   "+"price = "+price;
	}
	
}
