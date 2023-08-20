package com.mycompany.softwaregerenciamentocontaspessoais;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SoftwareGerenciamentoContasPessoais extends JFrame {
    private List<Item> itens = new ArrayList<>();
    private JPanel painel;
    private JTextField descItem;
    private JTextField valor;
    private JComboBox<String> tipo;
    private JButton btnAdicionar;
    private JLabel rendimentos;
    private JLabel despesas;
    private JLabel saldoTotal;
    private JTable tabela;
    private DefaultTableModel modeloTabela;

    public SoftwareGerenciamentoContasPessoais() {
        setTitle("Software de Gerenciamento de Contas Pessoais");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        painel = new JPanel();
        painel.setLayout(new BorderLayout());

        modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("Descrição");
        modeloTabela.addColumn("Valor");
        modeloTabela.addColumn("Tipo");

        tabela = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabela);
        painel.add(scrollPane, BorderLayout.CENTER);

        JPanel painelEntrada = new JPanel();
        painelEntrada.setLayout(new FlowLayout());

        descItem = new JTextField(15);
        valor = new JTextField(10);
        String[] tipos = {"Entrada", "Saída"};
        tipo = new JComboBox<>(tipos);
        btnAdicionar = new JButton("Adicionar");
        rendimentos = new JLabel("0.00");
        despesas = new JLabel("0.00");
        saldoTotal = new JLabel("0.00");

        painelEntrada.add(new JLabel("Descrição: "));
        painelEntrada.add(descItem);
        painelEntrada.add(new JLabel("Valor: "));
        painelEntrada.add(valor);
        painelEntrada.add(new JLabel("Tipo: "));
        painelEntrada.add(tipo);
        painelEntrada.add(btnAdicionar);

        painel.add(painelEntrada, BorderLayout.SOUTH);
        painel.add(rendimentos, BorderLayout.WEST);
        painel.add(despesas, BorderLayout.CENTER);
        painel.add(saldoTotal, BorderLayout.EAST);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String descricao = descItem.getText();
                double valorItem = Double.parseDouble(valor.getText());
                String tipoItem = (String) tipo.getSelectedItem();

                if (descricao.isEmpty() || valorItem <= 0) {
                    JOptionPane.showMessageDialog(painel, "Preencha todos os campos com valores válidos.");
                    return;
                }

                itens.add(new Item(descricao, valorItem, tipoItem));
                atualizarTabela();
                atualizarTotais();

                descItem.setText("");
                valor.setText("");
            }
        });

        add(painel);
        atualizarTabela();
        atualizarTotais();
    }

    private void atualizarTabela() {
        modeloTabela.setRowCount(0);
        for (Item item : itens) {
            modeloTabela.addRow(new Object[]{item.getDescricao(), item.getValorFormatado(), item.getTipo()});
        }
    }

    private void atualizarTotais() {
        double totalRendimentos = 0;
        double totalDespesas = 0;

        for (Item item : itens) {
            if (item.getTipo().equals("Entrada")) {
                totalRendimentos += item.getValor();
            } else if (item.getTipo().equals("Saída")) {
                totalDespesas += item.getValor();
            }
        }

        rendimentos.setText("Total de Rendimentos: " + String.format("%.2f", totalRendimentos));
        despesas.setText("Total de Despesas: " + String.format("%.2f", totalDespesas));
        saldoTotal.setText("Saldo Total: " + String.format("%.2f", totalRendimentos - totalDespesas));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SoftwareGerenciamentoContasPessoais().setVisible(true);
            }
        });
    }
}

class Item {
    private String descricao;
    private double valor;
    private String tipo;

    public Item(String descricao, double valor, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getValorFormatado() {
        return String.format("%.2f", valor);
    }

    public String getTipo() {
        return tipo;
    }
}
