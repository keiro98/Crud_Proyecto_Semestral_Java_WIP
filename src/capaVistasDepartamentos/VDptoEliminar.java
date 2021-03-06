/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaVistasDepartamentos;

import capaVistasDepartamentos.*;
import capaVistas.VLogin;
import capaNegocios.NegDepartamento;
import javax.swing.JOptionPane;



/**
 *
 * @author Keiro
 */
public class VDptoEliminar extends javax.swing.JFrame {
    
    private VDptoAgregar vDptoA = new VDptoAgregar();
    private NegDepartamento nDpto = new NegDepartamento();

    /**
     * Creates new form VEmpEliminar
     */
    public VDptoEliminar() {
        initComponents();
        nDpto.listarDepartamento(tbDpto);
        idMax();
        
        
        setTitle("ELIMINAR");
        setLocationRelativeTo(null);
        setResizable(false);
        
    }
    
    public void idMax(){
        txtIdE.setText(nDpto.getMaxID()+"");
        nDpto.getMaxID();
        
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
        txtIdE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDpto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMOpcionesE = new javax.swing.JMenu();
        jMIVAE = new javax.swing.JMenuItem();
        jMICSE = new javax.swing.JMenuItem();
        jMISalirE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbDpto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDpto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDptoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDpto);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ELIMINAR DEPARTAMENTOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdE, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMOpcionesE.setText("Opciones");

        jMIVAE.setText("Volver atras");
        jMIVAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVAEActionPerformed(evt);
            }
        });
        jMOpcionesE.add(jMIVAE);

        jMICSE.setText("Cerrar Sesion");
        jMICSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICSEActionPerformed(evt);
            }
        });
        jMOpcionesE.add(jMICSE);

        jMISalirE.setText("Salir");
        jMISalirE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirEActionPerformed(evt);
            }
        });
        jMOpcionesE.add(jMISalirE);

        jMenuBar1.add(jMOpcionesE);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDptoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDptoMouseClicked
        int seleccion = tbDpto.rowAtPoint(evt.getPoint());
        txtIdE.setText(tbDpto.getValueAt(seleccion, 0)+"");
    }//GEN-LAST:event_tbDptoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtIdE.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } 
        else {
            
            String mensaje = nDpto.eliminarDepartamento(Integer.parseInt(txtIdE.getText()));
            JOptionPane.showMessageDialog(null, mensaje);
            vDptoA.limpiar();
            idMax();
            nDpto.listarDepartamento(tbDpto);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMISalirEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirEActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISalirEActionPerformed

    private void jMICSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICSEActionPerformed
        VLogin vLog= new VLogin();
        vLog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMICSEActionPerformed

    private void jMIVAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVAEActionPerformed
        VAdminDpto vADpto= new VAdminDpto();
        vADpto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMIVAEActionPerformed

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
            java.util.logging.Logger.getLogger(VDptoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDptoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDptoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDptoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VDptoEliminar().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMICSE;
    private javax.swing.JMenuItem jMISalirE;
    private javax.swing.JMenuItem jMIVAE;
    private javax.swing.JMenu jMOpcionesE;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDpto;
    private javax.swing.JTextField txtIdE;
    // End of variables declaration//GEN-END:variables
}
