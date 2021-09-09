/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaVistasDepartamentos;

import capaVistasDepartamentos.*;
import capaVistas.VLogin;
import capaNegocios.NegDepartamento;
import capaEntidades.Departamento;
import javax.swing.JOptionPane;


/**
 *
 * @author Keiro
 */
public class VDptoAgregar extends javax.swing.JFrame {

    /**
     * Creates new form VDptoAgregar
     */
    
    private NegDepartamento nDpto = new NegDepartamento();
    public VDptoAgregar() {
        
        initComponents();
        //Iniciamos con elementos deshabilitados
        btnAgregar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        txtIdSiguiente.setEnabled(false);
        txtNombCDptoA.setEnabled(false);
        txtDireccionDptoA.setEnabled(false);
        //
       idMax();
        
        setTitle("AGREGAR DEPARTAMENTO"); //El titulo de la ventana
        setLocationRelativeTo(null); // Centrado
        setResizable(false); // No se puede maximizar
        
    }
    
    public void idMax(){
        txtIdSiguiente.setText(nDpto.getMaxID()+"");
        nDpto.getMaxID();
        
    } 
    
    public void habilitarBotonAgregar(){
        if(txtId.getText().isEmpty() || txtNombCDptoA.getText().isEmpty() 
        || txtDireccionDptoA.getText().isEmpty()){
        btnAgregar.setEnabled(false);
    } else{
            btnAgregar.setEnabled(true);
        }
    }
    
    private void habilitarBotonLimpiar(){
        if(txtId.getText().isEmpty() && txtNombCDptoA.getText().isEmpty() 
        && txtDireccionDptoA.getText().isEmpty()){
        btnLimpiar.setEnabled(false);
    } else{
            btnLimpiar.setEnabled(true);
        }
    }
    
    public void habilitarTxtFields(){
        if (txtId.getText().isEmpty()){
            txtNombCDptoA.setEnabled(false);
            txtDireccionDptoA.setEnabled(false);
        }
        else{
            txtNombCDptoA.setEnabled(true);
            txtDireccionDptoA.setEnabled(true);
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombCDptoA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccionDptoA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdSiguiente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMOpcionesA = new javax.swing.JMenu();
        jMIVAA = new javax.swing.JMenuItem();
        jMICSA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre Ciudad:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtNombCDptoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombCDptoAKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombCDptoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 330, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("AGREGAR DEPARTAMENTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 340, 40));

        txtDireccionDptoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionDptoAKeyReleased(evt);
            }
        });
        jPanel1.add(txtDireccionDptoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 330, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Direccion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtIdSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSiguienteActionPerformed(evt);
            }
        });
        txtIdSiguiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdSiguienteKeyReleased(evt);
            }
        });
        jPanel1.add(txtIdSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 330, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 40));

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, 40));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 100, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("El Id que sigue es:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 330, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 350));

        jMOpcionesA.setText("Opciones");

        jMIVAA.setText("Volver atras");
        jMIVAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVAAActionPerformed(evt);
            }
        });
        jMOpcionesA.add(jMIVAA);

        jMICSA.setText("Cerrar Sesion");
        jMICSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICSAActionPerformed(evt);
            }
        });
        jMOpcionesA.add(jMICSA);

        jMenuBar1.add(jMOpcionesA);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtIdSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSiguienteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (txtId.getText().isEmpty() || txtNombCDptoA.getText().isEmpty() ||
            txtDireccionDptoA.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
        else {
            Departamento dpto = new Departamento(); 
            dpto.setIDDepartamento(Integer.parseInt(txtId.getText() )); //Id Departamento
            dpto.setNombCiudadDepartamento(txtNombCDptoA.getText()); //Rut departamento
            dpto.setDireccionDepartamento(txtDireccionDptoA.getText()); //Primer nombre
            String mensaje = nDpto.agregarDepartamento(dpto);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            habilitarBotonAgregar();
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jMIVAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVAAActionPerformed
        VAdminDpto vADpto= new VAdminDpto();
        vADpto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMIVAAActionPerformed

    private void jMICSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICSAActionPerformed
        VLogin vLog= new VLogin();
        vLog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMICSAActionPerformed

    private void txtIdSiguienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSiguienteKeyReleased
//        habilitarBotonAgregar();
//        habilitarBotonLimpiar();
//        habilitarTxtFields();
    }//GEN-LAST:event_txtIdSiguienteKeyReleased

    private void txtNombCDptoAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombCDptoAKeyReleased
        habilitarBotonAgregar();
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtNombCDptoAKeyReleased

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        habilitarBotonAgregar();
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtDireccionDptoAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionDptoAKeyReleased
        habilitarBotonAgregar();
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtDireccionDptoAKeyReleased

    public void limpiar(){
        txtId.setText("");
        txtNombCDptoA.setText("");
        txtDireccionDptoA.setText("");
        idMax();
        habilitarBotonLimpiar();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VDptoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDptoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDptoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDptoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDptoAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMICSA;
    private javax.swing.JMenuItem jMIVAA;
    private javax.swing.JMenu jMOpcionesA;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDireccionDptoA;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdSiguiente;
    private javax.swing.JTextField txtNombCDptoA;
    // End of variables declaration//GEN-END:variables
}
