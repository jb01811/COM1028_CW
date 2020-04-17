/**
 * @author Jack Ball (jb01811)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	private static final String host = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=GMT";
	private static final String user = "root";
	private static final String password = "admin";
	
	public static void main(String[] args) {
		


	        try {
	        	Connection conn = DriverManager.getConnection(host, user, password); {
	        }
	                
	            if (conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");
	            }
	
	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	
	    }
	}
	
 
