
package capaNegocios;

import capaDao.DepartamentoDao;
import capaDb.Conexion;
import capaEntidades.Departamento;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;


public class NegDepartamento {
    
    private String mensaje = "";
    private DepartamentoDao deptoDao =  new DepartamentoDao();
    
    public String agregarDepartamento(Departamento depto){
        Connection conn  = Conexion.getConnection();
        
        try 
        {
            mensaje = deptoDao.agregarDepartamento(conn, depto);
            
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
    
    public String modificarDepartamento(Departamento depto){
        Connection conn  = Conexion.getConnection();
        
        try 
        {
            mensaje = deptoDao.modificarDepartamento(conn, depto);
            
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
    
    public String eliminarDepartamento(int id){
        Connection conn  = Conexion.getConnection();
        
        try 
        {
            mensaje = deptoDao.eliminarDepartamento(conn, id);
            
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
    
    public void listarDepartamento(JTable tabla){
        Connection conn = Conexion.getConnection();
        deptoDao.listarDepartamento(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public int getMaxID(){
       Connection conn = Conexion.getConnection();
        int id = deptoDao.getMaxID(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }
}
