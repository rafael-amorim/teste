package controllers;

import play.*;
import play.mvc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import models.*;

public class Application extends Controller {

	private static Connection con;
	private static Statement comando;
	
	private static void conectar() throws SQLException{
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
		}
	
			con = DriverManager.getConnection(  
			        "jdbc:postgresql://localhost:5432/agenda",  
			        "postgres",  
			        "local");
		
			comando =  con.createStatement();
	}
	
    public static void index() {
        render();
    }

}