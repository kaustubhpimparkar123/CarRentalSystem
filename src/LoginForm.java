
import java.sql.*;
public class LoginForm {

   public static Connection guicon(){
       
        Connection con=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/page","root","root");
//            StackTraceElement[] st = Thread.currentThread().getStackTrace();
//            System.out.println(  "create connection called from " + st[2] );  
            
        }
        catch(SQLException|ClassNotFoundException s)
        {
            s.printStackTrace();
        }
        return con;

}
   
    
}
