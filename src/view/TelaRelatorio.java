/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import modeloDao.DaoProduto;

/**
 *
 * @author Cayque
 */
public class TelaRelatorio extends javax.swing.JFrame {

    DaoProduto control = new DaoProduto();
    DecimalFormat df = new DecimalFormat("0.00");
    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorio() {
        initComponents();
        jLblTotalGasto.setText(String.valueOf(NumberFormat.getCurrencyInstance().format(control.PegarGastoTotal())));
        jLblTotalVendido.setText(String.valueOf(NumberFormat.getCurrencyInstance().format(control.PegarVendasTotal())));
        jLblLucroReal.setText(String.valueOf(NumberFormat.getCurrencyInstance().format(control.PegarLucroReal())));
        df.setMaximumFractionDigits(2);
        jLblLucroPorcentagem.setText(""+String.valueOf(df.format(control.PegarLucroPorcento()))+" %");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLblTotalGasto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLblTotalVendido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLblLucroReal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLblLucroPorcentagem = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBtnSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(200, 300));

        jPanelFundo.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon 64.png"))); // NOI18N
        jPanelFundo.add(jLabel7);
        jLabel7.setBounds(264, 0, 70, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rendimento Atual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Total gasto na compra de produtos ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 270, 20);

        jLblTotalGasto.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLblTotalGasto.setForeground(new java.awt.Color(255, 255, 255));
        jLblTotalGasto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblTotalGasto.setText("0.00");
        jPanel1.add(jLblTotalGasto);
        jLblTotalGasto.setBounds(10, 150, 270, 13);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total de venda de produtos ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 170, 270, 13);

        jLblTotalVendido.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLblTotalVendido.setForeground(new java.awt.Color(255, 255, 255));
        jLblTotalVendido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblTotalVendido.setText("0.00");
        jPanel1.add(jLblTotalVendido);
        jLblTotalVendido.setBounds(10, 190, 270, 13);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lucro obtido em reais ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 210, 270, 13);

        jLblLucroReal.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLblLucroReal.setForeground(new java.awt.Color(255, 255, 255));
        jLblLucroReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblLucroReal.setText("0.00");
        jPanel1.add(jLblLucroReal);
        jLblLucroReal.setBounds(10, 230, 270, 13);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Margem percentual de lucro ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 250, 270, 13);

        jLblLucroPorcentagem.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLblLucroPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        jLblLucroPorcentagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblLucroPorcentagem.setText("0");
        jPanel1.add(jLblLucroPorcentagem);
        jLblLucroPorcentagem.setBounds(10, 270, 270, 13);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/finanças.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 20, 100, 110);

        jPanelFundo.add(jPanel1);
        jPanel1.setBounds(20, 20, 290, 300);

        jBtnSair.setBackground(new java.awt.Color(0, 0, 255));
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
        jPanelFundo.add(jBtnSair);
        jBtnSair.setBounds(120, 330, 80, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo principal2.jpg"))); // NOI18N
        jPanelFundo.add(jLabel6);
        jLabel6.setBounds(0, 0, 330, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(346, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
        TelaPrincipal obj = new TelaPrincipal();
        obj.setVisible(true);
    }//GEN-LAST:event_jBtnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblLucroPorcentagem;
    private javax.swing.JLabel jLblLucroReal;
    private javax.swing.JLabel jLblTotalGasto;
    private javax.swing.JLabel jLblTotalVendido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFundo;
    // End of variables declaration//GEN-END:variables
}
