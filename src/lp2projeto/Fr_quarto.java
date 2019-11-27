package lp2projeto;
import DAO.QuartoDATA;
import ModeloBD.QuartoBD;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fr_quarto extends javax.swing.JFrame {
    
    private QuartoBD RegQuarto = new QuartoBD();
    private QuartoDATA QuartoDAO =  new QuartoDATA ();
    
    private String  quartoTipo;
    private int     quartoNum;
    private double  quartoPreco;
    private String  quartoDescr;

    //private ModeloProjeto mod;
    //private Modelo mod = new Modelo ();
    //public ArrayList<ModeloProjeto> Lista = new ArrayList();
    
    public Fr_quarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb_quartTipo = new javax.swing.JLabel();
        lb_quartNum = new javax.swing.JLabel();
        tf_quartNum = new javax.swing.JTextField();
        cb_quartTipo = new javax.swing.JComboBox<>();
        lb_quartDesc = new javax.swing.JLabel();
        tf_quartDesc = new javax.swing.JTextField();
        bt_quartoMenu = new javax.swing.JButton();
        bt_quartoSalvar = new javax.swing.JButton();
        bt_quartoLimpar = new javax.swing.JButton();
        lb_quartoPreco = new javax.swing.JLabel();
        tf_quartoPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quarto");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_quartTipo.setText("Tipo:");

        lb_quartNum.setText("Número:");

        cb_quartTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro simples", "Solteiro master", "Solteiro luxo", "Duplo solteiro simples", "Duplo solteiro master", "Casal simples", "Casal master", "Casal luxo" }));
        cb_quartTipo.setSelectedIndex(-1);
        cb_quartTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_quartTipoActionPerformed(evt);
            }
        });

        lb_quartDesc.setText("Descrição:");

        bt_quartoMenu.setText("Menu Principal");
        bt_quartoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quartoMenuActionPerformed(evt);
            }
        });

        bt_quartoSalvar.setText("Incluir");
        bt_quartoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quartoSalvarActionPerformed(evt);
            }
        });

        bt_quartoLimpar.setText("Limpar");
        bt_quartoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quartoLimparActionPerformed(evt);
            }
        });

        lb_quartoPreco.setText("Preço:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(bt_quartoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_quartoLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_quartoSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_quartDesc)
                                    .addComponent(lb_quartTipo)
                                    .addComponent(lb_quartoPreco)
                                    .addComponent(lb_quartNum))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_quartTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_quartDesc)
                                    .addComponent(tf_quartoPreco)
                                    .addComponent(tf_quartNum, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_quartTipo)
                    .addComponent(cb_quartTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_quartNum)
                    .addComponent(tf_quartNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_quartDesc)
                    .addComponent(tf_quartDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_quartoPreco)
                    .addComponent(tf_quartoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_quartoSalvar)
                    .addComponent(bt_quartoLimpar))
                .addGap(69, 69, 69)
                .addComponent(bt_quartoMenu)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_quartTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_quartTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_quartTipoActionPerformed

    private void bt_quartoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quartoMenuActionPerformed
        Fr_menu localMenu = new Fr_menu ();
        localMenu.setVisible(true);
     this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_quartoMenuActionPerformed

    private void bt_quartoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quartoLimparActionPerformed
        LimparCamposQuarto();
        
    }//GEN-LAST:event_bt_quartoLimparActionPerformed

    private void bt_quartoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quartoSalvarActionPerformed
        ConsisteCamposPreenchidos();
        if (TrataCampos()){
            setModelo();
            GravaDados();
            LimparCamposQuarto();
        } 
    }//GEN-LAST:event_bt_quartoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Fr_quarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_quarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_quarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_quarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_quarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_quartoLimpar;
    private javax.swing.JButton bt_quartoMenu;
    private javax.swing.JButton bt_quartoSalvar;
    private javax.swing.JComboBox<String> cb_quartTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_quartDesc;
    private javax.swing.JLabel lb_quartNum;
    private javax.swing.JLabel lb_quartTipo;
    private javax.swing.JLabel lb_quartoPreco;
    private javax.swing.JTextField tf_quartDesc;
    private javax.swing.JTextField tf_quartNum;
    private javax.swing.JTextField tf_quartoPreco;
    // End of variables declaration//GEN-END:variables

               

    public void setModelo() {
       RegQuarto.setTipo_quarto(quartoTipo);
       RegQuarto.setNumero_quarto(quartoNum);
       RegQuarto.setDescricao_quarto(quartoDescr);
       RegQuarto.setPreco_quarto(quartoPreco);
    }   
        
    private void GravaDados(){
        try {
            QuartoDAO.Incluir(RegQuarto);
            JOptionPane.showMessageDialog(rootPane, "Dados Gravados com Sucesso!!!","Mensagem",JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(Fr_quarto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void LimparCamposQuarto(){
        tf_quartDesc.setText(null);
        tf_quartNum.setText(null);
        cb_quartTipo.setSelectedIndex(-1);
        tf_quartoPreco.setText(null);
    }
    
    public boolean TrataCampos() {
            boolean retorno = false;
            try {
                quartoTipo = cb_quartTipo.getItemAt(cb_quartTipo.getSelectedIndex());

                quartoDescr = tf_quartDesc.getText().trim();

                quartoNum = Integer.parseInt(tf_quartNum.getText().trim());
                quartoPreco = Double.parseDouble(tf_quartoPreco.getText().trim());

               retorno = true;
                }
            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "O número do quarto deve ser campo numérico","Erro",JOptionPane.ERROR_MESSAGE);
            }
            return retorno;
    }
    
    
    public void ConsisteCamposPreenchidos() { 
        if (tf_quartDesc.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Nome!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        if (tf_quartNum.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Sobrenome!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        if(cb_quartTipo.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(null, "Selecione a data de nascimento","Erro",JOptionPane.ERROR_MESSAGE);
        }
        if(tf_quartoPreco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Preço!","Erro",JOptionPane.ERROR_MESSAGE);
        }

    }
   
} // fim 
