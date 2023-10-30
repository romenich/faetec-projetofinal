package com.mycompany.sistemadecontas;

import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.sql.*;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteLayout;


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
        botaoMaisContas.setToolTipText("Clique para adicionar mais contas.");
        botaoSalvarContas.setToolTipText("Clique para salvar as contas inseridas na tabela.");
        botaoVoltar.setToolTipText("Clique para voltar a tela anterior.");
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Adicione as contas de Passivo da empresa");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setMaximumSize(new java.awt.Dimension(359, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(359, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(359, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 101;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 100, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 884;
        gridBagConstraints.ipady = 330;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 60, 0, 40);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        botaoSalvarContas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoSalvarContas.setText("Salvar Contas");
        botaoSalvarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarContasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 0, 0);
        getContentPane().add(botaoSalvarContas, gridBagConstraints);

        botaoMaisContas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoMaisContas.setText("Adicionar Mais Contas");
        botaoMaisContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaisContasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 495, 0, 0);
        getContentPane().add(botaoMaisContas, gridBagConstraints);

        botaoVoltar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 0, 2, 0);
        getContentPane().add(botaoVoltar, gridBagConstraints);

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
        String url = "jdbc:sqlite:contapassivo.db";

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String nomeConta = (String) tableModel.getValueAt(i, 0);
            Double valor = (Double) tableModel.getValueAt(i, 1);
            Boolean circulante = (Boolean) tableModel.getValueAt(i, 2);
            Boolean naoCirculante = (Boolean) tableModel.getValueAt(i, 3);

            // Verificar se o nome da conta não está vazio (ou seja, se foi inserido)
            if (nomeConta != null && !nomeConta.trim().isEmpty()) {
                // Código para criar a tabela no banco de dados (só precisa ser executado uma vez)
                String createTableSQL = "CREATE TABLE IF NOT EXISTS contaPassivo (\n"
                        + "    idPassivo INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                        + "    nomeConta TEXT NOT NULL,\n"
                        + "    valor REAL NOT NULL,\n"
                        + "    circulante INTEGER NOT NULL,\n"
                        + "    naoCirculante INTEGER NOT NULL\n"
                        + ");";

                try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
                    // Criando a tabela caso não exista (só será criada uma vez)
                    stmt.execute(createTableSQL);
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }

                // Código para inserir os dados no banco de dados
                String insertDataSQL = "INSERT INTO contaPassivo (nomeConta, valor, circulante, naoCirculante) VALUES (?, ?, ?, ?)";

                try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(insertDataSQL)) {
                    pstmt.setString(1, nomeConta);
                    pstmt.setDouble(2, valor);

                    // Verifica se a coluna "Circulante" está marcada
                    if (circulante != null && circulante) {
                        pstmt.setInt(3, 1); // 1 se verdadeiro
                    } else {
                        pstmt.setInt(3, 0); // 0 se falso ou não marcado
                    }

                    // Verifica se a coluna "Não Circulante" está marcada
                    if (naoCirculante != null && naoCirculante) {
                        pstmt.setInt(4, 1); // 1 se verdadeiro
                    } else {
                        pstmt.setInt(4, 0); // 0 se falso ou não marcado
                    }

                    // Execute a inserção
                    pstmt.executeUpdate();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }

                // Exibir mensagem de sucesso para cada linha inserida
                JOptionPane.showMessageDialog(this, "Dados salvos com sucesso para a conta: " + nomeConta);
            }
        }


    }//GEN-LAST:event_botaoSalvarContasActionPerformed

    //método para calcular o total de passivos
    public double calcularTotalPassivos() {
        double totalPassivo = 0.0;
        String url = "jdbc:sqlite:contapassivo.db"; // Substitua pelo nome correto do seu banco de dados

        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT SUM(valor) AS total FROM contaPassivo")) {

            if (rs.next()) {
                totalPassivo = rs.getDouble("total");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return totalPassivo;
    }

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
            java.util.logging.Logger.getLogger(TelaPassivos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPassivos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPassivos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPassivos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
