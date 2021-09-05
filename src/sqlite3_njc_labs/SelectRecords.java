package sqlite3_njc_labs;

import java.sql.*;
public class SelectRecords {
    private Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:moviesdb.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
  
    public void selectAll(){  
        String sql = "SELECT * FROM users";  
          
        try {  
            Connection conn = this.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) {  
                System.out.println(rs.getString("moviename") +  "\t" +   
                                   rs.getString("lead_actor") + "\t" +  
                                   rs.getString("actress") + "\t" + 
                                   rs.getString("year_release") + "\t" +  
                                   rs.getString("director"));
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
      
     
    /** 
     * @param args the command line arguments 
     */  
    public static void main(String[] args) {  
        SelectRecords app = new SelectRecords();  
        app.selectAll();  
    }  

}
