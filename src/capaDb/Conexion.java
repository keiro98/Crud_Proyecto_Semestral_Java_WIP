
package capaDb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//NO OLVIDAR IMPORTAR DRIVER(JAR/FOLDER) QUE SE ENCUENTRA EN LA RUTA : sqldeveloper/jdbc/lib

public class Conexion {
    
    private static Connection conn = null;
    private static String login = "Keiro_Palomera";
    private static String clave = "12345";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,clave);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexion Exitosa");
            } else {
                System.out.println("Conexion es erronea");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea: " + e.getMessage());
        }
        return conn;
    }
    
    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar: " + e.getMessage());
            
        }
    }
    
    public Connection getConn(){
        return conn;
    }
    
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.getConnection();
    }
}
