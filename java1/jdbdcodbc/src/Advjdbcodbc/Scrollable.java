package Advjdbcodbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Scrollable {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = st.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getInt(6));
		}
		
		System.out.println("\n\n.......................Accessing record by record or row number........................");
		
		rs.absolute(5);
		System.out.println("5th record is..........");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getInt(6));
		
		
		rs.relative(1);
		System.out.println("\n\nrecord after absolute(n) record....");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getInt(6));
	
		rs.relative(-1);
		System.out.println("\n\nrecord before  absolute(n) record....");
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getInt(6));
		
		con.close();
	}

}
