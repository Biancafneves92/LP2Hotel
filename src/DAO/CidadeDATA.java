package DAO;

import java.util.ArrayList;
import ModeloBD.CidadeBD;
import java.sql.PreparedStatement;

public class CidadeDATA {
    Conexao con;
    private CidadeBD RegCidade;
    private ArrayList<CidadeBD>  arrayCidade = new ArrayList ();

    public boolean Incluir(CidadeBD Cidade) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Cidade(nome_cidade, cod_estado) values (?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Cidade.getNome_cidade());
        ps.setInt(2, Cidade.getCod_estado());

        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}