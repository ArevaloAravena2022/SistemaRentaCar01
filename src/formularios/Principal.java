/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Aravena
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private int opcion;
    ControlAdministrador ca;
    ControlPersonal cp;
    public Principal() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAdministrador = new javax.swing.JMenuItem();
        jmPersonal = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmFinalizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Renta-Car");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Sistema Renta-Car.");

        jLabel2.setText("By: Arevalo Ninoska, Aravena Carlos");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setToolTipText("");

        jMenu1.setText("Cargos");

        jmAdministrador.setText("Administrador");
        jmAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdministradorActionPerformed(evt);
            }
        });
        jMenu1.add(jmAdministrador);

        jmPersonal.setText("Personal");
        jmPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPersonalActionPerformed(evt);
            }
        });
        jMenu1.add(jmPersonal);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jmFinalizar.setText("Salir del Sistema");
        jmFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFinalizarActionPerformed(evt);
            }
        });
        jMenu2.add(jmFinalizar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 236, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(439, 233));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFinalizarActionPerformed
        // TODO add your handling code here:
        opcion = 0;
        opcion = JOptionPane.showConfirmDialog(this,
                "¿Desea Salir del Sistema?",
                "Salir del Sistema",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(opcion == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jmFinalizarActionPerformed

    private void jmAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdministradorActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ca = new ControlAdministrador();
        ca.setVisible(true);
    }//GEN-LAST:event_jmAdministradorActionPerformed

    private void jmPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPersonalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        cp = new ControlPersonal();
        cp.setVisible(true);
    }//GEN-LAST:event_jmPersonalActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAdministrador;
    private javax.swing.JMenuItem jmFinalizar;
    private javax.swing.JMenuItem jmPersonal;
    // End of variables declaration//GEN-END:variables
}