/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safehomejf;

/**
 *
 * @author Benedict
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
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

        SHAccountIconLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BasicRadio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        AdvancedRadio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        TutorialRadio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        DoNotShowCheck = new javax.swing.JCheckBox();
        IOK = new javax.swing.JButton();
        ICancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setResizable(false);

        SHAccountIconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Benedict\\Desktop\\Clayton State Spring 2016\\Software Engineering Design\\UI\\SafeHomeText.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Select one of the following application modes");

        BasicRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BasicRadio.setSelected(true);
        BasicRadio.setText("Basic Mode ");
        BasicRadio.setToolTipText("");
        BasicRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasicRadioActionPerformed(evt);
            }
        });

        jLabel2.setText("Basic mode shows the only commonly used settings");

        AdvancedRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdvancedRadio.setText("Advanced Mode");
        AdvancedRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvancedRadioActionPerformed(evt);
            }
        });

        jLabel3.setText("Advanced mode shows all settings");

        TutorialRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TutorialRadio.setText("Tutorial Mode");
        TutorialRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorialRadioActionPerformed(evt);
            }
        });

        jLabel4.setText("Tutorial mode shows you a short video of how SHS works");

        DoNotShowCheck.setText("Do not show this dialog again");
        DoNotShowCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoNotShowCheckActionPerformed(evt);
            }
        });

        IOK.setText("ok");
        IOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IOKMouseClicked(evt);
            }
        });
        IOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IOKActionPerformed(evt);
            }
        });

        ICancel.setText("Cancel");
        ICancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ICancel)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(BasicRadio)
                            .addComponent(AdvancedRadio)
                            .addComponent(TutorialRadio)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(DoNotShowCheck))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SHAccountIconLabel)
                        .addGap(176, 176, 176))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SHAccountIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BasicRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(AdvancedRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TutorialRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(DoNotShowCheck)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IOK)
                    .addComponent(ICancel))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BasicRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasicRadioActionPerformed
      if (BasicRadio.isSelected())
      AdvancedRadio.setSelected(false);
      TutorialRadio.setSelected(false);
      
    }//GEN-LAST:event_BasicRadioActionPerformed

    private void TutorialRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorialRadioActionPerformed
        if (TutorialRadio.isSelected())
      BasicRadio.setSelected(false);
      AdvancedRadio.setSelected(false);
    }//GEN-LAST:event_TutorialRadioActionPerformed

    private void ICancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ICancelActionPerformed

    private void DoNotShowCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoNotShowCheckActionPerformed
      //this.setVisible(false);
       // new Interface().setVisible(false);
        //Interface.setSelected(false);
    }//GEN-LAST:event_DoNotShowCheckActionPerformed

    private void AdvancedRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvancedRadioActionPerformed
        if (AdvancedRadio.isSelected())
      BasicRadio.setSelected(false);
      TutorialRadio.setSelected(false);
      
    }//GEN-LAST:event_AdvancedRadioActionPerformed

    private void IOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IOKActionPerformed
   
    }//GEN-LAST:event_IOKActionPerformed

    private void IOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IOKMouseClicked
           if (BasicRadio.isSelected()){
           this.setVisible(false);
        new Basic().setVisible(true);
             
       }
            if (AdvancedRadio.isSelected()){
           this.setVisible(false);
        new Advanced().setVisible(true);
            }
            if (TutorialRadio.isSelected()){
           this.setVisible(false);
        new Tutorial().setVisible(true);
            }
    }//GEN-LAST:event_IOKMouseClicked

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdvancedRadio;
    private javax.swing.JRadioButton BasicRadio;
    private javax.swing.JCheckBox DoNotShowCheck;
    private javax.swing.JButton ICancel;
    private javax.swing.JButton IOK;
    private javax.swing.JLabel SHAccountIconLabel;
    private javax.swing.JRadioButton TutorialRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}