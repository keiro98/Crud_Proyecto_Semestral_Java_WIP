/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaVistasClientes;

import capaVistas.VLogin;
import capaNegocios.NegCliente;
import capaEntidades.Cliente;
import javax.swing.JOptionPane;


/**
 *
 * @author Keiro
 */
public class VCliAgregar extends javax.swing.JFrame {

    /**
     * Creates new form VCliAgregar
     */
    
    private NegCliente nCli = new NegCliente();
    public VCliAgregar() {
        
        initComponents();
        //Iniciamos con elementos deshabilitados
        btnAgregar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        txtIdSiguiente.setEnabled(false);
        txtRut.setEnabled(false);
        txtPrNombre.setEnabled(false);
        txtSNombre.setEnabled(false);
        txtApPat.setEnabled(false);
        txtApMat.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtEmail.setEnabled(false);
        //
       idMax();
        
        setTitle("AGREGAR CLIENTE"); //El titulo de la ventana
        setLocationRelativeTo(null); // Centrado
        setResizable(false); // No se puede maximizar
        
    }
    
    public void idMax(){
        txtIdSiguiente.setText(nCli.getMaxID()+"");
        nCli.getMaxID();
        
    } 
    
    public void habilitarBotonAgregar(){
        if(txtId.getText().isEmpty() || txtRut.getText().isEmpty() || txtPrNombre.getText().isEmpty()
           || txtApPat.getText().isEmpty() || txtApMat.getText().isEmpty() || txtTelefono.getText().isEmpty()
           || txtEmail.getText().isEmpty()){
        btnAgregar.setEnabled(false);
    } else{
            btnAgregar.setEnabled(true);
        }
    }
    
    private void habilitarBotonLimpiar(){
        if(txtId.getText().isEmpty() && txtRut.getText().isEmpty() && txtPrNombre.getText().isEmpty()
           && txtSNombre.getText().isEmpty() && txtApPat.getText().isEmpty() && txtApMat.getText().isEmpty()
           && txtTelefono.getText().isEmpty()
           && txtEmail.getText().isEmpty()){
        btnLimpiar.setEnabled(false);
    } else{
            btnLimpiar.setEnabled(true);
        }
    }
    
    public void habilitarTxtFields(){
        if (txtId.getText().isEmpty()){
            txtRut.setEnabled(false);
            txtPrNombre.setEnabled(false);
            txtSNombre.setEnabled(false);
            txtApPat.setEnabled(false);
            txtApMat.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtEmail.setEnabled(false);
        }
        else{
            txtRut.setEnabled(true);
            txtPrNombre.setEnabled(true);
            txtSNombre.setEnabled(true);
            txtApPat.setEnabled(true);
            txtApMat.setEnabled(true);
            txtTelefono.setEnabled(true);
            txtEmail.setEnabled(true);
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
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApMat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdSiguiente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtSNombre = new javax.swing.JTextField();
        txtApPat = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
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
        jLabel1.setText("Rut:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 330, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("AGREGAR CLIENTES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 250, 40));

        txtPrNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrNombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtPrNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 330, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Primer Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtApMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApMatKeyReleased(evt);
            }
        });
        jPanel1.add(txtApMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 330, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Segundo Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Apellido Paterno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Apellido Materno:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Telefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 330, -1));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, 40));

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, 40));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 100, 40));

        txtSNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSNombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtSNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 330, -1));

        txtApPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApPatKeyReleased(evt);
            }
        });
        jPanel1.add(txtApPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 330, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 330, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Email:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 530));

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
            if (txtIdSiguiente.getText().isEmpty() || txtRut.getText().isEmpty() ||
            txtPrNombre.getText().isEmpty() || txtApPat.getText().isEmpty() || txtApMat.getText().isEmpty() ||
            txtTelefono.getText().isEmpty() || txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos, (Segundo nombre es opcional)");
        }
        else {
            Cliente cli = new Cliente(); 
            cli.setIDCliente(Integer.parseInt(txtIdSiguiente.getText() )); //Id cliente
            cli.setRutCliente(txtRut.getText()); //Rut cliente
            cli.setpNombreCliente(txtPrNombre.getText()); //Primer nombre
            cli.setsNombreCliente(txtSNombre.getText()); //Segundo nombre
            cli.setApPatCliente(txtApPat.getText()); //Apellido Paterno
            cli.setApMatCliente(txtApMat.getText()); //Apellido Materno
            cli.setTelefonoCliente(Integer.parseInt(txtTelefono.getText())); //Telefono
            cli.setEmailCliente(txtEmail.getText()); //Email
            String mensaje = nCli.agregarCliente(cli);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            habilitarBotonAgregar();
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jMIVAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVAAActionPerformed
        VAdminClientes vAC= new VAdminClientes();
        vAC.setVisible(true);
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

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        habilitarBotonAgregar();
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtRutKeyReleased

    private void txtPrNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrNombreKeyReleased
         habilitarBotonAgregar();
         habilitarBotonLimpiar();
         habilitarTxtFields();
    }//GEN-LAST:event_txtPrNombreKeyReleased

    private void txtApPatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPatKeyReleased
       habilitarBotonAgregar();
       habilitarBotonLimpiar();
       habilitarTxtFields();
    }//GEN-LAST:event_txtApPatKeyReleased

    private void txtApMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMatKeyReleased
        habilitarBotonAgregar();
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtApMatKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        habilitarBotonAgregar();
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        habilitarBotonAgregar();
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSNombreKeyReleased
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtSNombreKeyReleased

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        habilitarBotonAgregar();
        habilitarBotonLimpiar();
        habilitarTxtFields();
    }//GEN-LAST:event_txtIdKeyReleased

    public void limpiar(){
        txtId.setText("");
        txtRut.setText("");
        txtPrNombre.setText("");
        txtSNombre.setText("");
        txtApPat.setText("");
        txtApMat.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
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
            java.util.logging.Logger.getLogger(VCliAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCliAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCliAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCliAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCliAgregar().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMICSA;
    private javax.swing.JMenuItem jMIVAA;
    private javax.swing.JMenu jMOpcionesA;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdSiguiente;
    private javax.swing.JTextField txtPrNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtSNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}