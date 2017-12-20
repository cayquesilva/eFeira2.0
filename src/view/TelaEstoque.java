/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansProduto;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoProduto;

/**
 *
 * @author Lab-NTM-01
 */
public class TelaEstoque extends javax.swing.JFrame {

    BeansProduto mod = new BeansProduto();
    ConexaoBD conex = new ConexaoBD();
    DaoProduto control = new DaoProduto();
    int flag = 0;
    int auxiliar;
    
    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque() {
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

        jPanelGeral = new javax.swing.JPanel();
        jPanelRegistro = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTxtVenda = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jTxtCompra = new javax.swing.JTextField();
        jTxtID = new javax.swing.JTextField();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtQuantidade = new javax.swing.JTextField();
        jLblImg = new javax.swing.JLabel();
        jBtnNovo = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jPanelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(300, 300));

        jPanelGeral.setLayout(null);

        jPanelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastrar Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanelRegistro.setOpaque(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jTxtVenda.setForeground(new java.awt.Color(0, 0, 255));
        jTxtVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtVenda.setText("Venda");
        jTxtVenda.setEnabled(false);
        jTxtVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtVendaFocusGained(evt);
            }
        });
        jPanel3.add(jTxtVenda);
        jTxtVenda.setBounds(280, 110, 70, 20);

        jTxtNome.setForeground(new java.awt.Color(0, 0, 255));
        jTxtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtNome.setText("Nome");
        jTxtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtNomeFocusGained(evt);
            }
        });
        jPanel3.add(jTxtNome);
        jTxtNome.setBounds(200, 50, 160, 20);

        jTxtCompra.setForeground(new java.awt.Color(0, 0, 255));
        jTxtCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtCompra.setText("Compra");
        jTxtCompra.setEnabled(false);
        jTxtCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtCompraFocusGained(evt);
            }
        });
        jPanel3.add(jTxtCompra);
        jTxtCompra.setBounds(210, 110, 70, 20);

        jTxtID.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jTxtID.setForeground(new java.awt.Color(0, 0, 255));
        jTxtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtID.setText("ID");
        jTxtID.setEnabled(false);
        jPanel3.add(jTxtID);
        jTxtID.setBounds(340, 0, 40, 20);

        jTxtCodigo.setForeground(new java.awt.Color(0, 0, 255));
        jTxtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtCodigo.setText("Cod.");
        jTxtCodigo.setEnabled(false);
        jTxtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtCodigoFocusGained(evt);
            }
        });
        jPanel3.add(jTxtCodigo);
        jTxtCodigo.setBounds(280, 80, 80, 20);

        jTxtQuantidade.setForeground(new java.awt.Color(0, 0, 255));
        jTxtQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtQuantidade.setText("Quant.");
        jTxtQuantidade.setEnabled(false);
        jTxtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtQuantidadeFocusGained(evt);
            }
        });
        jPanel3.add(jTxtQuantidade);
        jTxtQuantidade.setBounds(200, 80, 80, 20);

        jLblImg.setBackground(new java.awt.Color(184, 108, 39));
        jLblImg.setForeground(new java.awt.Color(184, 108, 39));
        jLblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Carro cadastro.png"))); // NOI18N
        jPanel3.add(jLblImg);
        jLblImg.setBounds(130, 0, 270, 240);

        jBtnNovo.setBackground(new java.awt.Color(0, 0, 255));
        jBtnNovo.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jBtnNovo.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNovo.setText("Novo");
        jBtnNovo.setOpaque(false);
        jBtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnNovo);
        jBtnNovo.setBounds(20, 40, 110, 23);

        jBtnEditar.setBackground(new java.awt.Color(0, 0, 255));
        jBtnEditar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jBtnEditar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEditar.setText("Editar");
        jBtnEditar.setOpaque(false);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnEditar);
        jBtnEditar.setBounds(20, 70, 110, 23);

        jBtnCancelar.setBackground(new java.awt.Color(0, 0, 255));
        jBtnCancelar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jBtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setOpaque(false);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnCancelar);
        jBtnCancelar.setBounds(20, 100, 110, 23);

        jBtnCadastrar.setBackground(new java.awt.Color(0, 0, 255));
        jBtnCadastrar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jBtnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCadastrar.setText("Salvar");
        jBtnCadastrar.setOpaque(false);
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnCadastrar);
        jBtnCadastrar.setBounds(20, 130, 110, 23);

        jBtnExcluir.setBackground(new java.awt.Color(0, 0, 255));
        jBtnExcluir.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jBtnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.setOpaque(false);
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnExcluir);
        jBtnExcluir.setBounds(20, 160, 110, 23);

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelGeral.add(jPanelRegistro);
        jPanelRegistro.setBounds(10, 10, 400, 250);

        jPanelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastrar Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanelTabela.setOpaque(false);

        jTProdutos.setBackground(new java.awt.Color(204, 204, 204));
        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );

        jPanelGeral.add(jPanelTabela);
        jPanelTabela.setBounds(10, 300, 400, 160);

        jBtnPesquisar.setBackground(new java.awt.Color(0, 0, 255));
        jBtnPesquisar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jBtnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.setOpaque(false);
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });
        jPanelGeral.add(jBtnPesquisar);
        jBtnPesquisar.setBounds(300, 270, 110, 23);

        jBtnSair.setBackground(new java.awt.Color(0, 0, 255));
        jBtnSair.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSair.setText("Sair");
        jBtnSair.setBorderPainted(false);
        jBtnSair.setOpaque(false);
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });
        jPanelGeral.add(jBtnSair);
        jBtnSair.setBounds(110, 470, 200, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/madeira.jpg"))); // NOI18N
        jPanelGeral.add(jLabel2);
        jLabel2.setBounds(0, 0, 420, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(436, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        if(jTxtNome.getText().isEmpty() || jTxtNome.getText().equals("Nome")){
            JOptionPane.showMessageDialog(null, "Preencha o 'Nome' para continuar");
            jTxtNome.requestFocus();
        }else if(jTxtCodigo.getText().isEmpty() || jTxtCodigo.getText().equals("Cod.")){
            JOptionPane.showMessageDialog(null, "Preencha o 'Código' para continuar");
            jTxtCodigo.requestFocus();
        }else if(jTxtQuantidade.getText().isEmpty() || jTxtQuantidade.getText().equals("Qntd.")){
            JOptionPane.showMessageDialog(null, "Preencha a 'Quantidade' para continuar");
            jTxtQuantidade.requestFocus();
        }else if(jTxtCompra.getText().isEmpty() || jTxtCompra.getText().equals("Compra")){
            JOptionPane.showMessageDialog(null, "Preencha o 'Preço de compra' para continuar");
            jTxtCompra.requestFocus();
        }else if(jTxtVenda.getText().isEmpty() || jTxtVenda.getText().equals("Venda")){
            JOptionPane.showMessageDialog(null, "Preencha o 'Preço de venda' para continuar");
            jTxtVenda.requestFocus();
        }else if(flag==1){
            mod.setNome(jTxtNome.getText());
            mod.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
            mod.setpCompra(Double.parseDouble(jTxtCompra.getText()));
            mod.setpVenda(Double.parseDouble(jTxtVenda.getText()));
            mod.setQuantidade(Integer.parseInt(jTxtQuantidade.getText()));
            control.Salvar(mod);
            jTxtCodigo.setText("Cod.");
            jTxtVenda.setText("Venda");
            jTxtCompra.setText("Compra");
            jTxtNome.setText("Nome");
            jTxtQuantidade.setText("Qntd.");
            jTxtID.setText("ID");
            jBtnCadastrar.setEnabled(false);
            jBtnCancelar.setEnabled(false);
            jBtnEditar.setEnabled(false);
            jTxtVenda.setEnabled(false);
            jTxtCompra.setEnabled(false);
            jTxtCodigo.setEnabled(false);
            jTxtQuantidade.setEnabled(false);
            preencherTabela("select *from produtos order by nome_produto");
            }else{
                mod.setNome(jTxtNome.getText());
                mod.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
                mod.setpCompra(Double.parseDouble(jTxtCompra.getText()));
                mod.setpVenda(Double.parseDouble(jTxtVenda.getText()));
                mod.setQuantidade(Integer.parseInt(jTxtQuantidade.getText()));
                control.Editar(mod);
                jTxtCodigo.setText("Cod.");
                jTxtVenda.setText("Venda");
                jTxtCompra.setText("Compra");
                jTxtNome.setText("Nome");
                jTxtQuantidade.setText("Qntd.");
                jTxtID.setText("ID");
                jBtnCadastrar.setEnabled(false);
                jBtnCancelar.setEnabled(false);
                jBtnEditar.setEnabled(false);
                jTxtVenda.setEnabled(false);
                jTxtCompra.setEnabled(false);
                jTxtCodigo.setEnabled(false);
                jTxtQuantidade.setEnabled(false);
                preencherTabela("select *from produtos order by nome_produto");
            }
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jBtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoActionPerformed
        flag=1;
        jBtnCadastrar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
        jTxtCodigo.setEnabled(true);
        jTxtVenda.setEnabled(true);
        jTxtCompra.setEnabled(true);
        jTxtNome.setEnabled(true);
        jTxtQuantidade.setEnabled(true); 
        jTxtCodigo.setText("Cod.");
        jTxtVenda.setText("Venda");
        jTxtCompra.setText("Compra");
        jTxtNome.setText("Nome");
        jTxtQuantidade.setText("Qntd.");
        jTxtID.setText("ID");
    }//GEN-LAST:event_jBtnNovoActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Preç. Entrada","Preç. Saída","Qntd."};
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+jTxtNome.getText()+"%'");
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getString("nome_produto"),conex.rs.getDouble("p_entrada_produto"),conex.rs.getDouble("p_saida_produto"),conex.rs.getInt("quantidade_produto")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array: \n"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTProdutos.setModel(modelo);
        jTProdutos.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTProdutos.getColumnModel().getColumn(1).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTProdutos.getColumnModel().getColumn(2).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTProdutos.getColumnModel().getColumn(3).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTProdutos.getTableHeader().setReorderingAllowed(false);
        jTProdutos.setAutoResizeMode(jTProdutos.AUTO_RESIZE_OFF);
        jTProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        jTxtCodigo.setText("Cod.");
        jTxtVenda.setText("Venda");
        jTxtCompra.setText("Compra");
        jTxtNome.setText("Nome");
        jTxtQuantidade.setText("Qntd.");
        jTxtID.setText("ID");
        jBtnCadastrar.setEnabled(false);
        jBtnCancelar.setEnabled(false);
        jTxtCodigo.setEnabled(false);
        jTxtVenda.setEnabled(false);
        jTxtCompra.setEnabled(false);
        jTxtQuantidade.setEnabled(false);
        jBtnEditar.setEnabled(false);
        jBtnExcluir.setEnabled(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        flag=2;
        jBtnCadastrar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
        jTxtCodigo.setEnabled(true);
        jTxtVenda.setEnabled(true);
        jTxtCompra.setEnabled(true);
        jTxtNome.setEnabled(true);
        jTxtQuantidade.setEnabled(true);
        jBtnEditar.setEnabled(false);
        jBtnExcluir.setEnabled(false);
        jBtnCancelar.setEnabled(true);
        mod.setAuxiliar(Integer.parseInt(jTxtCodigo.getText()));
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
            control.Excluir(mod);
        }   
        preencherTabela("select *from produtos order by nome_produto");
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        String nome_produto = ""+jTProdutos.getValueAt(jTProdutos.getSelectedRow(),0);
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto='"+nome_produto+"'");
        try {
            conex.rs.first();
            jTxtID.setText(String.valueOf(conex.rs.getInt("id_produto")));
            jTxtNome.setText(conex.rs.getString("nome_produto"));
            jTxtCodigo.setText(String.valueOf(conex.rs.getInt("codigo_produto")));
            jTxtCompra.setText(String.valueOf(conex.rs.getDouble("p_entrada_produto")));
            jTxtVenda.setText(String.valueOf(conex.rs.getDouble("p_saida_produto")));
            jTxtQuantidade.setText(String.valueOf(conex.rs.getInt("quantidade_produto")));
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!\n"+ex.getMessage());
        }
        conex.desconecta();
        jBtnEditar.setEnabled(true);
        jBtnExcluir.setEnabled(true);
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
        TelaPrincipal obj = new TelaPrincipal();
        obj.setVisible(true);
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jTxtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNomeFocusGained
        jTxtNome.setText("");
    }//GEN-LAST:event_jTxtNomeFocusGained

    private void jTxtQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtQuantidadeFocusGained
        jTxtQuantidade.setText("");
    }//GEN-LAST:event_jTxtQuantidadeFocusGained

    private void jTxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCodigoFocusGained
        jTxtCodigo.setText("");
    }//GEN-LAST:event_jTxtCodigoFocusGained

    private void jTxtCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCompraFocusGained
        jTxtCompra.setText("");
    }//GEN-LAST:event_jTxtCompraFocusGained

    private void jTxtVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtVendaFocusGained
        jTxtVenda.setText("");
    }//GEN-LAST:event_jTxtVendaFocusGained

    private void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Preç. Entrada","Preç. Saída","Qntd."};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getString("nome_produto"),conex.rs.getDouble("p_entrada_produto"),conex.rs.getDouble("p_saida_produto"),conex.rs.getInt("quantidade_produto")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array: \n"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTProdutos.setModel(modelo);
        jTProdutos.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTProdutos.getColumnModel().getColumn(1).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTProdutos.getColumnModel().getColumn(2).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTProdutos.getColumnModel().getColumn(3).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTProdutos.getTableHeader().setReorderingAllowed(false);
        jTProdutos.setAutoResizeMode(jTProdutos.AUTO_RESIZE_OFF);
        jTProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnNovo;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblImg;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelGeral;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtCompra;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtQuantidade;
    private javax.swing.JTextField jTxtVenda;
    // End of variables declaration//GEN-END:variables
}