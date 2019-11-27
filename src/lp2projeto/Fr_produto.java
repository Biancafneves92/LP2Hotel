package lp2projeto;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAO.ProdutoDATA;
import ModeloBD.ProdutoBD;
import java.util.Date;

public class Fr_produto extends javax.swing.JFrame {
    
   
    private ProdutoBD RegProduto;
    private ProdutoDATA ProdutoDAO =  new ProdutoDATA ();
    
   
    public Fr_produto() {
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
        lb_prodservNm = new javax.swing.JLabel();
        lb_prodservDescricao = new javax.swing.JLabel();
        lb_prodservDtConsumo = new javax.swing.JLabel();
        lb_prodservPreco = new javax.swing.JLabel();
        lb_prodservQuant = new javax.swing.JLabel();
        tf_prodservNm = new javax.swing.JTextField();
        tf_prodservDescricao = new javax.swing.JTextField();
        tf_prodservPreco = new javax.swing.JTextField();
        tf_prodservQuant = new javax.swing.JTextField();
        bt_prodservLimpar = new javax.swing.JButton();
        bt_prodservSalvar = new javax.swing.JButton();
        bt_prodMenu = new javax.swing.JButton();
        cb_prodServDtcons = new javax.swing.JComboBox<>();
        cb_prodServAnocons = new javax.swing.JComboBox<>();
        cb_prodServMescons = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Produtos e Serviços");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_prodservNm.setText("Nome Produto/Serviço:");

        lb_prodservDescricao.setText("Descrição:");

        lb_prodservDtConsumo.setText("Data do consumo:");

        lb_prodservPreco.setText("Preço:");

        lb_prodservQuant.setText("Quantidade:");

        bt_prodservLimpar.setText("Limpar");
        bt_prodservLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_prodservLimparActionPerformed(evt);
            }
        });

        bt_prodservSalvar.setText("Incluir");
        bt_prodservSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_prodservSalvarActionPerformed(evt);
            }
        });

        bt_prodMenu.setText("Menu Principal");
        bt_prodMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_prodMenuActionPerformed(evt);
            }
        });

        cb_prodServDtcons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_prodServDtcons.setSelectedIndex(-1);

        cb_prodServAnocons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cb_prodServAnocons.setSelectedIndex(-1);

        cb_prodServMescons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));
        cb_prodServMescons.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_prodservNm)
                            .addComponent(lb_prodservDescricao)
                            .addComponent(lb_prodservDtConsumo)
                            .addComponent(lb_prodservPreco)
                            .addComponent(lb_prodservQuant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_prodservNm)
                            .addComponent(tf_prodservDescricao)
                            .addComponent(tf_prodservPreco)
                            .addComponent(tf_prodservQuant)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_prodServDtcons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_prodServMescons, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_prodServAnocons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_prodservLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(bt_prodservSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_prodMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_prodservNm)
                    .addComponent(tf_prodservNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_prodservDescricao)
                    .addComponent(tf_prodservDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_prodservDtConsumo)
                    .addComponent(cb_prodServDtcons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_prodServAnocons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_prodServMescons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_prodservPreco)
                    .addComponent(tf_prodservPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_prodservQuant)
                    .addComponent(tf_prodservQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_prodservLimpar)
                    .addComponent(bt_prodservSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_prodMenu)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_prodservLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_prodservLimparActionPerformed
    LimparCamposProd();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_prodservLimparActionPerformed

    private void bt_prodservSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_prodservSalvarActionPerformed
    ConsisteCamposPreenchidos();
    System.out.println("a");
    if (TrataCampos()){
        System.out.println("b");
        setModelo();
        System.out.println("c");
        GravaDados();
        System.out.println("d");
        LimparCamposProd();
        System.out.println("e");
    } 

        // TODO add your handling code here:
    }//GEN-LAST:event_bt_prodservSalvarActionPerformed

    private void bt_prodMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_prodMenuActionPerformed
    Fr_menu localMenu = new Fr_menu ();
    localMenu.setVisible(true);
    this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_bt_prodMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Fr_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_prodMenu;
    private javax.swing.JButton bt_prodservLimpar;
    private javax.swing.JButton bt_prodservSalvar;
    private javax.swing.JComboBox<String> cb_prodServAnocons;
    private javax.swing.JComboBox<String> cb_prodServDtcons;
    private javax.swing.JComboBox<String> cb_prodServMescons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_prodservDescricao;
    private javax.swing.JLabel lb_prodservDtConsumo;
    private javax.swing.JLabel lb_prodservNm;
    private javax.swing.JLabel lb_prodservPreco;
    private javax.swing.JLabel lb_prodservQuant;
    private javax.swing.JTextField tf_prodservDescricao;
    private javax.swing.JTextField tf_prodservNm;
    private javax.swing.JTextField tf_prodservPreco;
    private javax.swing.JTextField tf_prodservQuant;
    // End of variables declaration//GEN-END:variables

    private String prodDescricao;
    private String prodNome;
    private double prodPreco;
    private int prodQuant;
    private int prodServAnocons;
    private String prodServMescons; 
    private int prodServDiacons;
    
    //private ModeloProjeto mod;
    //private Modelo mod = new Modelo ();
    //public ArrayList<ModeloProjeto> Lista = new ArrayList();
            
private void LimparCamposProd(){
    tf_prodservDescricao.setText(null);
    tf_prodservNm.setText(null);
    tf_prodservPreco.setText(null);
    tf_prodservQuant.setText(null);
    cb_prodServAnocons.setSelectedIndex(-1);
    cb_prodServDtcons.setSelectedIndex(-1);
    cb_prodServMescons.setSelectedIndex(-1);
}

    public void setModelo() {
        RegProduto = new ProdutoBD();
        RegProduto.setDescricao_produto_servico(prodDescricao);
        RegProduto.setNome_produto(prodNome);
        RegProduto.setPreco_produto_servico(prodPreco);
        RegProduto.setQuantidade_produto_servici(prodQuant);
        RegProduto.setProdServAnocons(prodServAnocons);
        RegProduto.setProdServDiacons(prodServDiacons);
        RegProduto.setProdServMescons(prodServMescons);
    }
    
    private void GravaDados(){
        try {
            System.out.println("c1");
            ProdutoDAO.Incluir(RegProduto);
            System.out.println("c2");
            JOptionPane.showMessageDialog(rootPane, "Dados Gravados com Sucesso!!!","Mensagem",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Gravar/n"+ex.getMessage()+"/n"+ex.toString(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean TrataCampos() {
    boolean retorno = false;
    try {
        prodServMescons = cb_prodServMescons.getItemAt(cb_prodServMescons.getSelectedIndex());
        prodServDiacons = cb_prodServDtcons.getSelectedIndex();
        prodServAnocons = cb_prodServAnocons.getSelectedIndex();
        
        prodNome = tf_prodservNm.getText().trim();
        prodDescricao = tf_prodservDescricao.getText().trim();
        
        prodPreco = Double.parseDouble(tf_prodservPreco.getText().trim());
        prodQuant = Integer.parseInt(tf_prodservQuant.getText().trim());
        
       retorno = true;
        }
    catch (NumberFormatException erro) {
        JOptionPane.showMessageDialog(null, "Preço e Quantidade devem ser campos numéricos","Erro",JOptionPane.ERROR_MESSAGE);
    }
    return retorno;
}
    
    
    public void ConsisteCamposPreenchidos() {
    if (tf_prodservDescricao.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Preencha o Nome!","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if (tf_prodservNm.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Preencha o Sobrenome!","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(tf_prodservPreco.getText().trim().isEmpty()) {
     JOptionPane.showMessageDialog(null, "Preencha o CPF!","Erro",JOptionPane.ERROR_MESSAGE);   
    }
    if(tf_prodservQuant.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Preencha o Email!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(cb_prodServMescons.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione o ano de consumo","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_prodServDtcons.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione a data de consumo","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_prodServMescons.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione o mês de consumo","Erro",JOptionPane.ERROR_MESSAGE);
    }
}


}