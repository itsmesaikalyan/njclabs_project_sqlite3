package sqlite3_njc_labs;

import java.sql.*;

public class ConnectDB {
	
    public static void connect() {  
        Connection conn = null;  
        try {  
            // db parameters  
            String url = "jdbc:sqlite:moviesdb.db";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
              
            System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } finally {  
            try {  
                if (conn != null) {  
                    conn.close();  
                }  
            } catch (SQLException ex) {  
                System.out.println(ex.getMessage());  
            }  
        }  
    }  
    /** 
     * @param args the command line arguments 
     */  
    public static void main(String[] args) {  
        connect();  
    }  

}
