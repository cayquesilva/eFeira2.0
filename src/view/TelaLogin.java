/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab-NTM-01
 */
public class TelaLogin extends javax.swing.JFrame {
    int flag;
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin(int auxiliar) {
        this.flag=auxiliar;
        initComponents();
    }

    public boolean checkLogin(String login, String senha){
        return login.equals("usuario") && senha.equals("123");         
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
        jBtnAcessar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JtxtUsuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLblCarro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("eFeira - Autenticação");
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Autenticação Necessária", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jBtnAcessar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnAcessar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jBtnAcessar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.png"))); // NOI18N
        jBtnAcessar.setBorder(null);
        jBtnAcessar.setBorderPainted(false);
        jBtnAcessar.setContentAreaFilled(false);
        jBtnAcessar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login selecionado.png"))); // NOI18N
        jBtnAcessar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login mouse.png"))); // NOI18N
        jBtnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAcessarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAcessar);
        jBtnAcessar.setBounds(90, 240, 79, 35);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar selecionado.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar mouse.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 240, 77, 35);

        JtxtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        JtxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtxtUsuario.setText("Usuario");
        JtxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtxtUsuarioFocusGained(evt);
            }
        });
        jPanel1.add(JtxtUsuario);
        JtxtUsuario.setBounds(100, 160, 140, 30);

        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("usuario");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(100, 200, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon 64.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 80, 64, 60);

        jLblCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/circulo.png"))); // NOI18N
        jPanel1.add(jLblCarro);
        jLblCarro.setBounds(20, 30, 310, 310);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 340, 360);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 380);

        setSize(new java.awt.Dimension(375, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAcessarActionPerformed
        if(checkLogin(JtxtUsuario.getText(),new String(jPasswordField1.getPassword()))){
            JOptionPane.showMessageDialog(null, "Bem vindo!");
            dispose();
            switch (this.flag) {
                case 0:
                    {
                        TelaEstoque obj = new TelaEstoque();
                        obj.setVisible(true);
                        break;
                    }
                case 1:
                    {
                        TelaCliente obj = new TelaCliente();
                        obj.setVisible(true);
                        break;
                    }
                case 2:
                    {
                        TelaRelatorio obj = new TelaRelatorio();
                        obj.setVisible(true);
                        break;
                    }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
        }
    }//GEN-LAST:event_jBtnAcessarActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            if(checkLogin(JtxtUsuario.getText(),new String(jPasswordField1.getPassword()))){
                JOptionPane.showMessageDialog(null, "Bem vindo!");
                dispose();
                switch (this.flag) {
                    case 0:
                        {
                            TelaEstoque obj = new TelaEstoque();
                            obj.setVisible(true);
                            break;
                        }
                    case 1:
                        {
                            TelaCliente obj = new TelaCliente();
                            obj.setVisible(true);
                            break;
                        }
                    case 2:
                        {
                            TelaRelatorio obj = new TelaRelatorio();
                            obj.setVisible(true);
                            break;
                        }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!"); 
            }
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        TelaPrincipal obj = new TelaPrincipal();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JtxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtxtUsuarioFocusGained
        JtxtUsuario.setText("");
    }//GEN-LAST:event_JtxtUsuarioFocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1FocusGained

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtxtUsuario;
    private javax.swing.JButton jBtnAcessar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblCarro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
