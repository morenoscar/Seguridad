/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar Moreno & Carlos Quimbay
 */
public class PerfilUsuario extends javax.swing.JFrame {

 private static Connection conex;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static String username=null;

    /**
     * Creates new form PerfilUsuario
     */
    public PerfilUsuario(String username, Connection conex) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.conex = conex;
        this.username=username;
        try {
            ps = conex.prepareStatement("select * from SEGURIDAD where USERNAME = '" + username + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                nombre.setText(rs.getString("PNOMBRE"));
                apellido.setText(rs.getString("PAPELLIDO"));
                email.setText(rs.getString("EMAIL"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerfilUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private PerfilUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        RegMed = new javax.swing.JButton();
        RegFina = new javax.swing.JButton();
        Grupos = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Custodio = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        jImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
        jLabel1.setText("Perfil del Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        nombre.setEditable(false);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 97, 148, -1));

        apellido.setEditable(false);
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 97, 173, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 83, -1));

        jButtonSalir.setText("Salir");
        jButtonSalir.setActionCommand("JButton1");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        RegMed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegMed.setText("Registros Médicos");
        RegMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegMedActionPerformed(evt);
            }
        });
        getContentPane().add(RegMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        RegFina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegFina.setText("Registro Financiero");
        RegFina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegFinaActionPerformed(evt);
            }
        });
        getContentPane().add(RegFina, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        Grupos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Grupos.setText("Grupos");
        getContentPane().add(Grupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 316, 119, -1));

        email.setEditable(false);
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 162, 333, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        Custodio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Custodio.setText("Custodio");
        Custodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustodioActionPerformed(evt);
            }
        });
        getContentPane().add(Custodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, -1));

        Usuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, -1));

        jImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securea/abstract_bg.jpeg"))); // NOI18N
        getContentPane().add(jImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void RegMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegMedActionPerformed
        // TODO add your handling code here:
        new RegMedico(username,conex).setVisible(true);
    }//GEN-LAST:event_RegMedActionPerformed

    private void RegFinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegFinaActionPerformed
        // TODO add your handling code here:
        new RegFinanciero(username,conex).setVisible(true);
    }//GEN-LAST:event_RegFinaActionPerformed

    private void CustodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustodioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustodioActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Custodio;
    private javax.swing.JButton Grupos;
    private javax.swing.JButton RegFina;
    private javax.swing.JButton RegMed;
    private javax.swing.JButton Usuarios;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
