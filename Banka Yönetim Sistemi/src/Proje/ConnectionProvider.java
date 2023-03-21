
package Proje;
import java.sql.*;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.SQLError;

public class ConnectionProvider {
  
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //banka: olusturdugum database adim
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banka","root","tx9vfneu");
            return con;
        }
        catch(Exception e){
            return null;
        }
}
    
    static String kullaniciAdi="root";
    static String sifre="tx9vfneu";
    static String dbUrl="jdbc:mysql://localhost:3306/banka";
    
    public Connection getConnection() throws SQLException{
        return(Connection) DriverManager.getConnection(dbUrl,kullaniciAdi,sifre);
    }

    public void showError(SQLException exception){
        System.out.println("error:" + exception.getMessage());
        System.out.println("error code:" + exception.getErrorCode());
    }
    
}
