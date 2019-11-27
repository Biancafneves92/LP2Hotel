package DAO;

import java.util.ArrayList;
import ModeloBD.Hospedagem_QuartoBD;
import java.sql.PreparedStatement;

public class Hospedagem_quartoDATA {
    Conexao con;
    private Hospedagem_QuartoBD RegHospedagem_quarto;
    private ArrayList<Hospedagem_QuartoBD>  arrayHospedagem_quarto = new ArrayList ();

    public boolean Incluir(Hospedagem_QuartoBD Hospedagem_quarto) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Hospedagem_Quarto(cod_quarto, descricao_hospedagem_quarto) values (?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, Hospedagem_quarto.getCod_quarto());
        ps.setString(2, Hospedagem_quarto.getDescricao_hospedagem_quarto());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
}