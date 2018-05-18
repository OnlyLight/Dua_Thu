package connect;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
	public static void initDB(String nameDB) {
		String userName = "sa";
        String password = "123456";
		
		// Create a variable for the connection string.
	    String url = "jdbc:sqlserver://localhost:1433;" +
	       "databaseName="+ nameDB +";";

	    // Declare the JDBC objects.
	    Connection con = null;

	    try {
	       // Establish the connection.
	       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	       con = DriverManager.getConnection(url, userName, password);
	       
	       JOptionPane.showConfirmDialog(null, "Connected");
	    }
	    
	    // Handle any errors that may have occurred.  
	    catch (Exception e) {  
	    	JOptionPane.showMessageDialog(null, e);
	    }
	}
	
	public static void main(String[] args) {
		initDB("TestConnection");
	}
}
