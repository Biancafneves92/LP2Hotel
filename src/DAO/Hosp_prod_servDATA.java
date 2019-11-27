package DAO;

import java.util.ArrayList;
import ModeloBD.Hosp_prod_servBD;
import java.sql.PreparedStatement;

public class Hosp_prod_servDATA {
    Conexao con;
    private Hosp_prod_servBD RegHosp_prod_serv;
    private ArrayList<Hosp_prod_servBD>  arrayHosp_prod_serv = new ArrayList ();

    public boolean Incluir(Hosp_prod_servBD Hosp_prod_serv) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Hosp_prod_serv(cod_produto_servico, descricao_hospedagem_produto, preco_produto_servico, quantidade_produto_servici) values (?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1,Hosp_prod_serv.getCod_produto_servico());
        ps.setString(2, Hosp_prod_serv.getDescricao_hospedagem_produto());
        ps.setDouble(3, Hosp_prod_serv.getPreco_produto_servico());
        ps.setDouble(4, Hosp_prod_serv.getQuantidade_produto_servici());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}