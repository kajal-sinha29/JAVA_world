package jdbdcodbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Dml {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		
		System.out.println("connected sucessfully");
		
		Statement st = con.createStatement();
		
		int n = st.executeUpdate("insert into student values(20, 'Anjali', 'Rahul',14444447, 'Singapore', 59 )");
		System.out.println(n+" row inserted.....");
		
		/*int d = st.executeUpdate("delete from student where rollno = 12");
		System.out.println(d+"row deleted...");*/
		
		/*int u = st.executeUpdate("update student set f_name = 'suraj' where rollno = 9");
		System.out.println(u+" updated row...");*/
		
	}

}
