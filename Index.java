/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication;

import javax.swing.JOptionPane;

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit_button = new javax.swing.JButton();
        admin_button = new javax.swing.JButton();
        student_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        exit_button.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        //exit_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myproject/Close_1.png"))); // NOI18N
        exit_button.setText("Exit");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        admin_button.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        //admin_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myproject/index admin.png"))); // NOI18N
        admin_button.setText("Admin Login");
        admin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_buttonActionPerformed(evt);
            }
        });

        student_button.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        //student_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myproject/index student.png"))); // NOI18N
        student_button.setText("Student Login");
        student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_button)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(student_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addComponent(admin_button)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(exit_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_button)
                    .addComponent(admin_button))
                .addGap(217, 217, 217))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginStudent().setVisible(true);
    }//GEN-LAST:event_student_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        int ans = JOptionPane.showConfirmDialog(null,"Do you want to exit ?","Select",JOptionPane.YES_NO_OPTION);
        
        if(ans==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void admin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginAdmin_1().setVisible(true);
    }//GEN-LAST:event_admin_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton student_button;
    // End of variables declaration//GEN-END:variables
}
