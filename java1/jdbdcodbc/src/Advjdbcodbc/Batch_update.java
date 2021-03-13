package Advjdbcodbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Batch_update {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		System.out.println("connected............");
		
		Statement st = con.createStatement();
		st.addBatch("insert into student values(222, 'komal', 'sinha', 555555, 'dehradun', 83)");
		st.addBatch("insert into student values(333, 'Saumya', 'sinha', 5999995, 'ranchi', 90)");
		st.addBatch("insert into student values(444, 'suhana', 'sinha', 5777775, 'ramgarh', 71)");
		
		int [] count = st.executeBatch();
		System.out.println(count.length+" "+ "rows inserted");
	}

}
