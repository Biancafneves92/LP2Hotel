package DAO;

import java.util.ArrayList;
import ModeloBD.ClienteBD;
import java.sql.Date;
import java.sql.PreparedStatement;

public class ClienteDATA {
    Conexao con;
    private ClienteBD RegCliente;
    private ArrayList<ClienteBD>  arrayCliente = new ArrayList ();

    public boolean Incluir(ClienteBD Cliente) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "insert into Cliente(nome_cliente, sobrenome_cliente, CPF_cliente, RG_Cliente, sexo_cliente, email_Cliente, "
                + "dianascimento_cliente, mesnascimento_cliente, anonascimento_cliente, nome_bairro, nome_pais, nome_estado, "
                + "nome_cidade, numero_endereco, rua_endereco,cep_endereco, tel_cliente) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Cliente.getNome_cliente());
        ps.setString(2, Cliente.getSobrenome_cliente());
        ps.setLong(3, Cliente.getCPF_cliente());
        ps.setLong(4, Cliente.getRG_Cliente());
        ps.setString(5, Cliente.getSexo_cliente());
        ps.setString(6, Cliente.getEmail_Cliente());
        ps.setInt(7, Cliente.getDianascimento_cliente());
        ps.setString(8, Cliente.getMesNascimento_cliente());
        ps.setInt(9, Cliente.getAnoNascimento_cliente());
        ps.setString(10, Cliente.getBairro_cliente());
        ps.setString(11, Cliente.getPais_cliente());
        ps.setString(12, Cliente.getEstado_cliente());
        ps.setString(13, Cliente.getCidade_cliente());
        ps.setInt(14, Cliente.getNm_rua_cliente());
        ps.setString(15, Cliente.getRua_cliente());
        ps.setInt(16, Cliente.getCep_cliente());
        ps.setLong(17, Cliente.getFone_cliente());
        
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }

  public boolean Alterar (ClienteBD Cliente) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "update into Cliente(nome_cliente, sobrenome_cliente, CPF_cliente, RG_Cliente, sexo_cliente, email_Cliente, "
                + "dianascimento_cliente, mesnascimento_cliente, anonascimento_cliente, nome_bairro, nome_pais, nome_estado, "
                + "nome_cidade, numero_endereco, rua_endereco,cep_endereco, tel_cliente) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Cliente.getNome_cliente());
        ps.setString(2, Cliente.getSobrenome_cliente());
        ps.setLong(3, Cliente.getCPF_cliente());
        ps.setLong(4, Cliente.getRG_Cliente());
        ps.setString(5, Cliente.getSexo_cliente());
        ps.setString(6, Cliente.getEmail_Cliente());
        ps.setInt(7, Cliente.getDianascimento_cliente());
        ps.setString(8, Cliente.getMesNascimento_cliente());
        ps.setInt(9, Cliente.getAnoNascimento_cliente());
        ps.setString(10, Cliente.getBairro_cliente());
        ps.setString(11, Cliente.getPais_cliente());
        ps.setString(12, Cliente.getEstado_cliente());
        ps.setString(13, Cliente.getCidade_cliente());
        ps.setInt(14, Cliente.getNm_rua_cliente());
        ps.setString(15, Cliente.getRua_cliente());
        ps.setInt(16, Cliente.getCep_cliente());
        ps.setLong(17, Cliente.getFone_cliente());
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }
  
   /*/public boolean Excluir (ClienteBD Cliente) throws Exception{
        boolean retorno=false;
        con = new Conexao();
        String SQL = "delete into Cliente where nome_cliente = (nomeCliente)
                
              //(nome_cliente, sobrenome_cliente, CPF_cliente, RG_Cliente, sexo_cliente, email_Cliente, 
                
               // + "dianascimento_cliente, mesnascimento_cliente, anonascimento_cliente, nome_bairro, nome_pais, nome_estado, "
              // + "nome_cidade, numero_endereco, rua_endereco,cep_endereco, tel_cliente) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1,Cliente.getNome_cliente());
        ps.setString(2, Cliente.getSobrenome_cliente());
        ps.setLong(3, Cliente.getCPF_cliente());
        ps.setLong(4, Cliente.getRG_Cliente());
        ps.setString(5, Cliente.getSexo_cliente());
        ps.setString(6, Cliente.getEmail_Cliente());
        ps.setInt(7, Cliente.getDianascimento_cliente());
        ps.setString(8, Cliente.getMesNascimento_cliente());
        ps.setInt(9, Cliente.getAnoNascimento_cliente());
        ps.setString(10, Cliente.getBairro_cliente());
        ps.setString(11, Cliente.getPais_cliente());
        ps.setString(12, Cliente.getEstado_cliente());
        ps.setString(13, Cliente.getCidade_cliente());
        ps.setInt(14, Cliente.getNm_rua_cliente());
        ps.setString(15, Cliente.getRua_cliente());
        ps.setInt(16, Cliente.getCep_cliente());
        ps.setLong(17, Cliente.getFone_cliente());
        if(ps.executeUpdate() > 0) {
            retorno = true;
        }
        return retorno;
    }*/
}