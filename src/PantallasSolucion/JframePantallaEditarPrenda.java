/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallasSolucion;

/**
 *
 * @author Personal
 */
public class JframePantallaEditarPrenda extends javax.swing.JFrame {

    /**
     * Creates new form JframePantallaEditarPrenda
     */
    public JframePantallaEditarPrenda() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEditarNombre = new javax.swing.JTextField();
        txtEditarPrecio = new javax.swing.JTextField();
        txtEditarCodigo = new javax.swing.JTextField();
        btnEditarPrenda = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Editar Prenda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Editar Nombre de Prenda:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Editar Precio de Prenda:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Editar Codigo de Prenda:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtEditarNombre.setText("jTextField1");
        getContentPane().add(txtEditarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 300, 30));

        txtEditarPrecio.setText("jTextField2");
        getContentPane().add(txtEditarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 300, 30));

        txtEditarCodigo.setText("jTextField3");
        getContentPane().add(txtEditarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 300, 30));

        btnEditarPrenda.setBackground(new java.awt.Color(204, 0, 204));
        btnEditarPrenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditarPrenda.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPrenda.setText("Editar");
        btnEditarPrenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPrendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarPrenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 40));

        btnCancelarEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelarEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelarEditar.setText("Cancelar");
        getContentPane().add(btnCancelarEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPrendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPrendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPrendaActionPerformed

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
            java.util.logging.Logger.getLogger(JframePantallaEditarPrenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframePantallaEditarPrenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframePantallaEditarPrenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframePantallaEditarPrenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframePantallaEditarPrenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnEditarPrenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEditarCodigo;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEditarPrecio;
    // End of variables declaration//GEN-END:variables
}