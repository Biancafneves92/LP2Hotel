package DAO;

import java.util.ArrayList;
import ModeloBD.EstadoBD;
import java.sql.PreparedStatement;

public class EstadoDATA {
    Conexao con;
    private EstadoBD RegEstado;
    private ArrayList<EstadoBD>  arrayEstado = new ArrayList ();

    public boolean Incluir(EstadoBD Estado) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Estado(nome_estado, cod_pais) values (?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Estado.getNome_estado());
        ps.setInt(2, Estado.getCod_pais());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}