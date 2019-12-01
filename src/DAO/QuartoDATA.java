package DAO;

import java.util.ArrayList;
import ModeloBD.QuartoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.Conexao;

public class QuartoDATA {
    Conexao con;
    private QuartoBD RegQuarto;
    QuartoBD LocalQuarto = new QuartoBD();
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
    
    public ArrayList<QuartoBD>  Consulta () throws Exception {
        arrayQuarto.clear();
        boolean retorno=false;
        con = new Conexao();
        String SQL = "SELECT tipo_quarto, descricao_quarto, numero_quarto, preco_quarto FROM Quarto";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            RegQuarto = new QuartoBD();
            RegQuarto.setTipo_quarto(rs.getString("tipo_quarto"));
            RegQuarto.setDescricao_quarto(rs.getString("descricao_quarto"));
            RegQuarto.setNumero_quarto(rs.getInt("numero_quarto"));
            RegQuarto.setPreco_quarto(rs.getDouble("preco_quarto"));
            
            arrayQuarto.add(RegQuarto);
        }
        return arrayQuarto;
    }
    
    public boolean Apagar(QuartoBD RegQuarto) throws Exception {
        boolean retorno=false;
        con = new Conexao();
        
        String SQL = "delete from Quarto where cod_quarto  = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
 
        ps.setInt(1, RegQuarto.getCod_quarto());
        if(ps.executeUpdate() > 0) {
             retorno = true;
        }
        return retorno;
    }
    
        private void setQuarto(/*int cod_quarto,*/ String tipo_quarto, String descricao_quarto, int numero_quarto, double preco_quarto, int cd_TpU) {
        //LocalQuarto.setCod_quarto(cod_quarto););
        LocalQuarto.setDescricao_quarto(descricao_quarto);
        LocalQuarto.setNumero_quarto(numero_quarto);
        LocalQuarto.setPreco_quarto(preco_quarto);
        LocalQuarto.setTipo_quarto(tipo_quarto);
    }
    
}
