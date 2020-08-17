package dao.personne;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Connixion {
private Connection con;
private Statement stm;

public void connect() throws Exception{
	
	Class.forName("com.mysql.jdbc.Driver");
	
	String url="jdbc:mysql://localhost/tp";
	
	con= (Connection) DriverManager.getConnection(url,"root","");
	stm= (Statement) con.createStatement();
	
}
public void disconnect() throws Exception
{
	
	stm.close();
	con.close();
	
	
}
public int Maj(String sql) throws Exception {
	
	
	return stm.executeUpdate(sql);
}
public  ResultSet select(String sql) throws Exception {
	
	return stm.executeQuery(sql) ;
	
	}

}



