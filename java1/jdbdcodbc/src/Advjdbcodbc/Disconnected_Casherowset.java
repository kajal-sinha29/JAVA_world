package Advjdbcodbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Disconnected_Casherowset {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		System.out.println("connected");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		
		CachedRowSet cr = RowSetProvider.newFactory().createCachedRowSet();
		cr.populate(rs);
		rs.close();
		st.close();
		con.close();
		
		while(cr.next())
		{
			System.out.println(cr.getInt(1)+" "+cr.getString(2)+" "+cr.getString(3)+" "+cr.getLong(4)+" "+cr.getString(5)+" "+cr.getInt(6));
		}
	}

}
