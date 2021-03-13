package Advjdbcodbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.IOException;
import java.sql.Clob;

public class Clob_Demo {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		
		PreparedStatement ps = con.prepareStatement("insert into clob values(?, ?)");
		
		ps.setInt(1, 1001);
		
		Clob clob = ps.getConnection().createClob();
		
		clob.setString(1, "Diwali is a festival of lights. It is one of the biggest and grandest festivals celebrated mainly in India. Diwali is a festival commemorated to mark joy, victory and harmony. Diwali, also known as Deepavali, falls during the month of October or November. It is celebrated after 20 days of the Dussehra festival.");
	
		ps.setClob(2, clob);	    
	    ps.executeUpdate();
	    
	    PreparedStatement ps1 = con.prepareStatement("select * from clob");
	    ResultSet rs = ps1.executeQuery();
	    
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1));
	    	System.out.println();
	    	Clob c = rs.getClob(2);
	    	Reader b = c.getCharacterStream();
	    	
	    	int n;
	    	while((n=b.read())!=-1)
		    	System.out.print((char)n);
	    }
	}

}
