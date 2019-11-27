package DAO;

import java.util.ArrayList;
import ModeloBD.EnderecoBD;
import java.sql.PreparedStatement;

public class EnderecoDATA {
    Conexao con;
    private EnderecoBD RegEndereco;
    private ArrayList<EnderecoBD>  arrayEndereco = new ArrayList ();

    public boolean Incluir(EnderecoBD Endereco) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Endereco(rua_endereco, numero_endereco, CEP_endereco, cod_bairro) values (?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Endereco.getRua_endereco());
        ps.setInt(2, Endereco.getNumero_endereco());
        ps.setInt(3, Endereco.getCEP_endereco());
        ps.setInt(4, Endereco.getCod_bairro());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}