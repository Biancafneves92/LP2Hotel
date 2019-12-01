package lp2projeto;
import DAO.Conexao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import DAO.HospedagemDATA;
import ModeloBD.HospedagemBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Fr_hospedagem extends javax.swing.JFrame {
    
    Conexao con;
    
    private HospedagemBD RegHospedagem = new HospedagemBD();
    private HospedagemDATA HospedagemDAO =  new HospedagemDATA ();
    
    public Fr_hospedagem() {
        initComponents();
        preenchecomboQuarto();
        preenchecomboCliente();
    }
    
    private void preenchecomboQuarto () {
        cb_quarto.removeAllItems();
        try{
            con = new Conexao();
             String SQL = "Select tipo_quarto from Quarto ";
             PreparedStatement ps = con.getConexao().prepareStatement(SQL);
             ResultSet rs = ps.executeQuery();
                
             while(rs.next()){
                 String name = rs.getString ("tipo_quarto");
                 cb_quarto.addItem(name);
             }
        }
        catch (Exception e){
            e.printStackTrace();
            //throw new Exception("Erro ao consultar agenda !");
        }
    }
    
        private void preenchecomboCliente () {
        cb_clienteHospedagem.removeAllItems();
        try{
            con = new Conexao();
             String SQL = "Select nome_cliente from Cliente ";
             PreparedStatement ps = con.getConexao().prepareStatement(SQL);
             ResultSet rs = ps.executeQuery();
                
             while(rs.next()){
                 String name = rs.getString ("nome_cliente");
                 cb_clienteHospedagem.addItem(name);
             }
        }
        catch (Exception e){
            e.printStackTrace();
            //throw new Exception("Erro ao consultar agenda !");
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

        lb_hospedagem = new javax.swing.JLabel();
        lb_hospCliente = new javax.swing.JLabel();
        lb_hospDtentrada = new javax.swing.JLabel();
        cb_hospDtentrada = new javax.swing.JComboBox<>();
        cb_hospMesEntrada = new javax.swing.JComboBox<>();
        cb_hospAnoEntrada = new javax.swing.JComboBox<>();
        lb_hospDtsaida = new javax.swing.JLabel();
        cb_hospDtsaida = new javax.swing.JComboBox<>();
        cb_hospMesSaida = new javax.swing.JComboBox<>();
        cb_hospAnoSaida = new javax.swing.JComboBox<>();
        lb_hospDescricao = new javax.swing.JLabel();
        tf_hospDescricao = new javax.swing.JTextField();
        lb_hospPrecEstadia = new javax.swing.JLabel();
        tf_hospPrecEstadia = new javax.swing.JTextField();
        bt_hospLimpar = new javax.swing.JButton();
        bt_hospSalvar = new javax.swing.JButton();
        lb_hospQuarto = new javax.swing.JLabel();
        bt_hospMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cb_quarto = new javax.swing.JComboBox();
        cb_clienteHospedagem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lb_hospedagem.setText("Hospedagem");
        lb_hospedagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_hospCliente.setText("Cliente:");

        lb_hospDtentrada.setText("Data Entrada:");

        cb_hospDtentrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_hospDtentrada.setSelectedIndex(-1);

        cb_hospMesEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));
        cb_hospMesEntrada.setSelectedIndex(-1);

        cb_hospAnoEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cb_hospAnoEntrada.setSelectedIndex(-1);

        lb_hospDtsaida.setText("Data Saída:");

        cb_hospDtsaida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_hospDtsaida.setSelectedIndex(-1);

        cb_hospMesSaida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));
        cb_hospMesSaida.setSelectedIndex(-1);

        cb_hospAnoSaida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cb_hospAnoSaida.setSelectedIndex(-1);

        lb_hospDescricao.setText("Descrição:");

        lb_hospPrecEstadia.setText("Preço Estadia:");

        bt_hospLimpar.setText("Limpar");
        bt_hospLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hospLimparActionPerformed(evt);
            }
        });

        bt_hospSalvar.setText("Registrar");
        bt_hospSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hospSalvarActionPerformed(evt);
            }
        });

        lb_hospQuarto.setText("Quarto:");

        bt_hospMenu.setText("Menu Principal");
        bt_hospMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hospMenuActionPerformed(evt);
            }
        });

        jButton1.setText("Incluir Acompanhante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Deseja incluir um acompanhante ?");

        cb_quarto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_quarto.setSelectedIndex(-1);
        cb_quarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_quartoActionPerformed(evt);
            }
        });

        cb_clienteHospedagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_clienteHospedagem.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(bt_hospMenu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_hospLimpar)
                            .addGap(18, 18, 18)
                            .addComponent(bt_hospSalvar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_hospDtsaida)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_hospCliente)
                                        .addComponent(lb_hospDtentrada)
                                        .addComponent(lb_hospDescricao)
                                        .addComponent(lb_hospPrecEstadia)
                                        .addComponent(lb_hospQuarto))
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cb_hospDtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cb_hospMesSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cb_hospAnoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tf_hospDescricao)
                                        .addComponent(tf_hospPrecEstadia)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(cb_hospDtentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cb_hospMesEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cb_hospAnoEntrada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(cb_quarto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_clienteHospedagem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(lb_hospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lb_hospedagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hospCliente)
                    .addComponent(cb_clienteHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hospDtentrada)
                    .addComponent(cb_hospDtentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_hospMesEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_hospAnoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_hospDtsaida)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_hospDtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_hospMesSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_hospAnoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hospDescricao)
                    .addComponent(tf_hospDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hospPrecEstadia)
                    .addComponent(tf_hospPrecEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hospQuarto)
                    .addComponent(cb_quarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_hospSalvar)
                    .addComponent(bt_hospLimpar)
                    .addComponent(bt_hospMenu))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_hospLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hospLimparActionPerformed
    LimparCamposHosp();
// TODO add your handling code here:
    }//GEN-LAST:event_bt_hospLimparActionPerformed

    private void bt_hospSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hospSalvarActionPerformed
    ConsisteCamposPreenchidos();
    if (TrataCampos()){
        setModelo();
        GravaDados();
        LimparCamposHosp();
    } 
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_hospSalvarActionPerformed

    private void bt_hospMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hospMenuActionPerformed
    Fr_menu localMenu = new Fr_menu ();
    localMenu.setVisible(true);
    this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_bt_hospMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Fr_acompanhante a = new Fr_acompanhante ();
      a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_quartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_quartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_quartoActionPerformed

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
            java.util.logging.Logger.getLogger(Fr_hospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_hospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_hospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_hospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_hospedagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_hospLimpar;
    private javax.swing.JButton bt_hospMenu;
    private javax.swing.JButton bt_hospSalvar;
    private javax.swing.JComboBox<String> cb_clienteHospedagem;
    private javax.swing.JComboBox<String> cb_hospAnoEntrada;
    private javax.swing.JComboBox<String> cb_hospAnoSaida;
    private javax.swing.JComboBox<String> cb_hospDtentrada;
    private javax.swing.JComboBox<String> cb_hospDtsaida;
    private javax.swing.JComboBox<String> cb_hospMesEntrada;
    private javax.swing.JComboBox<String> cb_hospMesSaida;
    private javax.swing.JComboBox cb_quarto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_hospCliente;
    private javax.swing.JLabel lb_hospDescricao;
    private javax.swing.JLabel lb_hospDtentrada;
    private javax.swing.JLabel lb_hospDtsaida;
    private javax.swing.JLabel lb_hospPrecEstadia;
    private javax.swing.JLabel lb_hospQuarto;
    private javax.swing.JLabel lb_hospedagem;
    private javax.swing.JTextField tf_hospDescricao;
    private javax.swing.JTextField tf_hospPrecEstadia;
    // End of variables declaration//GEN-END:variables

    private String hospCliente;
    private int hospDtEntrada;
    private int hospDtSaida;
    private String hospMesEntrada;
    private String hospMesSaida;
    private int hospAnoEntrada;
    private int hospAnoSaida;
    private String hospDescricao;
    private double hospPrecEstadia;
    private String hospQuarto;
    
    //private ModeloProjeto mod;
    //private Modelo mod = new Modelo ();
    //public ArrayList<ModeloProjeto> Lista = new ArrayList();
    
private void LimparCamposHosp(){
    tf_hospDescricao.setText(null);
    tf_hospPrecEstadia.setText(null);
    cb_hospAnoEntrada.setSelectedIndex(-1);
    cb_hospAnoSaida.setSelectedIndex(-1);
    cb_hospDtentrada.setSelectedIndex(-1);
    cb_hospDtsaida.setSelectedIndex(-1);
    cb_hospMesEntrada.setSelectedIndex(-1);
    cb_hospMesSaida.setSelectedIndex(-1);
    cb_quarto.setSelectedIndex(-1);
}

public void setModelo() {
    //RegHospedagem = new ModeloProjeto ();
    RegHospedagem.setDia_entrada(hospDtEntrada);
    RegHospedagem.setDia_saida(hospDtSaida);
    RegHospedagem.setMes_entrada(hospMesEntrada);
    RegHospedagem.setMes_saida(hospMesSaida);
    RegHospedagem.setAno_entrada(hospAnoEntrada);
    RegHospedagem.setAno_saida(hospAnoSaida);
    RegHospedagem.setDescricao_hospedagem(hospDescricao);
    RegHospedagem.setPreco_hospedagem(hospPrecEstadia);
}
    
private void GravaDados(){
        try {
            HospedagemDAO.Incluir(RegHospedagem);
            JOptionPane.showMessageDialog(rootPane, "Dados Gravados com Sucesso!!!","Mensagem",JOptionPane.PLAIN_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Gravar/n"+ex.getMessage()+"/n"+ex.toString(),"ERRO",JOptionPane.ERROR);
        }
}
    
    public boolean TrataCampos() {
    boolean retorno = false;
    try {
        hospMesEntrada = cb_hospMesEntrada.getItemAt(cb_hospMesEntrada.getSelectedIndex());
        hospDtEntrada = cb_hospDtentrada.getSelectedIndex();
        hospAnoEntrada = cb_hospAnoEntrada.getSelectedIndex();
        
        hospMesSaida = cb_hospMesSaida.getItemAt(cb_hospMesSaida.getSelectedIndex());
        hospDtSaida = cb_hospDtsaida.getSelectedIndex();
        hospAnoSaida = cb_hospAnoSaida.getSelectedIndex();
        
        hospDescricao = tf_hospDescricao.getText().trim();
        
        hospPrecEstadia = Double.parseDouble(tf_hospPrecEstadia.getText().trim());
        
       retorno = true;
        }
    catch (NumberFormatException erro) {
        JOptionPane.showMessageDialog(null, "O preço e Quarto deve ser campo numérico","Erro",JOptionPane.ERROR_MESSAGE);
    }
    return retorno;
}
    
    
    public void ConsisteCamposPreenchidos() {
    /*if (tf_hospCliente.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Preencha o Nome do cliente!","Erro",JOptionPane.ERROR_MESSAGE);
    }*/
    if(tf_hospPrecEstadia.getText().trim().isEmpty()) {
     JOptionPane.showMessageDialog(null, "Preencha o preço da estadia!","Erro",JOptionPane.ERROR_MESSAGE);   
    }
    /*if(tf_hospQuarto.getText().trim().isEmpty()) {
     JOptionPane.showMessageDialog(null, "Preencha o quarto da estadia!","Erro",JOptionPane.ERROR_MESSAGE);   
    }*/
    if(cb_hospAnoEntrada.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione o ano de entrada","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_hospAnoSaida.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione o ano de saída","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_hospDtentrada.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione a data de entrada","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_hospDtsaida.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione a data de saída","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_hospMesEntrada.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione o mês de entrada","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_hospMesSaida.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione o mês de saída","Erro",JOptionPane.ERROR_MESSAGE);
    }
    
}


}
