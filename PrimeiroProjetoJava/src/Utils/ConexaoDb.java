package Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDb {
    private static Connection con = null;
    static String user = "root";
    static  String password = "admin";
    static String url = "jdbc:mysql://localhost:3306/db_java";

    public static Connection getConexao(){
        try{
            con = DriverManager.getConnection(url,user,password);

        }catch (SQLException ex){
            System.out.println("Erro: " + ex.getMessage());        };
        return con;
    }
}
