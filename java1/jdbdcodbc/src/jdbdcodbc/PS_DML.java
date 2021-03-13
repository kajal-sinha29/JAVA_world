package jdbdcodbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PS_DML {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		System.out.println("CONNECTED SUCCESSFULLY.....");
		
		PreparedStatement st = con.prepareStatement("insert into student values(?, ?, ?, ?, ?, ?)");
		
		st.setInt(1, 15);
		st.setString(2, "Narendra");
		st.setString(3,  "Modi");
		st.setLong(4, 8888777);
		st.setString(5, "India");
		st.setInt(6, 83);
		st.executeQuery();
		System.out.println("row inserted....");
		
	}

}
