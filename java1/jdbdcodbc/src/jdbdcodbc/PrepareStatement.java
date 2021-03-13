package jdbdcodbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrepareStatement {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		
		PreparedStatement st = con.prepareStatement("select * from student where rollno>?");
		st.setInt(1, 4);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getInt(6));
		}
		
		System.out.println("....-----------------------------------------------------------------------");
		
		st.clearParameters();
		
		st.setInt(1, 5);
		
		rs = st.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+rs.getString(5)+" "+rs.getInt(6));
		}
		
		System.out.println("========*********++++++========================");
		
		st.clearParameters();
		st.setInt(1, 4);
		rs = st.executeQuery();
		
        rs = st.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+rs.getString(5)+" "+rs.getInt(6));
		}
		
	}

}
