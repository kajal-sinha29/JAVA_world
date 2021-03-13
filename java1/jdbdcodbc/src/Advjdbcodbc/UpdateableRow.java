package Advjdbcodbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateableRow {
	

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = st.executeQuery("select rollno, f_name, l_name, phn_no, address, marks from student");
		
		/*rs.moveToInsertRow();
		rs.updateInt(1, 131);
		rs.updateString(2, "Simran");
		rs.updateString(3, "sinha");
		rs.updateLong(4, 9800008);
		rs.updateString(5, "bbsr");
		rs.updateInt(6, 99);
		rs.insertRow();
		System.out.println("Row inserted.....");*/
		
		//updating value
		/*rs.absolute(13);
		rs.updateInt(1, 141);
		rs.updateString(2, "surbhi");
		rs.updateString(5, "Delhi");
		rs.updateRow();
		System.out.println("row updated......");
		*/
		
		//Deleting row
		rs.absolute(8);
		rs.deleteRow();
		System.out.println("row deleted.....");
		
        rs = st.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getInt(6));
		}
		
		
		
		
		
		
	}

}
