package inheritance;

public class Music extends Item {

	String artist;
	
	public Music()
	{
		super.title = "SAMJHAWAN";
        super.publisher = "T-SERIES";
        super.year_published = 2018;
        super.ISBN = 234567864;
        super.price = 300;
        artist = "Arijit Singh";
	}
	
	public Music(String m_title, String m_publisher, int m_year, long m_ISBN, int m_price, String art)
	{
		super(m_title, m_publisher, m_year, m_ISBN, m_price);
		artist = art;
	}
	
	public String toString()
	{
		return super.toString()+"   "+"Artist = "+artist;
	}
	
}
