package connections;
import java.sql.*;


public class Register_connect {
    
     static Connection conn;
  
     
  public static Connection dbconnect(){
    
    try{
        //load the driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //Creat a connection
        String url="jdbc:mysql://localhost:3306/miniproject";
        String user="root";
        String password="@31Dec2003";
        conn=DriverManager.getConnection(url,user,password);
       
        
        
        
        
    }
    catch(Exception e){
        e.printStackTrace();
       
    }
     return conn;
    }
}