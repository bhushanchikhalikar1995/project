package DBManager;
import java.sql.*;
public class DBManager {

	public Connection connection;
	public Statement statement;
	
	public void loader()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void connect()
	{
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/peoject", "root" , "123456");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
