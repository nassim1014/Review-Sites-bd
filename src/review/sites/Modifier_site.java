/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review.sites;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zaari
 */
public class Modifier_site extends javax.swing.JFrame {

    /**
     * Creates new form Modifier_site
     */
    public Modifier_site() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTxtid1 = new javax.swing.JTextField();
        jTxtdes1 = new javax.swing.JTextField();
        jTxtcode1 = new javax.swing.JTextField();
        jTxtpays1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRbnyes1 = new javax.swing.JRadioButton();
        jRbnno1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jTxturl1 = new javax.swing.JTextField();
        jBtnannuler = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jTxtid = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablemodifier = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jBtnmodifier = new javax.swing.JButton();
        jBtnretour1 = new javax.swing.JButton();
        jBtnafficher1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTxtid1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTxtid1.setForeground(new java.awt.Color(255, 69, 0));
        jTxtid1.setText("ID Site");
        jTxtid1.setBorder(null);
        jTxtid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtid1ActionPerformed(evt);
            }
        });

        jTxtdes1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTxtdes1.setForeground(new java.awt.Color(255, 69, 0));
        jTxtdes1.setText("D??signation");
        jTxtdes1.setBorder(null);
        jTxtdes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtdes1ActionPerformed(evt);
            }
        });

        jTxtcode1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTxtcode1.setForeground(new java.awt.Color(255, 69, 0));
        jTxtcode1.setText("Code de la cat??gorie du site");
        jTxtcode1.setBorder(null);
        jTxtcode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtcode1ActionPerformed(evt);
            }
        });

        jTxtpays1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTxtpays1.setForeground(new java.awt.Color(255, 69, 0));
        jTxtpays1.setText("Pays");
        jTxtpays1.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(255, 69, 0));

        jSeparator3.setForeground(new java.awt.Color(255, 69, 0));

        jSeparator4.setForeground(new java.awt.Color(255, 69, 0));

        jSeparator5.setForeground(new java.awt.Color(255, 69, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-google-code-45.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-single-page-mode-45.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-classer-par-cat??gories-45 (1).png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-carte-du-monde-45.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 69, 0));
        jLabel10.setText("Handicap friendly ?");

        jRbnyes1.setBackground(new java.awt.Color(255, 255, 255));
        jRbnyes1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jRbnyes1.setForeground(new java.awt.Color(255, 69, 0));
        jRbnyes1.setText("Oui");
        jRbnyes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRbnyes1MouseClicked(evt);
            }
        });

        jRbnno1.setBackground(new java.awt.Color(255, 255, 255));
        jRbnno1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jRbnno1.setForeground(new java.awt.Color(255, 69, 0));
        jRbnno1.setText("Non");
        jRbnno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRbnno1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-inspection-35.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(230, 230, 230));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 69, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-update-80.png"))); // NOI18N
        jLabel11.setText("Modifier un Site");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jSeparator6.setForeground(new java.awt.Color(255, 69, 0));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-internet-45.png"))); // NOI18N

        jSeparator7.setForeground(new java.awt.Color(255, 69, 0));

        jTxturl1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTxturl1.setForeground(new java.awt.Color(255, 69, 0));
        jTxturl1.setText("Lien URL");
        jTxturl1.setBorder(null);

        jBtnannuler.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jBtnannuler.setForeground(new java.awt.Color(255, 69, 0));
        jBtnannuler.setText("Annuler");
        jBtnannuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnannulerMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 69, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-chercher-45.png"))); // NOI18N

        jTxtid.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTxtid.setForeground(new java.awt.Color(255, 69, 0));
        jTxtid.setText("Inserer l'ID du Site ?? modifier");
        jTxtid.setBorder(null);
        jTxtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtidActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(255, 69, 0));

        jTablemodifier.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTablemodifier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "D??signation", "Code cat", "Pays", "Lien URL", "Handicap friendly"
            }
        ));
        jTablemodifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablemodifierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablemodifier);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 69, 0));
        jLabel14.setText("Sinon Chercher le site ?? modifier");

        jBtnmodifier.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jBtnmodifier.setForeground(new java.awt.Color(255, 69, 0));
        jBtnmodifier.setText("Modifier");
        jBtnmodifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnmodifierMouseClicked(evt);
            }
        });

        jBtnretour1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jBtnretour1.setForeground(new java.awt.Color(255, 69, 0));
        jBtnretour1.setText("Retour");
        jBtnretour1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnretour1MouseClicked(evt);
            }
        });

        jBtnafficher1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jBtnafficher1.setForeground(new java.awt.Color(255, 69, 0));
        jBtnafficher1.setText("Afficher Table");
        jBtnafficher1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnafficher1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTxtid)
                                            .addComponent(jSeparator8)))
                                    .addComponent(jLabel14)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jBtnretour1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnafficher1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtdes1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtid1)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtpays1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtcode1)
                                    .addComponent(jSeparator4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jRbnyes1))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTxturl1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jBtnmodifier)
                                        .addGap(6, 6, 6)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnannuler)
                                    .addComponent(jRbnno1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnretour1)
                    .addComponent(jBtnafficher1))
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtid1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTxtdes1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtpays1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxturl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRbnyes1)
                    .addComponent(jRbnno1))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnannuler)
                    .addComponent(jBtnmodifier))
                .addGap(86, 86, 86))
            .addComponent(jSeparator1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtid1ActionPerformed

    private void jTxtdes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtdes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtdes1ActionPerformed

    private void jTxtcode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtcode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtcode1ActionPerformed

    private void jTxtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtidActionPerformed

    private void jBtnretour1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnretour1MouseClicked
        Manage_site pr=new Manage_site();
        pr.setVisible(true);
        pr.pack();
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBtnretour1MouseClicked

    private void jBtnmodifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnmodifierMouseClicked
        DefaultTableModel model = (DefaultTableModel)jTablemodifier.getModel();
        ReviewSites co =new  ReviewSites();
        co.connection();
        int i = jTablemodifier.getSelectedRow();
        if (i>=0)
        {
            model.setValueAt(jTxtid1.getText(),i,0);
            model.setValueAt(jTxtdes1.getText(),i,1);
            model.setValueAt(jTxtcode1.getText(),i,2);
            model.setValueAt(jTxtpays1.getText(),i,3);
            model.setValueAt(jTxturl1.getText(),i,4);
            if(jRbnyes1.isSelected()){
                model.setValueAt(1,i,5);
            }
            else{
                model.setValueAt(0,i,5);
            }
        try{
            String Id = model.getValueAt(i,0).toString();
            String Designation = model.getValueAt(i,1).toString();
            String Code = model.getValueAt(i,2).toString();
            String Pays = model.getValueAt(i,3).toString();
            String Lien = model.getValueAt(i,4).toString();
            String Hand = model.getValueAt(i,5).toString();
            co.stmt=co.conn.createStatement();
            co.stmt.executeUpdate("update IGNORE `sites` set `IdSite`='"+Id+"',`DesSite`='"+Designation+"',`CodeCat`='"+Code+"',`PaysSite`='"+Pays+"', `LienSite`='"+Lien+"', `HandSite`='"+Hand+"'");
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
         }
            JOptionPane.showMessageDialog(null, "Row modified");
        } else {
            JOptionPane.showMessageDialog(null, "Unable To modify");
    }
    }//GEN-LAST:event_jBtnmodifierMouseClicked

    private void jBtnafficher1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnafficher1MouseClicked
        ReviewSites co = new ReviewSites();
        co.connection();
        DefaultTableModel model = (DefaultTableModel)jTablemodifier.getModel();
        model.setRowCount(0);
        try {
            co.stmt = co.conn.createStatement();
            co.rs = co.stmt.executeQuery("SELECT * FROM `sites`");
            while (co.rs.next()) {
                String Id = String.valueOf(co.rs.getInt(1));
                String Description = co.rs.getString(2);
                String Code = String.valueOf(co.rs.getInt(3));
                String Pays = co.rs.getString(4);
                String Lien = co.rs.getString(5);
                String Hand = String.valueOf(co.rs.getInt(6));
               
                model.addRow(new String[]{Id,Description,Code,Pays,Lien,Hand});
                
            }
        }catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
    }//GEN-LAST:event_jBtnafficher1MouseClicked
    }
    private void jTablemodifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablemodifierMouseClicked
        ReviewSites co = new ReviewSites();
        co.connection();
        DefaultTableModel model = (DefaultTableModel)jTablemodifier.getModel();
        int SelectedIndex = jTablemodifier.getSelectedRow();

        jTxtid.setText(model.getValueAt(SelectedIndex,0).toString());
        jTxtid1.setText(model.getValueAt(SelectedIndex,0).toString());
        jTxtdes1.setText(model.getValueAt(SelectedIndex,1).toString());
        jTxtcode1.setText(model.getValueAt(SelectedIndex,2).toString());
        jTxtpays1.setText(model.getValueAt(SelectedIndex,3).toString());
        jTxturl1.setText(model.getValueAt(SelectedIndex,4).toString());
        String c = model.getValueAt(SelectedIndex,5).toString();
        if(c.equals("1")){
           jRbnyes1.setSelected(true);
           jRbnno1.setSelected(false);
        }
        else if(c.equals("0")){
           jRbnno1.setSelected(true);
           jRbnyes1.setSelected(false);
        }
    }//GEN-LAST:event_jTablemodifierMouseClicked

    private void jBtnannulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnannulerMouseClicked
        jTxtid1.setText("");
        jTxtdes1.setText("");
        jTxtcode1.setText("");
        jTxtpays1.setText("");
        jTxturl1.setText("");
    }//GEN-LAST:event_jBtnannulerMouseClicked

    private void jRbnyes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRbnyes1MouseClicked
        if(jRbnno1.isSelected())
        {
            jRbnno1.setSelected(false);
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jRbnyes1MouseClicked

    private void jRbnno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRbnno1MouseClicked
        if(jRbnyes1.isSelected())
        {
            jRbnyes1.setSelected(false);
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jRbnno1MouseClicked

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
            java.util.logging.Logger.getLogger(Modifier_site.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifier_site.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifier_site.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifier_site.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifier_site().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnafficher1;
    private javax.swing.JButton jBtnannuler;
    private javax.swing.JButton jBtnmodifier;
    private javax.swing.JButton jBtnretour1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRbnno1;
    private javax.swing.JRadioButton jRbnyes1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTablemodifier;
    private javax.swing.JTextField jTxtcode1;
    private javax.swing.JTextField jTxtdes1;
    private javax.swing.JTextField jTxtid;
    private javax.swing.JTextField jTxtid1;
    private javax.swing.JTextField jTxtpays1;
    private javax.swing.JTextField jTxturl1;
    // End of variables declaration//GEN-END:variables
}
