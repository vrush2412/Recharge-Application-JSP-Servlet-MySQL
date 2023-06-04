package Bank.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnection()
	{   
		String str="oracle.jdbc.OracleDriver";
		String Url="jdbc:oracle:thin:@localhost:1521:XE";
		String uname="System";
		String pass="123456789";
		Connection con=null;
		try {
			Class.forName(str);
			con=DriverManager.getConnection(Url, uname, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}


}
