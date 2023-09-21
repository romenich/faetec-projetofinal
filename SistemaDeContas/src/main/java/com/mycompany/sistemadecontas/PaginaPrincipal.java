/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemadecontas;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author romenik
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
        criarTabelaContaAcesso();
    }

    private void criarTabelaContaAcesso() {
        String url = "jdbc:sqlite:contaacesso.db";
        String sql = "CREATE TABLE IF NOT EXISTS contaAcesso (\n"
                + "    idAcesso INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "    usuarioAcesso TEXT NOT NULL,\n"
                + "    senhaAcesso TEXT NOT NULL\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // Criando a tabela caso não exista
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaUsuario = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        painelSoftware = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botaoSobre = new javax.swing.JButton();
        cadastroBOTAO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1093, 614));
        setPreferredSize(new java.awt.Dimension(1093, 614));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        senhaUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        senhaUsuario.setText("Senha:");
        getContentPane().add(senhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        nomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomeUsuario.setText("Usuário: ");
        getContentPane().add(nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 190, -1));

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 190, -1));

        botaoEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        botaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoLimpar.setText("Limpar ");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, -1));

        painelSoftware.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Sistema de Controle Patrimonial");

        javax.swing.GroupLayout painelSoftwareLayout = new javax.swing.GroupLayout(painelSoftware);
        painelSoftware.setLayout(painelSoftwareLayout);
        painelSoftwareLayout.setHorizontalGroup(
            painelSoftwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSoftwareLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        painelSoftwareLayout.setVerticalGroup(
            painelSoftwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSoftwareLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(38, 38, 38))
        );

        getContentPane().add(painelSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 810, 130));

        botaoSobre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoSobre.setText("Sobre");
        botaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSobreActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        cadastroBOTAO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cadastroBOTAO.setText("Cadastrar");
        cadastroBOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBOTAOActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroBOTAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        // TODO add your handling code here:

        try {
            String usuario = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword()); // para obter a senha como uma String

            if (usuario.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos.");
                return;
            }
            // Conectando ao banco de dados
            String url = "jdbc:sqlite:contaacesso.db";
            try (Connection conn = DriverManager.getConnection(url)) {
                // Definindo SQL para verificar o usuário e senha
                String sql = "SELECT * FROM contaAcesso WHERE usuarioAcesso = ? AND senhaAcesso = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, usuario);
                    pstmt.setString(2, senha);

                    // Executando a consulta
                    ResultSet rs = pstmt.executeQuery();

                    // Verificando se o usuário e a senha correspondem a um registro
                    if (rs.next()) {
                        // Se correspondem, abra a tela de boas-vindas
                        PainelBoasVindas newFrame = new PainelBoasVindas();
                        newFrame.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Usuário ou senha incorretos.");
                    }
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao fazer login.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro.");
        }
    }
//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        // TODO add your handling code here:
        //setando o texto para uma variável vazia a fim de limpar os campos

        campoUsuario.setText("");
        campoSenha.setText("");


    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSobreActionPerformed
        // TODO add your handling code here:
        // curta mensagem explicando do que se trata o software
        String mensagem = "Esse software é um Sistema de Controle Patrimonial,\n"
                + "e foi desenvolvido para o Projeto Final do curso Técnico em Informática,\n"
                + "da Faetec de Santo Antônio de Pádua - RJ.";
        JOptionPane.showMessageDialog(this, mensagem, "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botaoSobreActionPerformed

    private void cadastroBOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBOTAOActionPerformed
        // TODO add your handling code here:

        try {
            String usuario = campoUsuario.getText();
            String senhaTexto = new String(campoSenha.getPassword()); // para obter a senha como uma String

            if (usuario.isEmpty() || senhaTexto.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos.");
                return;
            }

            // Conecte-se ao banco de dados SQLite
            String url = "jdbc:sqlite:contaacesso.db";
            try (Connection conn = DriverManager.getConnection(url)) {
                // Definir a instrução SQL para inserir dados na tabela contaAcesso,
                // omitindo o ID único, que será gerado automaticamente pelo banco de dados
                String sql = "INSERT INTO contaAcesso (usuarioAcesso, senhaAcesso) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, usuario);
                    pstmt.setString(2, senhaTexto);

                    // Execute a inserção
                    pstmt.executeUpdate();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao cadastrar.");
                return;
            }

            // Limpe os campos após o cadastro
            campoUsuario.setText("");
            campoSenha.setText("");

            // Exibir mensagem de sucesso no cadastro
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro.");
        }


    }//GEN-LAST:event_cadastroBOTAOActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSobre;
    private javax.swing.JButton cadastroBOTAO;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JPanel painelSoftware;
    private javax.swing.JLabel senhaUsuario;
    // End of variables declaration//GEN-END:variables
}
