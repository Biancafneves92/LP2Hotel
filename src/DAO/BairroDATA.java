package DAO;

import java.util.ArrayList;
import ModeloBD.BairroBD;
import java.sql.PreparedStatement;

public class BairroDATA {
    Conexao con;
    private BairroBD RegBairro;
    private ArrayList<BairroBD>  arrayBairro = new ArrayList ();

    public boolean Incluir(BairroBD Bairro) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Bairro(nome_bairro, cod_cidade) values (?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, Bairro.getNome_bairro());
        ps.setInt(2, Bairro.getCod_cidade());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}