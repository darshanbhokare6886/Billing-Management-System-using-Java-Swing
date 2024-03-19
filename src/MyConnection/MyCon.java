package MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyCon {
	
	public static void insertData(String query) {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Darshan123");
	        Statement s = conn.createStatement();
	        int rowsUpdated = s.executeUpdate(query); // Use executeUpdate for INSERT statements
	        conn.close(); // Close the database connection when done
	        System.out.println(rowsUpdated + " row(s) affected.");
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}



	
	public static int updateData(String query) {
	    int rowsUpdated = 0;
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Darshan123");
	        Statement s = conn.createStatement();
	        rowsUpdated = s.executeUpdate(query); // Use executeUpdate for UPDATE statements
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return rowsUpdated;
	}

	public static ResultSet retrieveData(String query) {
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Darshan123");
            Statement s = conn.createStatement();
            resultSet = s.executeQuery(query);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
	
	public static int deleteData(String query) {
	    int rowsDeleted = 0;
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Darshan123");
	        Statement s = conn.createStatement();
	        rowsDeleted = s.executeUpdate(query); // Use executeUpdate for DELETE statements
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return rowsDeleted;
	}





}
