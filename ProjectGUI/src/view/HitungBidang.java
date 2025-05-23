package view;


import java.util.logging.Level;
import java.util.logging.Logger;
import view.BidangPersegiPanjang;
import view.BidangLingkaran;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author munir
 */
public class HitungBidang extends javax.swing.JFrame {

    /**
     * Creates new form HitungBidang
     */
    public HitungBidang() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuBar = new javax.swing.JMenu();
        MenuPersegiPanjang = new javax.swing.JCheckBoxMenuItem();
        MenuLingkaran = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar.setText("Bidang");

        MenuPersegiPanjang.setSelected(true);
        MenuPersegiPanjang.setText("Persegi Panjang");
        MenuPersegiPanjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuPersegiPanjangMouseReleased(evt);
            }
        });
        jMenuBar.add(MenuPersegiPanjang);

        MenuLingkaran.setSelected(true);
        MenuLingkaran.setText("Lingkaran");
        MenuLingkaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuLingkaranMouseReleased(evt);
            }
        });
        MenuLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLingkaranActionPerformed(evt);
            }
        });
        jMenuBar.add(MenuLingkaran);

        jMenuBar1.add(jMenuBar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLingkaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuLingkaranActionPerformed

    private void MenuLingkaranMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLingkaranMouseReleased
        BidangLingkaran BL = new BidangLingkaran ();
        BL.setLocationRelativeTo(this);
        BL.setVisible(true);
    }//GEN-LAST:event_MenuLingkaranMouseReleased

    private void MenuPersegiPanjangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPersegiPanjangMouseReleased
        try {
            BidangPersegiPanjang BP = new BidangPersegiPanjang ();
            BP.setLocationRelativeTo(this);
            BP.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(HitungBidang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuPersegiPanjangMouseReleased

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
            java.util.logging.Logger.getLogger(HitungBidang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitungBidang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitungBidang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitungBidang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungBidang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem MenuLingkaran;
    private javax.swing.JCheckBoxMenuItem MenuPersegiPanjang;
    private javax.swing.JMenu jMenuBar;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
