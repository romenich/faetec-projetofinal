package com.mycompany.sistemadecontas;

import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author reydemonio
 */
public class TelaPassivos extends javax.swing.JFrame {
     private final DefaultTableModel tableModel;

     

    /**
     * Creates new form TelaPassivos
     */
    public TelaPassivos() {
        initComponents();
         // Inicialização do modelo da tabela
        tableModel = (DefaultTableModel) tabelaPassivos.getModel();

                    // Configurar ouvinte para coluna "Circulante"
            TableColumn circulanteColumn = tabelaPassivos.getColumnModel().getColumn(2);
            circulanteColumn.setCellEditor(new javax.swing.DefaultCellEditor(new javax.swing.JCheckBox()));
            circulanteColumn.getCellEditor().addCellEditorListener(new CellEditorListener() {
                @Override
                public void editingStopped(ChangeEvent e) {
                    int row = tabelaPassivos.getSelectedRow();
                    boolean circulanteValue = (boolean) tableModel.getValueAt(row, 2);
                    boolean naoCirculanteValue = (boolean) tableModel.getValueAt(row, 3);

                    if (circulanteValue) {
                        tableModel.setValueAt(false, row, 3); // Desmarca "Não Circulante"
                    } else if (!circulanteValue && !naoCirculanteValue) {
                        tableModel.setValueAt(true, row, 3); // Marca "Não Circulante" se nenhum estiver marcado
                    }
                }

                @Override
                public void editingCanceled(ChangeEvent e) {
                    // Não é necessário fazer nada aqui
                }
            });

            // Configurar ouvinte para coluna "Não Circulante"
            TableColumn naoCirculanteColumn = tabelaPassivos.getColumnModel().getColumn(3);
            naoCirculanteColumn.setCellEditor(new javax.swing.DefaultCellEditor(new javax.swing.JCheckBox()));
            naoCirculanteColumn.getCellEditor().addCellEditorListener(new CellEditorListener() {
                @Override
                public void editingStopped(ChangeEvent e) {
                    int row = tabelaPassivos.getSelectedRow();
                    boolean circulanteValue = (boolean) tableModel.getValueAt(row, 2);
                    boolean naoCirculanteValue = (boolean) tableModel.getValueAt(row, 3);

                    if (naoCirculanteValue) {
                        tableModel.setValueAt(false, row, 2); // Desmarca "Circulante"
                    } else if (!naoCirculanteValue && !circulanteValue) {
                        tableModel.setValueAt(true, row, 2); // Marca "Circulante" se nenhum estiver marcado
                    }
                }

                @Override
                public void editingCanceled(ChangeEvent e) {
                    // Não é necessário fazer nada aqui
                }
            });

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPassivos = new javax.swing.JTable();
        botaoSalvarContas = new javax.swing.JButton();
        botaoMaisContas = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Passivos");
        setMaximumSize(new java.awt.Dimension(1093, 614));
        setMinimumSize(new java.awt.Dimension(960, 562));
        setPreferredSize(new java.awt.Dimension(1093, 614));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Adicione as contas de Passivo da empresa");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setMaximumSize(new java.awt.Dimension(359, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(359, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(359, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 15, 435, -1));

        tabelaPassivos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tabelaPassivos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabelaPassivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome da Conta", "Valor", "Circulante", "Não Circulante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaPassivos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaPassivos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 900, 350));

        botaoSalvarContas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoSalvarContas.setText("Salvar Contas");
        botaoSalvarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarContasActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvarContas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        botaoMaisContas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoMaisContas.setText("Adicionar Mais Contas");
        botaoMaisContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaisContasActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMaisContas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        botaoVoltar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        PainelBoasVindas newFrame = new PainelBoasVindas();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoSalvarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarContasActionPerformed
        // TODO add your handling code here:
                                                       
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String nomeConta = (String) tableModel.getValueAt(i, 0);
            Double valor = (Double) tableModel.getValueAt(i, 1);
            Boolean circulante = (Boolean) tableModel.getValueAt(i, 2);
            Boolean naoCirculante = (Boolean) tableModel.getValueAt(i, 3);

            
}

        
    }//GEN-LAST:event_botaoSalvarContasActionPerformed

    private void botaoMaisContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaisContasActionPerformed
        // TODO add your handling code here:
        TelaPassivos newFrame = new TelaPassivos();
        newFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoMaisContasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPassivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPassivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPassivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPassivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPassivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMaisContas;
    private javax.swing.JButton botaoSalvarContas;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPassivos;
    // End of variables declaration//GEN-END:variables
}
