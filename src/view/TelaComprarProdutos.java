/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansProduto;
import modeloBeans.BeansVenda;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoProduto;
import modeloDao.DaoVendas;

/**
 *
 * @author Cayque
 */
public final class TelaComprarProdutos extends javax.swing.JFrame {

    BeansProduto mod = new BeansProduto();
    BeansVenda modd = new BeansVenda();
    ConexaoBD conex = new ConexaoBD();
    DaoProduto control = new DaoProduto();
    DaoVendas control2 = new DaoVendas();
    DecimalFormat df = new DecimalFormat("0.00");
    
    String auxiliar;
    int auxiliar2,id_cliente,id_venda,quantidade,id_produto=0,quant_prod=0;
    private double aux,total=0;
    /**
     * Creates new form TelaComprarProdutos
     */
    public TelaComprarProdutos() {
        initComponents();
        preencherTabela("select *from produtos order by nome_produto");
        PreencherCbox();
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbProdutos1 = new javax.swing.JTable();
        jBtnAddCarrinho = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCbCliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos2 = new javax.swing.JTable();
        jBtnFinalCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLblTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jBtnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra de Produtos");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Produtos Disponíveis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jTbProdutos1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTbProdutos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTbProdutos1.setOpaque(false);
        jScrollPane2.setViewportView(jTbProdutos1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 400, 430);

        jBtnAddCarrinho.setBackground(new java.awt.Color(0, 0, 255));
        jBtnAddCarrinho.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jBtnAddCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAddCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cart_add.png"))); // NOI18N
        jBtnAddCarrinho.setBorderPainted(false);
        jBtnAddCarrinho.setContentAreaFilled(false);
        jBtnAddCarrinho.setOpaque(false);
        jBtnAddCarrinho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cart.png"))); // NOI18N
        jBtnAddCarrinho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cart_selecionado.png"))); // NOI18N
        jBtnAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddCarrinhoActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnAddCarrinho);
        jBtnAddCarrinho.setBounds(190, 490, 40, 40);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(105, 489, 0, 0);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adicionar item ao carrinho");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(130, 470, 170, 14);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 40, 423, 540);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cliente em atendimento: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(190, 10, 210, 20);

        jCbCliente.setBackground(new java.awt.Color(204, 204, 204));
        jCbCliente.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jCbCliente.setForeground(new java.awt.Color(255, 255, 255));
        jCbCliente.setMaximumRowCount(20);
        jCbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbCliente.setToolTipText("Selecione um Cliente");
        jCbCliente.setOpaque(false);
        jPanel1.add(jCbCliente);
        jCbCliente.setBounds(410, 10, 250, 19);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon 64.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(820, 10, 64, 64);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Minha Lista de Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jTProdutos2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTProdutos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTProdutos2.setOpaque(false);
        jScrollPane1.setViewportView(jTProdutos2);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 400, 430);

        jBtnFinalCompra.setBackground(new java.awt.Color(255, 255, 255));
        jBtnFinalCompra.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jBtnFinalCompra.setForeground(new java.awt.Color(204, 204, 204));
        jBtnFinalCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/finalizar.png"))); // NOI18N
        jBtnFinalCompra.setBorderPainted(false);
        jBtnFinalCompra.setContentAreaFilled(false);
        jBtnFinalCompra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/finalizar selecionado.png"))); // NOI18N
        jBtnFinalCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/finalizar mouse.png"))); // NOI18N
        jBtnFinalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFinalCompraActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnFinalCompra);
        jBtnFinalCompra.setBounds(280, 490, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor Total:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(140, 470, 70, 16);

        jLblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblTotal.setText("0.00");
        jPanel2.add(jLblTotal);
        jLblTotal.setBounds(250, 470, 70, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R$");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(220, 470, 20, 15);

        jBtnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnCancelar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jBtnCancelar.setForeground(new java.awt.Color(204, 204, 204));
        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelarcompra.png"))); // NOI18N
        jBtnCancelar.setBorderPainted(false);
        jBtnCancelar.setContentAreaFilled(false);
        jBtnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelarcompra selecionado.png"))); // NOI18N
        jBtnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelarcompra mouse.png"))); // NOI18N
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnCancelar);
        jBtnCancelar.setBounds(10, 490, 130, 40);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(16, 15, 0, 0);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(450, 40, 423, 540);

        jBtnSair.setBackground(new java.awt.Color(0, 0, 255));
        jBtnSair.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jBtnSair.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        jBtnSair.setBorderPainted(false);
        jBtnSair.setContentAreaFilled(false);
        jBtnSair.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair selecionado.png"))); // NOI18N
        jBtnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair mouse.png"))); // NOI18N
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSair);
        jBtnSair.setBounds(390, 580, 111, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo principal2.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -20, 890, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(906, 664));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnFinalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFinalCompraActionPerformed
        // TODO add your handling code here:
        id_cliente = PegarID();
        if(id_cliente==1){
            JOptionPane.showMessageDialog(null, "Você precisa selecionar um cliente!!!");
            jCbCliente.requestFocus();
        }else{
            modd.setId_cliente(id_cliente);
            modd.setSubTotal(Double.parseDouble(jLblTotal.getText().replaceAll(",", ".")));
            control2.SalvarVendas(modd);
            id_venda=PegarIDVenda("select id from vendas_finalizadas where clientes like "+id_cliente+" order by id desc");
            modd.setId_venda(id_venda);
            control2.AtualizaProdutosVenda(modd);
            control2.AtualizaProdutosEstoque(modd);
            JOptionPane.showMessageDialog(null, "Sua compra foi finalizada!");
            jCbCliente.setEnabled(true);
            jCbCliente.setSelectedIndex(0);
            jLblTotal.setText("0.00");
            ArrayList dados = new ArrayList();
            String[] colunas = new String[]{"Nome","Valor Und.","Qntd.","Valor Total"};
            ModeloTabela modelo = new ModeloTabela(dados, colunas);
            jTProdutos2.setModel(modelo);
            jTProdutos2.getColumnModel().getColumn(0).setPreferredWidth(184);
            jTProdutos2.getColumnModel().getColumn(0).setResizable(false);
            jTProdutos2.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTProdutos2.getColumnModel().getColumn(1).setResizable(false);
            jTProdutos2.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTProdutos2.getColumnModel().getColumn(2).setResizable(false);
            jTProdutos2.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTProdutos2.getColumnModel().getColumn(3).setResizable(false);
            jTProdutos2.getTableHeader().setReorderingAllowed(false);
            jTProdutos2.setAutoResizeMode(jTProdutos2.AUTO_RESIZE_OFF);
            jTProdutos2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }
    }//GEN-LAST:event_jBtnFinalCompraActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        jCbCliente.setEnabled(true);
        jCbCliente.setSelectedIndex(0);
        jLblTotal.setText("0.00");
        control2.CompraCanceladaExcluir();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Valor Und.","Qntd.","Valor Total"};
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTProdutos2.setModel(modelo);
        jTProdutos2.getColumnModel().getColumn(0).setPreferredWidth(184);
        jTProdutos2.getColumnModel().getColumn(0).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTProdutos2.getColumnModel().getColumn(1).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTProdutos2.getColumnModel().getColumn(2).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTProdutos2.getColumnModel().getColumn(3).setResizable(false);
        jTProdutos2.getTableHeader().setReorderingAllowed(false);
        jTProdutos2.setAutoResizeMode(jTProdutos2.AUTO_RESIZE_OFF);
        jTProdutos2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
        TelaPrincipal obj = new TelaPrincipal();
        obj.setVisible(true);
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddCarrinhoActionPerformed
        id_cliente = PegarID();
        if(id_cliente==1){
            JOptionPane.showMessageDialog(null, "Você precisa selecionar um cliente!!!");
            jCbCliente.requestFocus();
        }else{
            modd.setId_cliente(id_cliente);
            id_produto = PegarIDProduto();
            modd.setId_produto(id_produto);
            quant_prod = control2.PegarQuantProduto(id_produto);
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos desse tipo você quer? "));
            while(quantidade>quant_prod){
                JOptionPane.showMessageDialog(null, ""+id_produto);
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Só existem [ "+quant_prod+" ] produtos deste tipo em estoque \n Digite uma quantidade válida!"));
            }
            modd.setQuant_produto(quantidade);
            modd.setSubTotal(modd.getQuant_produto()*PegarPrecoProduto());
            control2.SalvarProdutos(modd);
            preencherTabela2("SELECT produtos.nome_produto, produtos.p_saida_produto, produtos_vendas.quantidade_produto FROM produtos,produtos_vendas WHERE produtos_vendas.id_cliente = "+id_cliente+" AND produtos_vendas.id_venda = 0 AND produtos.id_produto = produtos_vendas.id_produtos");
            jLblTotal.setText(df.format(PegarTotal(id_cliente)));
            jCbCliente.setEnabled(false);
        }
    }//GEN-LAST:event_jBtnAddCarrinhoActionPerformed

    private void preencherTabela2(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Valor Und.","Qntd.","Valor Total"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
            dados.add(new Object[]{conex.rs.getString("produtos.nome_produto"),conex.rs.getDouble("produtos.p_saida_produto"),conex.rs.getInt("produtos_vendas.quantidade_produto"),df.format(conex.rs.getInt("produtos_vendas.quantidade_produto")*conex.rs.getDouble("produtos.p_saida_produto"))});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array: \n"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTProdutos2.setModel(modelo);
        jTProdutos2.getColumnModel().getColumn(0).setPreferredWidth(184);
        jTProdutos2.getColumnModel().getColumn(0).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTProdutos2.getColumnModel().getColumn(1).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTProdutos2.getColumnModel().getColumn(2).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTProdutos2.getColumnModel().getColumn(3).setResizable(false);
        jTProdutos2.getTableHeader().setReorderingAllowed(false);
        jTProdutos2.setAutoResizeMode(jTProdutos2.AUTO_RESIZE_OFF);
        jTProdutos2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

    private void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Preço"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getString("nome_produto"),conex.rs.getDouble("p_saida_produto")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array: \n"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTbProdutos1.setModel(modelo);
        jTbProdutos1.getColumnModel().getColumn(0).setPreferredWidth(291);
        jTbProdutos1.getColumnModel().getColumn(0).setResizable(false);
        jTbProdutos1.getColumnModel().getColumn(1).setPreferredWidth(103);
        jTbProdutos1.getColumnModel().getColumn(1).setResizable(false);
        jTbProdutos1.getTableHeader().setReorderingAllowed(false);
        jTbProdutos1.setAutoResizeMode(jTbProdutos1.AUTO_RESIZE_OFF);
        jTbProdutos1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
    
    public void PreencherCbox(){
        conex.conexao();
        conex.executaSql("select *from clientes order by nome_cliente");
        try {
            conex.rs.first();
            jCbCliente.removeAllItems();
            do{
                jCbCliente.addItem(conex.rs.getString("nome_cliente")); 
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher opções de clientes\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public int PegarID(){
        conex.conexao();
        auxiliar = (String)jCbCliente.getSelectedItem();
        conex.executaSql("select *from clientes where nome_cliente like'%"+auxiliar+"%'");
        try {
            conex.rs.first();
            auxiliar2 = conex.rs.getInt("id_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o id do cliente!\n"+ex.getMessage());
        }
        conex.desconecta();
        return auxiliar2;
    }
    
    public int PegarIDProduto(){
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+jTbProdutos1.getValueAt(jTbProdutos1.getSelectedRow(), 0)+"%'");
        try {
            conex.rs.first();
            auxiliar2 = conex.rs.getInt("id_produto");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o id do produto!\n"+ex.getMessage());
        }
        conex.desconecta();
        return auxiliar2;
    }
    
    public int PegarIDVenda(String sql){
        conex.conexao();
        conex.executaSql(sql);
        try {
            conex.rs.first();
            auxiliar2 = conex.rs.getInt("id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o id da venda!\n"+ex.getMessage());
        }
        conex.desconecta();
        return auxiliar2;
    }
    
    public Double PegarPrecoProduto(){
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+jTbProdutos1.getValueAt(jTbProdutos1.getSelectedRow(), 0)+"%'");
        try {
            conex.rs.first();
            aux = conex.rs.getDouble("p_saida_produto");
            NumberFormat.getCurrencyInstance().format(aux);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o preço do produto!\n"+ex.getMessage());
        }
        conex.desconecta();
        return aux;
    }
    
    public Double PegarTotal(int cliente){
        conex.conexao();
        conex.executaSql("select sum(valor_final) as soma from produtos_vendas where id_cliente like "+cliente+" and id_venda like 0");
        try {
            conex.rs.first();
            total= conex.rs.getDouble("soma");
            NumberFormat.getCurrencyInstance().format(total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel calcular o preço total da venda!\n"+ex.getMessage());
        }
        conex.desconecta();
        return total;
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
            java.util.logging.Logger.getLogger(TelaComprarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComprarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComprarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComprarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComprarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddCarrinho;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnFinalCompra;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JComboBox<String> jCbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTProdutos2;
    private javax.swing.JTable jTbProdutos1;
    // End of variables declaration//GEN-END:variables
}
