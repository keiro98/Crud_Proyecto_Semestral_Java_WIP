
package capaDao;

import capaDb.Conexion;
import capaEntidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ClienteDao {
    private String mensaje = "";
    
    public String agregarCliente(Connection con, Cliente c){
        PreparedStatement pst = null;
        String sql =  "INSERT INTO CLIENTE (ID_CLIENTE, RUT_CLIENTE, P_NOMBRE_CLIENTE, S_NOMBRE_CLIENTE, APPAT_CLIENTE, APMAT_CLIENTE, TELEFONO_CLIENTE, EMAIL_CLIENTE) "
                   +  "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getIDCliente());
            pst.setString(2, c.getRutCliente());
            pst.setString(3, c.getpNombreCliente());
            pst.setString(4, c.getsNombreCliente());
            pst.setString(5, c.getApPatCliente());
            pst.setString(6, c.getApMatCliente());
            pst.setInt(7, c.getTelefonoCliente());
            pst.setString(8, c.getEmailCliente());
            mensaje =  "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR CORRECTAMENTE \n " + e.getMessage() ;
        }
        return mensaje;
    }
    
    
    
    public String modificarCliente(Connection con, Cliente c){
        PreparedStatement pst = null;
        String sql =  "UPDATE CLIENTE SET RUT_CLIENTE = ?, P_NOMBRE_CLIENTE = ?, S_NOMBRE_CLIENTE = ?, APPAT_CLIENTE = ?, APMAT_CLIENTE = ?, TELEFONO_CLIENTE = ?, EMAIL_CLIENTE = ? "
                    + "WHERE ID_CLIENTE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, c.getRutCliente());
            pst.setString(2, c.getpNombreCliente());
            pst.setString(3, c.getsNombreCliente());
            pst.setString(4, c.getApPatCliente());
            pst.setString(5, c.getApMatCliente());
            pst.setInt(6, c.getTelefonoCliente());
            pst.setString(7, c.getEmailCliente());
            pst.setInt(8, c.getIDCliente());
            mensaje =  "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO ACTUALIZAR CORRECTAMENTE \n " + e.getMessage() ;
        }
        return mensaje;
    }
    
    public String eliminarCliente(Connection con, int id){
        PreparedStatement pst = null;
        String sql =  "DELETE FROM CLIENTE WHERE ID_CLIENTE = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje =  "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO ELIMINAR CORRECTAMENTE \n " + e.getMessage() ;
        }
        return mensaje;
    }
    
    public void listarCliente(Connection con, JTable tabla){
        DefaultTableModel model;
        String[] columnas = {"ID", "RUT CLIENTE", "PRIMER NOMBRE", "SEGUNDO NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "TELEFONO", "EMAIL"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM CLIENTE ORDER BY ID_CLIENTE";
        
        String[] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
    
    public int getMaxID(Connection con){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT MAX (ID_CLIENTE)+1 FROM CLIENTE";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error al mostrar id " + e.getMessage());
        }
        return id;
    }
    
}
