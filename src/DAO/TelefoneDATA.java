package DAO;

import java.util.ArrayList;
import ModeloBD.TelefoneBD;
import java.sql.PreparedStatement;

public class TelefoneDATA {
    Conexao con;
    private TelefoneBD RegTelefone;
    private ArrayList<TelefoneBD>  arrayTelefone = new ArrayList ();

    public boolean Incluir(TelefoneBD Telefone) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Telefone(telefone_celular, telefone_contato, cod_cliente) values (?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1,Telefone.getTelefone_celular());
        ps.setInt(2, Telefone.getTelefone_contato());
        ps.setInt(3, Telefone.getCod_cliente());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}