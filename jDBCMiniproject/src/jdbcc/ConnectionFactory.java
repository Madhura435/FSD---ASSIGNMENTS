package jdbcc;
import java.sql.*;
import java.util.*;
public class ConnectionFactory {
private static Connection conn=null;

public static Connection getConnection() throws SQLException
{
	
	ResourceBundle bundle = ResourceBundle.getBundle("jdbcc/dbConfig");
    String dc = bundle.getString("driverClass");
    String url = bundle.getString("url");
    String username = bundle.getString("username");
    String password = bundle.getString("password");

    conn = DriverManager.getConnection(url, username, password);
    
	
	return conn;
	
}

}
