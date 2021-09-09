
package capaDao;

import capaEntidades.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DepartamentoDao {
    private String mensaje = "";
    
    public String agregarDepartamento(Connection con, Departamento dpto){
        PreparedStatement pst = null;
        String sql =  "INSERT INTO DEPARTAMENTO(ID_DEPARTAMENTO, NOMBCIUDAD_DEPARTAMENTO, DIRECION_DEPARTAMENTO) "
                    + "VALUES (?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, dpto.getIDDepartamento());
            pst.setString(2, dpto.getNombCiudadDepartamento());
            pst.setString(3, dpto.getDireccionDepartamento());
            mensaje =  "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR CORRECTAMENTE \n " + e.getMessage() ;
        }
        return mensaje;
    }
    
    public String modificarDepartamento(Connection con, Departamento dpto){
        PreparedStatement pst = null;
        String sql =  "UPDATE DEPARTAMENTO SET NOMBCIUDAD_DEPARTAMENTO = ?, DIRECION_DEPARTAMENTO = ?"
                + "WHERE ID_DEPARTAMENTO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, dpto.getNombCiudadDepartamento());
            pst.setString(2, dpto.getDireccionDepartamento());
            pst.setInt(3, dpto.getIDDepartamento());
            mensaje =  "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO ACTUALIZAR CORRECTAMENTE \n " + e.getMessage() ;
        }
        return mensaje;
    }
    
    public String eliminarDepartamento(Connection con, int id){
        PreparedStatement pst = null;
        String sql =  "DELETE FROM DEPARTAMENTO WHERE ID_DEPARTAMENTO = ? ";
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
    
    public void listarDepartamento(Connection con, JTable tabla){
        DefaultTableModel model;
        String[] columnas = {"ID", "NOMBRE CIUDAD", "DIRECCION"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM DEPARTAMENTO ORDER BY ID_DEPARTAMENTO";
        
        String[] filas = new String[3];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 3; i++) {
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
        String sql = "SELECT MAX (ID_DEPARTAMENTO)+1 FROM DEPARTAMENTO";
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

