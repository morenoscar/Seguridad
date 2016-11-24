/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import utils.HashGenerationException;

/**
 *
 * @author Oscar Moreno & Carlos Quimbay
 */
public class NuevoUsuario extends javax.swing.JFrame {

    private Connection conex;
    private Map<String, String> usuarios;
    private static PreparedStatement ps = null;

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario(Connection conex, Map<String, String> user) {
        System.out.println("entró");
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        usuarios = user;
        this.conex = conex;
    }

    private NuevoUsuario() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jNombre2 = new javax.swing.JTextField();
        jApellido1 = new javax.swing.JTextField();
        jApellido2 = new javax.swing.JTextField();
        jeMail = new javax.swing.JTextField();
        jUser = new javax.swing.JTextField();
        bAgregar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Luna", 0, 14)); // NOI18N
        jLabel1.setText("Nuevo Usuario");

        jLabel2.setText("Primer Nombre");

        jLabel3.setText("Segundo Nombre");

        jLabel4.setText("Primer Apellido");

        jLabel5.setText("Segundo Apellido");

        jLabel6.setText("e-mail");

        jLabel7.setText("Usuario");

        jLabel8.setText("Contraseña");

        bAgregar.setBackground(new java.awt.Color(51, 153, 255));
        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(bAgregar))
                            .addComponent(jNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jNombre2)
                            .addComponent(jApellido1)
                            .addComponent(jApellido2)
                            .addComponent(jeMail)
                            .addComponent(jUser)
                            .addComponent(jPasswordField))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jeMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregar)
                    .addComponent(bCancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        // TODO add your handling code here:
        String pass = "";
        pass = new String(jPasswordField.getPassword());
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        System.out.println(pass.matches(pattern));
        if (jNombre.getText()
                .equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe indicar el Nombre del usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jApellido1.getText()
                .equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe indicar el Apellido del usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jeMail.getText()
                .equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe indicar el Correo del usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jUser.getText()
                .equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe indicar el Username", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (usuarios.containsKey(jUser.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "El usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (pass.equals(
                "")) {
            JOptionPane.showMessageDialog(new JFrame(), "Debe indicar el PASSWORD del usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!pass.matches(pattern)) {
            JOptionPane.showMessageDialog(new JFrame(), "La contraseña no cumple con las siguientes restricciones: \n 8 caracteres\n +1 Mayúscula \n +1 Minúscula \n +1 Caracter especial", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!usuarios.containsKey(jUser.getText())) {
            try {
                pass = utils.HashGeneratorUtils.generateSHA256(new String(jPasswordField.getPassword()));
                ps = conex.prepareStatement("insert into SEGURIDAD values (?,?,?,?,?,?,?,?)");
                ps.setString(1, jUser.getText());
                ps.setString(2, pass);
                ps.setString(3, jNombre.getText());
                ps.setString(4, jNombre2.getText());
                ps.setString(5, jApellido1.getText());
                ps.setString(6, jApellido2.getText());
                ps.setString(7, jeMail.getText());
                ps.setString(8, (new Timestamp(System.currentTimeMillis())).toString());
                ps.executeUpdate();
                conex.commit();
                usuarios.put(jUser.getText(), pass);
                JOptionPane.showMessageDialog(new JFrame(), "Usuario credo exitosamente", "Exito", JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                new Principal().setVisible(true);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(new JFrame(), "Error al crear usuario", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (HashGenerationException ex) {
                Logger.getLogger(NuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Usuario ya esta registrado en el sistema", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bCancelar;
    private static javax.swing.JTextField jApellido1;
    private static javax.swing.JTextField jApellido2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JTextField jNombre;
    private static javax.swing.JTextField jNombre2;
    private static javax.swing.JPasswordField jPasswordField;
    private static javax.swing.JTextField jUser;
    private static javax.swing.JTextField jeMail;
    // End of variables declaration//GEN-END:variables
}
