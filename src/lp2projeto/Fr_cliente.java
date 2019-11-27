package lp2projeto;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.text.*;
import DAO.ClienteDATA;
import ModeloBD.ClienteBD;
import java.util.Date;


public class Fr_cliente extends javax.swing.JFrame {
    
    private ClienteBD RegCliente; 
    private ClienteDATA ClienteDAO =  new ClienteDATA ();
    
    
    public Fr_cliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        lb_nm_cliente = new javax.swing.JLabel();
        lb_snm_cliente = new javax.swing.JLabel();
        lb_cpf_cliente = new javax.swing.JLabel();
        lb_rg_cliente = new javax.swing.JLabel();
        lb_sexo_cliente = new javax.swing.JLabel();
        lb_email_cliente = new javax.swing.JLabel();
        lb_dt_nasc_cliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_clienteNm = new javax.swing.JTextField();
        tf_clienteSnm = new javax.swing.JTextField();
        tf_clienteCPF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_clienteRG = new javax.swing.JTextField();
        br_clienteMasc = new javax.swing.JRadioButton();
        br_clienteFemi = new javax.swing.JRadioButton();
        tf_clienteEmail = new javax.swing.JTextField();
        lb_rua_cliente = new javax.swing.JLabel();
        lb_Nrua_cliente = new javax.swing.JLabel();
        tf_clienteRua = new javax.swing.JTextField();
        tf_clienteNRua = new javax.swing.JTextField();
        lb_cep_cliente = new javax.swing.JLabel();
        tf_clienteCep = new javax.swing.JTextField();
        lb_bairro_cliente = new javax.swing.JLabel();
        tf_clienteBairro = new javax.swing.JTextField();
        lb_cidade_cliente = new javax.swing.JLabel();
        lb_estado_cliente = new javax.swing.JLabel();
        lb_pais_cliente = new javax.swing.JLabel();
        bt_clienteLimpar = new javax.swing.JButton();
        bt_clienteSalvar = new javax.swing.JButton();
        lb_clienteTel = new javax.swing.JLabel();
        tf_clienteTelefone = new javax.swing.JTextField();
        bt_clienteMenu = new javax.swing.JButton();
        cb_clientePais = new javax.swing.JComboBox<>();
        cb_clienteEstado = new javax.swing.JComboBox<>();
        cb_clienteCidade = new javax.swing.JComboBox<>();
        cb_clienteDtnasci = new javax.swing.JComboBox<>();
        cb_clienteMesNasc = new javax.swing.JComboBox<>();
        cb_clienteAnonasc = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_nm_cliente.setText("Nome:");

        lb_snm_cliente.setText("Sobrenome:");

        lb_cpf_cliente.setText("CPF:");

        lb_rg_cliente.setText("RG:");

        lb_sexo_cliente.setText("Sexo:");

        lb_email_cliente.setText("E-mail:");

        lb_dt_nasc_cliente.setText("Data de nascimento:");

        jLabel8.setText("Endereço");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setText("Cliente");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        br_clienteMasc.setText("Masculino");
        br_clienteMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_clienteMascActionPerformed(evt);
            }
        });

        br_clienteFemi.setText("Feminino");
        br_clienteFemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_clienteFemiActionPerformed(evt);
            }
        });

        lb_rua_cliente.setText("Logradouro:");

        lb_Nrua_cliente.setText("Nº:");

        lb_cep_cliente.setText("CEP:");

        lb_bairro_cliente.setText("Bairro:");

        lb_cidade_cliente.setText("Cidade:");

        lb_estado_cliente.setText("Estado:");

        lb_pais_cliente.setText("País:");

        bt_clienteLimpar.setText("Limpar");
        bt_clienteLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clienteLimparActionPerformed(evt);
            }
        });

        bt_clienteSalvar.setText("Incluir");
        bt_clienteSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clienteSalvarActionPerformed(evt);
            }
        });

        lb_clienteTel.setText("Telefone:");

        bt_clienteMenu.setText("Menu Principal");
        bt_clienteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clienteMenuActionPerformed(evt);
            }
        });

        cb_clientePais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brasil", "Outros" }));
        cb_clientePais.setSelectedIndex(-1);

        cb_clienteEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "São Paulo", "Outros" }));
        cb_clienteEstado.setSelectedIndex(-1);

        cb_clienteCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diadema", "Mauá", "Santo André", "São Bernardo do Campo", "São Caetano do Sul", "São Paulo", "Ribeirão Pires", "Rio Grande da Serra", "Outros" }));
        cb_clienteCidade.setSelectedIndex(-1);

        cb_clienteDtnasci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_clienteDtnasci.setSelectedIndex(-1);

        cb_clienteMesNasc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));
        cb_clienteMesNasc.setSelectedIndex(-1);

        cb_clienteAnonasc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901" }));
        cb_clienteAnonasc.setSelectedIndex(-1);

        jToggleButton1.setText("Alterar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_rua_cliente)
                            .addComponent(lb_Nrua_cliente))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_clienteRua, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_cep_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_clienteCep, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(tf_clienteNRua, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_clienteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bt_clienteLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(123, 123, 123)
                            .addComponent(jToggleButton1)
                            .addGap(18, 18, 18)
                            .addComponent(bt_clienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_dt_nasc_cliente)
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lb_nm_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_snm_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_cpf_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_rg_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_sexo_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_email_cliente, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lb_clienteTel)
                                    .addGap(93, 93, 93)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_clienteSnm)
                                .addComponent(tf_clienteCPF)
                                .addComponent(tf_clienteRG)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(br_clienteMasc)
                                    .addGap(60, 60, 60)
                                    .addComponent(br_clienteFemi))
                                .addComponent(tf_clienteEmail)
                                .addComponent(tf_clienteNm)
                                .addComponent(tf_clienteTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cb_clienteDtnasci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cb_clienteMesNasc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cb_clienteAnonasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lb_pais_cliente)
                            .addGap(19, 19, 19)
                            .addComponent(cb_clientePais, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb_estado_cliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cb_clienteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lb_cidade_cliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_clienteCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lb_bairro_cliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_clienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nm_cliente)
                    .addComponent(tf_clienteNm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_clienteSnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_snm_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_clienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cpf_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_clienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rg_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(br_clienteMasc)
                    .addComponent(br_clienteFemi)
                    .addComponent(lb_sexo_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_clienteTel)
                    .addComponent(tf_clienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_clienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_email_cliente))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_dt_nasc_cliente)
                    .addComponent(cb_clienteDtnasci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_clienteMesNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_clienteAnonasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_pais_cliente)
                    .addComponent(cb_clientePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_estado_cliente)
                    .addComponent(cb_clienteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cidade_cliente)
                    .addComponent(cb_clienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_bairro_cliente)
                    .addComponent(tf_clienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_rua_cliente)
                    .addComponent(tf_clienteRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nrua_cliente)
                    .addComponent(tf_clienteNRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cep_cliente)
                    .addComponent(tf_clienteCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_clienteLimpar)
                    .addComponent(bt_clienteSalvar)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addComponent(bt_clienteMenu)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void br_clienteMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_clienteMascActionPerformed
    br_clienteFemi.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_br_clienteMascActionPerformed

    private void bt_clienteLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clienteLimparActionPerformed
        LimparCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_clienteLimparActionPerformed

    private void bt_clienteSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clienteSalvarActionPerformed
    
        ConsisteCamposPreenchidos();
    
    if (TrataCampos()){
          
        setModelo();
        
        GravaDados();
    //    LimparCampos();
    } 
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_clienteSalvarActionPerformed

    private void br_clienteFemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_clienteFemiActionPerformed
    br_clienteMasc.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_br_clienteFemiActionPerformed

    private void bt_clienteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clienteMenuActionPerformed
    Fr_menu localMenu = new Fr_menu ();
    localMenu.setVisible(true);
    this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_clienteMenuActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    AlterarDados();        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Fr_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton br_clienteFemi;
    private javax.swing.JRadioButton br_clienteMasc;
    private javax.swing.JButton bt_clienteLimpar;
    private javax.swing.JButton bt_clienteMenu;
    private javax.swing.JButton bt_clienteSalvar;
    private javax.swing.JComboBox<String> cb_clienteAnonasc;
    private javax.swing.JComboBox<String> cb_clienteCidade;
    private javax.swing.JComboBox<String> cb_clienteDtnasci;
    private javax.swing.JComboBox<String> cb_clienteEstado;
    private javax.swing.JComboBox<String> cb_clienteMesNasc;
    private javax.swing.JComboBox<String> cb_clientePais;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lb_Nrua_cliente;
    private javax.swing.JLabel lb_bairro_cliente;
    private javax.swing.JLabel lb_cep_cliente;
    private javax.swing.JLabel lb_cidade_cliente;
    private javax.swing.JLabel lb_clienteTel;
    private javax.swing.JLabel lb_cpf_cliente;
    private javax.swing.JLabel lb_dt_nasc_cliente;
    private javax.swing.JLabel lb_email_cliente;
    private javax.swing.JLabel lb_estado_cliente;
    private javax.swing.JLabel lb_nm_cliente;
    private javax.swing.JLabel lb_pais_cliente;
    private javax.swing.JLabel lb_rg_cliente;
    private javax.swing.JLabel lb_rua_cliente;
    private javax.swing.JLabel lb_sexo_cliente;
    private javax.swing.JLabel lb_snm_cliente;
    private javax.swing.JTextField tf_clienteBairro;
    private javax.swing.JTextField tf_clienteCPF;
    private javax.swing.JTextField tf_clienteCep;
    private javax.swing.JTextField tf_clienteEmail;
    private javax.swing.JTextField tf_clienteNRua;
    private javax.swing.JTextField tf_clienteNm;
    private javax.swing.JTextField tf_clienteRG;
    private javax.swing.JTextField tf_clienteRua;
    private javax.swing.JTextField tf_clienteSnm;
    private javax.swing.JTextField tf_clienteTelefone;
    // End of variables declaration//GEN-END:variables

    private String clienteBairro;
    private long clienteCPF;
    private int clienteCep;
    private String clienteCidade;
    private String clienteEmail;
    private String clienteEstado;
    private int clienteNRua;
    private String clienteNm;
    private String clientePais;
    private long clienteRG;
    private String clienteRua;
    private String clienteSnm;
    private long clienteTelefone; 
//    private Date clienteDtnasci; 
    private String clienteSexo;
    private int clienteAnonasc;
    private String clienteMesNasc; 
    private int clienteDianasci; 
    
    //private ModeloProjeto mod;
    //private Modelo mod = new Modelo ();
    //public ArrayList<ModeloProjeto> Lista = new ArrayList();
    //DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
    
    public void setModelo() {
        RegCliente =  new ClienteBD();
        RegCliente.setCPF_cliente(clienteCPF);
        RegCliente.setEmail_Cliente(clienteEmail);
        RegCliente.setNome_cliente(clienteNm);
        RegCliente.setRG_Cliente(clienteRG);
        RegCliente.setSobrenome_cliente(clienteSnm);
        RegCliente.setSexo_cliente(clienteSexo);
        RegCliente.setBairro_cliente(clienteBairro);
        RegCliente.setCep_cliente(clienteCep);
        RegCliente.setCidade_cliente(clienteCidade);
        RegCliente.setEstado_cliente(clienteEstado);
        RegCliente.setNm_rua_cliente(clienteNRua);
        RegCliente.setPais_cliente(clientePais);
        RegCliente.setRua_cliente(clienteRua);
        RegCliente.setFone_cliente(clienteTelefone);
        //        RegCliente.setDatanascimento_cliente(clienteDtnasci);
        RegCliente.setAnoNascimento_cliente(clienteAnonasc);
        RegCliente.setMesNascimento_cliente(clienteMesNasc);
        RegCliente.setDianascimento_cliente(clienteDianasci);
    }
    
private void GravaDados(){
        try {
            ClienteDAO.Incluir(RegCliente);
            JOptionPane.showMessageDialog(rootPane, "Dados Gravados com Sucesso!!!","Mensagem",JOptionPane.PLAIN_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Gravar/n"+ex.getMessage()+"/n"+ex.toString(),"ERRO",JOptionPane.ERROR);
        }
}
  private void AlterarDados(){
        try {
            ClienteDAO.Alterar(RegCliente);
            JOptionPane.showMessageDialog(rootPane, "Dados Alterados com Sucesso!!!","Mensagem",JOptionPane.PLAIN_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Gravar/n"+ex.getMessage()+"/n"+ex.toString(),"ERRO",JOptionPane.ERROR);
        }
}  
private void LimparCampos (){
    tf_clienteBairro.setText(null);
    tf_clienteCPF.setText(null);
    tf_clienteCep.setText(null);
    cb_clienteCidade.setSelectedIndex(-1);
    tf_clienteEmail.setText(null);
    cb_clienteEstado.setSelectedIndex(-1);        
    tf_clienteNRua.setText(null);      
    tf_clienteNm.setText(null);
    cb_clientePais.setSelectedIndex(-1);       
    tf_clienteRG.setText(null);      
    tf_clienteRua.setText(null);
    tf_clienteSnm.setText(null);
    tf_clienteTelefone.setText(null);
    br_clienteFemi.setSelected(false);
    br_clienteMasc.setSelected(false);
    //tf_clienteDtNasc.setText(null);
    cb_clienteAnonasc.setSelectedIndex(-1);
    cb_clienteDtnasci.setSelectedIndex(-1);
    cb_clienteMesNasc.setSelectedIndex(-1);
}
    
    public boolean TrataCampos() {
    boolean retorno = false;
    System.out.println("TC");
    try {
        clienteNm = tf_clienteNm.getText().trim();
        clienteSnm = tf_clienteSnm.getText().trim();
        clienteEmail = tf_clienteEmail.getText().trim();
        clienteRua = tf_clienteRua.getText().trim();
        clienteBairro = tf_clienteBairro.getText().trim();
       clienteCidade = cb_clienteCidade.getItemAt(cb_clienteCidade.getSelectedIndex());
       clienteEstado = cb_clienteEstado.getItemAt(cb_clienteEstado.getSelectedIndex());
       clientePais = cb_clientePais.getItemAt(cb_clientePais.getSelectedIndex());
        
        clienteCPF = Long.parseLong(tf_clienteCPF.getText().trim());
        clienteRG = Integer.parseInt(tf_clienteRG.getText().trim());
        clienteTelefone = Integer.parseInt(tf_clienteTelefone.getText().trim());
        clienteNRua = Integer.parseInt(tf_clienteNRua.getText().trim());
        clienteCep = Integer.parseInt(tf_clienteCep.getText().trim());

        clienteMesNasc = cb_clienteMesNasc.getItemAt(cb_clienteMesNasc.getSelectedIndex());
        clienteDianasci = cb_clienteDtnasci.getSelectedIndex();
        clienteAnonasc = cb_clienteAnonasc.getSelectedIndex();
        
       if(br_clienteFemi.isSelected()) clienteSexo= "F"; else clienteSexo="M";
       retorno = true;
        }
    catch (NumberFormatException erro) {
        JOptionPane.showMessageDialog(null, "CPF, RG, Telefone, Nº casa e CEP devem ser campos numéricos","Erro",JOptionPane.ERROR_MESSAGE);
    }
    return retorno;
}
    
    
    public void ConsisteCamposPreenchidos() {
    if (tf_clienteNm.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Preencha o Nome!","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if (tf_clienteSnm.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Preencha o Sobrenome!","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(tf_clienteCPF.getText().trim().isEmpty()) {
     JOptionPane.showMessageDialog(null, "Preencha o CPF!","Erro",JOptionPane.ERROR_MESSAGE);   
    }
    if(tf_clienteEmail.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Preencha o Email!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(tf_clienteTelefone.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Preencha o Telefone!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(tf_clienteRua.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Preencha o Logradouro!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(tf_clienteNRua.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Preencha o Nº da casa!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(tf_clienteCep.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Preencha o CEP!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(tf_clienteBairro.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Preencha o Bairro!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(cb_clienteCidade.getSelectedIndex()==-1) {
      JOptionPane.showMessageDialog(null, "Preencha a Cidade!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(cb_clienteEstado.getSelectedIndex()==-1) {
      JOptionPane.showMessageDialog(null, "Preencha o Estado!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if(cb_clientePais.getSelectedIndex()==-1) {
      JOptionPane.showMessageDialog(null, "Preencha o Pais!","Erro",JOptionPane.ERROR_MESSAGE);  
    }
    if((!br_clienteFemi.isSelected())&&(!br_clienteMasc.isSelected())){
        JOptionPane.showMessageDialog(null, "Selecione o Sexo!","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_clienteAnonasc.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione o ano de nascimento","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_clienteDtnasci.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione a data de nascimento","Erro",JOptionPane.ERROR_MESSAGE);
    }
    if(cb_clienteMesNasc.getSelectedIndex()==-1) {
        JOptionPane.showMessageDialog(null, "Selecione o mês de nascimento","Erro",JOptionPane.ERROR_MESSAGE);
    }

}

/*    private Date Date(String trim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

}
