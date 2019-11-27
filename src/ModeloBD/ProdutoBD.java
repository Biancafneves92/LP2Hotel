package ModeloBD;
import java.util.Date;
public class ProdutoBD {

    private int cod_produto_servico;
    private String nome_produto;
    private String descricao_produto_servico;
    private double preco_produto_servico;
    private double quantidade_produto_servici;
    private int prodServAnocons;
    private String prodServMescons; 
    private int prodServDiacons;


    public int getCod_produto_servico() {
        return cod_produto_servico;
    }

    public void setCod_produto_servico(int cod_produto_servico) {
        this.cod_produto_servico = cod_produto_servico;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao_produto_servico() {
        return descricao_produto_servico;
    }

    public void setDescricao_produto_servico(String descricao_produto_servico) {
        this.descricao_produto_servico = descricao_produto_servico;
    }

    public double getPreco_produto_servico() {
        return preco_produto_servico;
    }

    public void setPreco_produto_servico(double preco_produto_servico) {
        this.preco_produto_servico = preco_produto_servico;
    }

    public double getQuantidade_produto_servici() {
        return quantidade_produto_servici;
    }

    public void setQuantidade_produto_servici(double quantidade_produto_servici) {
        this.quantidade_produto_servici = quantidade_produto_servici;
    }

    public int getProdServAnocons() {
        return prodServAnocons;
    }

    public void setProdServAnocons(int prodServAnocons) {
        this.prodServAnocons = prodServAnocons;
    }

    public String getProdServMescons() {
        return prodServMescons;
    }

    public void setProdServMescons(String prodServMescons) {
        this.prodServMescons = prodServMescons;
    }

    public int getProdServDiacons() {
        return prodServDiacons;
    }

    public void setProdServDiacons(int prodServDiacons) {
        this.prodServDiacons = prodServDiacons;
    }


        
}
