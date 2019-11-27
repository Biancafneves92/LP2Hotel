package DAO;

import java.util.ArrayList;
import ModeloBD.QuartoBD;
import java.sql.PreparedStatement;

public class QuartoDATA {
    Conexao con;
    private QuartoBD RegQuarto;
    private ArrayList<QuartoBD>  arrayQuarto = new ArrayList ();

    public boolean Incluir(QuartoBD quarto) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Quarto(tipo_quarto,descricao_quarto, numero_quarto, preco_quarto) values (?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,quarto.getTipo_quarto());
        ps.setString(2, quarto.getDescricao_quarto());
        ps.setInt(3, quarto.getNumero_quarto());
        ps.setDouble(4, quarto.getPreco_quarto());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}
