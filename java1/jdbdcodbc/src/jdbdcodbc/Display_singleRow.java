package jdbdcodbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Display_singleRow {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = DriverManager.getConnection(url, "system", "root");
		
		System.out.println("connected successfully....");
		
		Statement st = con.createStatement();
		
	     ResultSet rs = st.executeQuery("select rollno, f_name, marks from student");
	     
	     while(rs.next())
	     {
	    	 System.out.println(rs.getInt("rollno")+" "+rs.getString("f_name")+" "+rs.getInt("marks"));
	    	 
	     }
	}

}