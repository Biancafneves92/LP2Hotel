package DAO;

import java.util.ArrayList;
import ModeloBD.PaisBD;
import java.sql.PreparedStatement;

public class PaisDATA {
    Conexao con;
    private PaisBD RegPais;
    private ArrayList<PaisBD>  arrayPais = new ArrayList ();

    public boolean Incluir(PaisBD Pais) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Pais(nome_pais) values (?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Pais.getNome_pais());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}