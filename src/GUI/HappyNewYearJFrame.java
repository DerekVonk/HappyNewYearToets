package GUI;

import java.util.ArrayList;
import models.Vuurwerk;

public class HappyNewYearJFrame extends javax.swing.JFrame {

    ArrayList<Vuurwerk> pakket;

    public HappyNewYearJFrame(ArrayList<Vuurwerk> pakket) {
        initComponents();
        this.pakket = pakket;
        for (Vuurwerk fireWork : pakket) {
            jComboBoxPakket.addItem(fireWork.getNaam());
        }
        this.jTextAreaInstructie.setText("");
    }

    public void setVuurwerk(ArrayList<Vuurwerk> vuurwerkLijst) {
        this.pakket = vuurwerkLijst;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPlaatje = new javax.swing.JLabel();
        jComboBoxPakket = new javax.swing.JComboBox();
        jLabelVuurwerklijst = new javax.swing.JLabel();
        jLabelInstructie = new javax.swing.JLabel();
        jScrollPaneInstructie = new javax.swing.JScrollPane();
        jTextAreaInstructie = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPlaatje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/fireworks.jpg"))); // NOI18N
        jLabelPlaatje.setText("jLabel1");

        jComboBoxPakket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPakketActionPerformed(evt);
            }
        });

        jLabelVuurwerklijst.setText("Lijst van vuurwerk");

        jLabelInstructie.setText("Instructie");

        jTextAreaInstructie.setColumns(20);
        jTextAreaInstructie.setRows(5);
        jScrollPaneInstructie.setViewportView(jTextAreaInstructie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPlaatje, javax.swing.GroupLayout.PREFERRED_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVuurwerklijst)
                            .addComponent(jComboBoxPakket, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInstructie))
                        .addGap(0, 510, Short.MAX_VALUE))
                    .addComponent(jScrollPaneInstructie))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelPlaatje, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabelVuurwerklijst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPakket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelInstructie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneInstructie, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxPakketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPakketActionPerformed
	    // code voor stap 5
    }//GEN-LAST:event_jComboBoxPakketActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxPakket;
    private javax.swing.JLabel jLabelInstructie;
    private javax.swing.JLabel jLabelPlaatje;
    private javax.swing.JLabel jLabelVuurwerklijst;
    private javax.swing.JScrollPane jScrollPaneInstructie;
    private javax.swing.JTextArea jTextAreaInstructie;
    // End of variables declaration//GEN-END:variables
}
