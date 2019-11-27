package DAO;

import java.util.ArrayList;
import ModeloBD.ProdutoBD;
import java.sql.PreparedStatement;
import java.sql.Date;

public class ProdutoDATA {
    Conexao con;
    private ProdutoBD RegProduto;
    private ArrayList<ProdutoBD>  arrayProduto = new ArrayList ();

    public boolean Incluir(ProdutoBD Produto) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Produto (nome_produto, descricao_produto_servico, preco_produto_servico, "
                + "quantidade_produto_servici,dia_consumo, mes_consumo, ano_consumo) values (?,?,?,?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Produto.getNome_produto());
        ps.setString(2, Produto.getDescricao_produto_servico());
        ps.setDouble(3, Produto.getPreco_produto_servico());
        ps.setDouble(4, Produto.getQuantidade_produto_servici());
        ps.setDouble(5, Produto.getProdServDiacons());
        ps.setString(6, Produto.getProdServMescons());
        ps.setDouble(7, Produto.getProdServAnocons());
                       
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}