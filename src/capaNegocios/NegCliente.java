
package capaNegocios;

import capaDao.ClienteDao;
import capaDb.Conexion;
import capaEntidades.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;


public class NegCliente {
    private String mensaje = "";
    private ClienteDao cDao =  new ClienteDao();
    
    public String agregarCliente(Cliente c){
        Connection conn  = Conexion.getConnection();
        
        try 
        {
            mensaje = cDao.agregarCliente(conn, c);
            
        } catch (Exception e) 
        {
            mensaje =  mensaje + " " + e.getMessage();
        } finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarCliente(Cliente c){
        Connection conn  = Conexion.getConnection();
        
        try 
        {
            mensaje = cDao.modificarCliente(conn, c);
            
        } catch (Exception e) 
        {
            mensaje =  mensaje + " " + e.getMessage();
        } finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String eliminarCliente(int id){
        Connection conn  = Conexion.getConnection();
        
        try 
        {
            mensaje = cDao.eliminarCliente(conn, id);
            
        } catch (Exception e) 
        {
            mensaje =  mensaje + " " + e.getMessage();
        } finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public void listarCliente(JTable tabla){
        Connection conn = Conexion.getConnection();
        cDao.listarCliente(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
//    public void buscarCliente(JTable tabla){
//        Connection conn = Conexion.getConnection();
//        cDao.buscarCliente(conn, tabla);
//        try {
//            conn.close();
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
    
    public int getMaxID(){
       Connection conn = Conexion.getConnection();
        int id = cDao.getMaxID(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }
}
