package DAO;

import java.util.ArrayList;
import ModeloBD.AcompanhanteBD;
import java.sql.PreparedStatement;
//import java.sql.Date;

public class AcompanhanteDATA {
    Conexao con;
    private AcompanhanteBD RegAcompanhante;
    private ArrayList<AcompanhanteBD>  arrayAcompanhante = new ArrayList ();

    public boolean Incluir(AcompanhanteBD Acompanhante) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Acompanhante(nome_acompanhante, sobrenome_acompanhante, CPF_acompanhante, sexo_acompanhante, "
                + "cod_hospedagem, dianascimento_acompahante, mesnascimento_acompahante,anonascimento_acompahante,"
                + " rg_acompanhante,email_acompanhante) values (?,?,?,?,?,?,?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Acompanhante.getNome_acompanhante());
        ps.setString(2, Acompanhante.getSobrenome_acompanhante());
        ps.setLong(3, Acompanhante.getCPF_acompanhante());
        ps.setString(4, Acompanhante.getSexo_acompanhante());
        ps.setInt(5, Acompanhante.getCod_hospedagem());
        ps.setInt(6, Acompanhante.getAcompDianasci());
        ps.setString(7, Acompanhante.getAcompMesNasc());
        ps.setInt(8, Acompanhante.getAcompAnonasc());
        ps.setInt(9, Acompanhante.getRg_acompanhante());
        ps.setString(10, Acompanhante.getEmail_acompanhante());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }



    public boolean Alterar(AcompanhanteBD Acompanhante) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Acompanhante(nome_acompanhante, sobrenome_acompanhante, CPF_acompanhante, sexo_acompanhante, "
                + "cod_hospedagem, dianascimento_acompahante, mesnascimento_acompahante,anonascimento_acompahante,"
                + " rg_acompanhante,email_acompanhante) values (?,?,?,?,?,?,?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Acompanhante.getNome_acompanhante());
        ps.setString(2, Acompanhante.getSobrenome_acompanhante());
        ps.setLong(3, Acompanhante.getCPF_acompanhante());
        ps.setString(4, Acompanhante.getSexo_acompanhante());
        ps.setInt(5, Acompanhante.getCod_hospedagem());
        ps.setInt(6, Acompanhante.getAcompDianasci());
        ps.setString(7, Acompanhante.getAcompMesNasc());
        ps.setInt(8, Acompanhante.getAcompAnonasc());
        ps.setInt(9, Acompanhante.getRg_acompanhante());
        ps.setString(10, Acompanhante.getEmail_acompanhante());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
} 