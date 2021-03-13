package jdbdcodbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;


public class CS_proc {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		
		System.out.println("........---connected sucessfully---.......");
		
		CallableStatement cst = con.prepareCall("{call updaterollno(?,?)}");
		
		cst.setInt(1,101);  
		cst.setInt(4,5400); 		 
		cst.execute();  
		System.out.println("=====___----Done ------___=====");
	}

}
