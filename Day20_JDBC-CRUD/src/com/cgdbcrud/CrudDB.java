package com.cgdbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Apoorva@26";
	try
	{
	    Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
	    if(c!=null)
	    {
		System.out.println("The connection is established");
		c.close();
	  }
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	}

}
