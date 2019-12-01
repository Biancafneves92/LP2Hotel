package DAO;

import java.util.ArrayList;
import ModeloBD.HospedagemBD;
import java.sql.PreparedStatement;
import java.sql.Date;

public class HospedagemDATA {
    Conexao con;
    private HospedagemBD RegHospedagem;
    private ArrayList<HospedagemBD>  arrayHospedagem = new ArrayList ();

    public boolean Incluir(HospedagemBD Hospedagem) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Hospedagem(dia_entrada, dia_saida, mes_entrada, mes_saida, ano_entrada,ano_saida, "
                + "descricao_hospedagem, cod_cliente, preco_hospedagem) values (?,?,?,?,?,?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, Hospedagem.getDia_entrada());
        ps.setInt(2, Hospedagem.getDia_saida());
        ps.setString(3, Hospedagem.getMes_entrada());
        ps.setString(4, Hospedagem.getMes_saida());
        ps.setInt(5, Hospedagem.getAno_entrada());
        ps.setInt(6, Hospedagem.getAno_saida());
        ps.setString(7, Hospedagem.getDescricao_hospedagem());
        ps.setInt(8, Hospedagem.getCod_cliente());
        ps.setDouble(9, Hospedagem.getPreco_hospedagem());
       
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
    
     
   /* public Fr_hospedagem() {
        //initComponents();
        preenchecomboCliente ();
        preenchecomboAcompanhante ();
        preenchecomboProduto ();
        
        
    }*/
    

}