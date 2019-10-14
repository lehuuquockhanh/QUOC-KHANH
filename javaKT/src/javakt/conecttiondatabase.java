package javakt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conecttiondatabase {
	
	public static Connection getConnection() {
		Connection conn = null;
		
	    String sqlInstanceName = "DESKTOP-FCIO1AJ\\SQLEXPRESS";
	    String database = "QLSV";
		
       
        String connectionUrl = "jdbc:sqlserver://" + sqlInstanceName + ";databaseName=QLSV" + database ;
        
        try{
        	conn = DriverManager.getConnection(connectionUrl); 
        	
        	if (conn != null) {
                System.out.println("Connected");
            }else {
            	System.out.println("Khong ket noi duoc voi database");
            }
        	
            return conn;
        }

        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Khong ket noi duoc voi database");
            return conn;
        }
    }
}
