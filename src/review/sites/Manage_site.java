/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review.sites;

/**
 *
 * @author zaari
 */
public class Manage_site extends javax.swing.JFrame {

    /**
     * Creates new form Manage_site
     */
    public Manage_site() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelajouter = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelmodifier = new javax.swing.JLabel();
        jLabelsupprimer = new javax.swing.JLabel();
        jbtnRetour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 69, 0));
        jLabel2.setText("Manager les Sites");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-maintenance-45.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(255, 69, 0));

        jLabelajouter.setBackground(new java.awt.Color(230, 230, 230));
        jLabelajouter.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelajouter.setForeground(new java.awt.Color(255, 69, 0));
        jLabelajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-plus-2-mathématique-80.png"))); // NOI18N
        jLabelajouter.setText("Ajouter");
        jLabelajouter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jLabelajouter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelajouter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelajouterMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-inspection-35.png"))); // NOI18N

        jLabelmodifier.setBackground(new java.awt.Color(230, 230, 230));
        jLabelmodifier.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelmodifier.setForeground(new java.awt.Color(255, 69, 0));
        jLabelmodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-update-80.png"))); // NOI18N
        jLabelmodifier.setText("Modifier");
        jLabelmodifier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jLabelmodifier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelmodifier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelmodifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelmodifierMouseClicked(evt);
            }
        });

        jLabelsupprimer.setBackground(new java.awt.Color(230, 230, 230));
        jLabelsupprimer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelsupprimer.setForeground(new java.awt.Color(255, 69, 0));
        jLabelsupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/review/sites/logos/icons8-supprimer-80.png"))); // NOI18N
        jLabelsupprimer.setText("Supprimer");
        jLabelsupprimer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jLabelsupprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelsupprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelsupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelsupprimerMouseClicked(evt);
            }
        });

        jbtnRetour.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jbtnRetour.setForeground(new java.awt.Color(255, 69, 0));
        jbtnRetour.setText("Retour");
        jbtnRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnRetourMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnRetour)
                            .addComponent(jLabelajouter))
                        .addGap(71, 71, 71)
                        .addComponent(jLabelmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabelsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelajouter)
                    .addComponent(jLabelmodifier)
                    .addComponent(jLabelsupprimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jbtnRetour)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelajouterMouseClicked
        Ajouter_Site pr=new Ajouter_Site();
        pr.setVisible(true);
        pr.pack();
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelajouterMouseClicked

    private void jLabelmodifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelmodifierMouseClicked
        Modifier_site pr=new Modifier_site();
        pr.setVisible(true);
        pr.pack();
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelmodifierMouseClicked

    private void jLabelsupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsupprimerMouseClicked
        Supprimer_site pr=new Supprimer_site();
        pr.setVisible(true);
        pr.pack();
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelsupprimerMouseClicked

    private void jbtnRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRetourMouseClicked
        Menu pr=new Menu();
        pr.setVisible(true);
        pr.pack();
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnRetourMouseClicked

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
            java.util.logging.Logger.getLogger(Manage_site.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_site.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_site.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_site.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_site().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelajouter;
    private javax.swing.JLabel jLabelmodifier;
    private javax.swing.JLabel jLabelsupprimer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnRetour;
    // End of variables declaration//GEN-END:variables
}