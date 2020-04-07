package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	Connection con;//*3
	PreparedStatement stmt;//*1
	ResultSet rs;//*2
	
	public void open() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");//*4
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdUM","root","");
		System.out.println("Ae, conectou");
		
	}
	
	public void close()throws Exception{
		con.close();
		
		
	}
	
	
	

}