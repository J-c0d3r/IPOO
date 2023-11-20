package lucktester_thread;

public class Tela_LuckTester extends javax.swing.JFrame {

    int qntd = 0;

    public Tela_LuckTester() {
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

        jLScore = new javax.swing.JLabel();
        jLNum1 = new javax.swing.JLabel();
        jLNum2 = new javax.swing.JLabel();
        jLNum3 = new javax.swing.JLabel();
        jLQntdJogadas = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teste sua sorte com o Luck Tester! :)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLScore.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jLScore.setText("0");
        getContentPane().add(jLScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLNum1.setFont(new java.awt.Font("Source Sans Pro", 1, 70)); // NOI18N
        jLNum1.setText("?");
        getContentPane().add(jLNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLNum2.setFont(new java.awt.Font("Source Sans Pro", 1, 70)); // NOI18N
        jLNum2.setText("?");
        getContentPane().add(jLNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLNum3.setFont(new java.awt.Font("Source Sans Pro", 1, 70)); // NOI18N
        jLNum3.setText("?");
        getContentPane().add(jLNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLQntdJogadas.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jLQntdJogadas.setText("0");
        getContentPane().add(jLQntdJogadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        btnPlay.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        btnPlay.setText("Jogar");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/maquinaFundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed

        qntd++;
        jLQntdJogadas.setText(qntd + "");


    }//GEN-LAST:event_btnPlayActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_LuckTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_LuckTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_LuckTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_LuckTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_LuckTester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel jLNum1;
    private javax.swing.JLabel jLNum2;
    private javax.swing.JLabel jLNum3;
    private javax.swing.JLabel jLQntdJogadas;
    private javax.swing.JLabel jLScore;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}