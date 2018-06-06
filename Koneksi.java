package wedding;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {
    public static String username = "";
    public static String kodepesan = "";
    public static String nama = "";
    Connection conn;
    public Connection conn(){
        try {
            String url ="jdbc:mysql://localhost/db_wedding_organizer";
            String user="root";
            String pass="";
            conn = DriverManager.getConnection(url,user,pass);
            
            System.out.println("Koneksi ke database berhasil");
        } catch (SQLException e) {
            System.err.println("Koneksi ke database gagal" +e.getMessage());
        }
        return conn;
    }
    public Connection disc(){
        try{
            conn.close();
            System.out.println("Database berhasil diputus");
        }catch(SQLException e){
            System.err.println("Database gagal diputus");
        }
        return conn;
    }
}