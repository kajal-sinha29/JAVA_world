package jdbdcodbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcodbc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded ");
		
		  String url="jdbc:oracle:thin:@localhost:1521:XE";
		  
		  Connection con = DriverManager.getConnection(url, "System", "root");
		  
		  System.out.println("connected successfully...");
		  
		  Statement st = con.createStatement();
		  
		  ResultSet rs = st.executeQuery("Select * from emp");
		  
		  /*while(rs.next()) {
		  System.out.println(rs.getString(1)+" "+rs.getInt(2));
		  }*/
		  
		/*int n = st.executeUpdate("insert into emp values('harry', 10)");
		 System.out.println(n+"  row inserted ");
		 */
		  
		 /* int p = st.executeUpdate("update emp set empid = empid+4 where empid = 1");
		  System.out.println(p+" row updated ");
	*/
		  
		  int k = st.executeUpdate("delete from emp where empid = 2");
		  System.out.println(k+" row deleted");
	}
	

}
