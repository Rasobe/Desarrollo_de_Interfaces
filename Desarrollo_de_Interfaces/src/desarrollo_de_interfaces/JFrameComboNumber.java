/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desarrollo_de_interfaces;

/**
 *
 * @author DAM2Alu13
 */
public class JFrameComboNumber extends javax.swing.JFrame {

    /**
     * Creates new form JFrameComboNumber
     */
    public JFrameComboNumber() {
        String labels[] = { "A", "B", "C", "D","E", "F", "G", "H","I", "J" };
        initComponents();
        jComboBoxNumeros.removeAllItems();
        for (String label : labels) {
            jComboBoxNumeros.addItem(label);
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

        jComboBoxNumeros = new javax.swing.JComboBox<>();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxNumeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNumeros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNumerosItemStateChanged(evt);
            }
        });
        jComboBoxNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNumerosActionPerformed(evt);
            }
        });

        jLabelResultado.setText(org.openide.util.NbBundle.getMessage(JFrameComboNumber.class, "JFrameComboNumber.jLabelResultado.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jComboBoxNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabelResultado)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jComboBoxNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabelResultado)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        

    private void jComboBoxNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNumerosActionPerformed
        
    }//GEN-LAST:event_jComboBoxNumerosActionPerformed

    private void jComboBoxNumerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNumerosItemStateChanged
        
        jLabelResultado.setText(String.valueOf(jComboBoxNumeros.getSelectedItem()));
        
    }//GEN-LAST:event_jComboBoxNumerosItemStateChanged

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
            java.util.logging.Logger.getLogger(JFrameComboNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameComboNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameComboNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameComboNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameComboNumber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxNumeros;
    private javax.swing.JLabel jLabelResultado;
    // End of variables declaration//GEN-END:variables
}