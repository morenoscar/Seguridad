/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securea;

/**
 *
 * @author chArLOz
 */
public class RegFinanciero extends javax.swing.JFrame {

    /**
     * Creates new form RegFinan
     */
    public RegFinanciero() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
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
        jButOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextActivos = new javax.swing.JTextField();
        jTextPasivos = new javax.swing.JTextField();
        jTextCCorr = new javax.swing.JTextField();
        jTextCredito = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Registro Financiero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 27, -1, -1));

        jButOK.setText("OK");
        jButOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel2.setText("Activos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 82, -1, -1));

        jLabel3.setText("Pasivos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 126, -1, -1));

        jLabel4.setText("Cuenta Corrienta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 170, -1, -1));

        jLabel5.setText("Tarjeta de Credito");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 214, -1, -1));
        getContentPane().add(jTextActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 101, -1));
        getContentPane().add(jTextPasivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 101, -1));
        getContentPane().add(jTextCCorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 101, -1));

        jTextCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 101, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securea/abstract_bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCreditoActionPerformed

    private void jButOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOKActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButOKActionPerformed

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
            java.util.logging.Logger.getLogger(RegFinanciero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegFinanciero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegFinanciero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegFinanciero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegFinanciero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextActivos;
    private javax.swing.JTextField jTextCCorr;
    private javax.swing.JTextField jTextCredito;
    private javax.swing.JTextField jTextPasivos;
    // End of variables declaration//GEN-END:variables
}
