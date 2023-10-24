package com.mycompany.sistemadecontas;
import com.mycompany.sistemadecontas.TelaAtivos;
import com.mycompany.sistemadecontas.TelaPassivos;


/**
 *
 * @author romenik
 */
public class PainelBoasVindas extends javax.swing.JFrame {

    /**
     * Creates new form PainelBoasVindas
     */
    public PainelBoasVindas() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoRelatorio = new javax.swing.JButton();
        limparTabelasBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1093, 614));
        setPreferredSize(new java.awt.Dimension(1093, 614));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Inserir contas do Ativo");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 30));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Inserir contas do Passivo");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Inserção dos Ativos e Passivos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 730, -1));

        botaoVoltar.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        botaoRelatorio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botaoRelatorio.setText("Gerar Relatórios");
        botaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, 50));

        limparTabelasBTN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        limparTabelasBTN.setText("Limpar dados salvos");
        limparTabelasBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTabelasBTNActionPerformed(evt);
            }
        });
        getContentPane().add(limparTabelasBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        PaginaPrincipal newFrame = new PaginaPrincipal();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        TelaAtivos newFrame = new TelaAtivos();
        newFrame.setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void botaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioActionPerformed
        //criando instancias das classes TelaAtivos e TelaPassivos
        TelaAtivos telaAtivos = new TelaAtivos();
        TelaPassivos telaPassivos = new TelaPassivos();

        // Chame os métodos de cálculo
        double totalAtivos = telaAtivos.calcularTotalAtivos();
        double totalPassivos = telaPassivos.calcularTotalPassivos();
        // calculo do patrimonio liquido
        double patrimonioLiquido = totalAtivos - totalPassivos;

       // Atualizar a tela de relatórios com os valores calculados
        TelaRelatorios newFrame = new TelaRelatorios(totalAtivos, totalPassivos, patrimonioLiquido);
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoRelatorioActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        TelaPassivos newFrame = new TelaPassivos();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void limparTabelasBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTabelasBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limparTabelasBTNActionPerformed

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
            java.util.logging.Logger.getLogger(PainelBoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelBoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelBoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelBoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelBoasVindas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRelatorio;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparTabelasBTN;
    // End of variables declaration//GEN-END:variables
}
