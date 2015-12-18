package com.ust.datadriven.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.ust.datadriven.utility.ConfigReader.*;


public class DBReader {
	
	public Object[][] readDB() throws ClassNotFoundException, SQLException{
		Object array[][]= new Object[getRow()][getColumn()];
		// Step -1 Load the DB Driver
		//com.mysql.jdbc.Driver
		// oracle.jdbc.driver.OracleDriver
		//org.postgresql.Driver
		//Class.forName("com.mysql.jdbc.Driver");  // this will load a class
		Class.forName(getDriver());
		// Step -2 Connect to the DataBase
		// jdbc:mysql://localhost:3306/dbname
		// Oracle jdbc:oracle:thin:@localhost:1521:dbname
		/*Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/selenium_dec_db"
						,"root","root");
		*/
		Connection con = DriverManager
				.getConnection(getConnectionURL()
						,getUserid(),getPassword());
		// Step -3 Do DB Query
		PreparedStatement pstmt = con.
				prepareStatement(getSQL());
		// Step -4 Get the Result of the Query
		ResultSet rs = pstmt.executeQuery();
		// Step -5 Traverse the Result
		int row = 0;
		
		while(rs.next()){
		
		array[row][0] = rs.getString("userid");
		array[row][1]= rs.getString("password");
		row++;
		}
		rs.close();
		pstmt.close();
		con.close();
		return array;
	}

}
