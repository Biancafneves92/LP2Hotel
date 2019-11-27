package ModeloBD;
public class Hosp_prod_servBD {
    
private int cod_hospedagem;
private int cod_produto_servico;
private String descricao_hospedagem_produto;
private double preco_produto_servico;
private double quantidade_produto_servici;

    public int getCod_hospedagem() {
        return cod_hospedagem;
    }

    public void setCod_hospedagem(int cod_hospedagem) {
        this.cod_hospedagem = cod_hospedagem;
    }

    public int getCod_produto_servico() {
        return cod_produto_servico;
    }

    public void setCod_produto_servico(int cod_produto_servico) {
        this.cod_produto_servico = cod_produto_servico;
    }

    public String getDescricao_hospedagem_produto() {
        return descricao_hospedagem_produto;
    }

    public void setDescricao_hospedagem_produto(String descricao_hospedagem_produto) {
        this.descricao_hospedagem_produto = descricao_hospedagem_produto;
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



}
