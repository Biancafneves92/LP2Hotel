package ModeloBD;
import java.util.Date;

public class HospedagemBD {

private int cod_hospedagem;
private int dia_entrada;
private int dia_saida;
private String mes_entrada;
private String mes_saida;
private int ano_entrada;
private int ano_saida;
private String descricao_hospedagem;
private int cod_cliente;
private double preco_hospedagem;

    public int getCod_hospedagem() {
        return cod_hospedagem;
    }

    public void setCod_hospedagem(int cod_hospedagem) {
        this.cod_hospedagem = cod_hospedagem;
    }
    
    public String getDescricao_hospedagem() {
        return descricao_hospedagem;
    }

    public void setDescricao_hospedagem(String descricao_hospedagem) {
        this.descricao_hospedagem = descricao_hospedagem;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public double getPreco_hospedagem() {
        return preco_hospedagem;
    }

    public void setPreco_hospedagem(double preco_hospedagem) {
        this.preco_hospedagem = preco_hospedagem;
    }

    public int getDia_entrada() {
        return dia_entrada;
    }

    public void setDia_entrada(int dia_entrada) {
        this.dia_entrada = dia_entrada;
    }

    public int getDia_saida() {
        return dia_saida;
    }

    public void setDia_saida(int dia_saida) {
        this.dia_saida = dia_saida;
    }

    public String getMes_entrada() {
        return mes_entrada;
    }

    public void setMes_entrada(String mes_entrada) {
        this.mes_entrada = mes_entrada;
    }

    public String getMes_saida() {
        return mes_saida;
    }

    public void setMes_saida(String mes_saida) {
        this.mes_saida = mes_saida;
    }

    public int getAno_entrada() {
        return ano_entrada;
    }

    public void setAno_entrada(int ano_entrada) {
        this.ano_entrada = ano_entrada;
    }

    public int getAno_saida() {
        return ano_saida;
    }

    public void setAno_saida(int ano_saida) {
        this.ano_saida = ano_saida;
    }


}
