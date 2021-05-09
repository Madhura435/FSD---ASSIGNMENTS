package jdbcc;

import java.sql.*;  
public class Jdbc1{  
public static void main(String args[]) throws ClassNotFoundException, SQLException{  
	
	//Class.forName("com.mysql.jdbc.Driver"); 
	//Class.forName("com.mysql.jdbc.Driver");  
	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con=DriverManager.getConnection(  
//			"jdbc:mysql://localhost:3306/haritha","root","root"); 
	
	Connection con=DriverManager.getConnection
	
			("jdbc:mysql://localhost:3306/haritha?autoReconnect=true&useSSL=false","root","root");

	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from stud_tab");  
	while(rs.next())  
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+
	rs.getString(3)+" "+rs.getString(2));  
	con.close();  


}  
}  
