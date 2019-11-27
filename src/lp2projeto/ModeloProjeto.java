/*package lp2projeto;

public class ModeloProjeto {
    private String clienteBairro;
    private long clienteCPF;
    private int clienteCep;
    private String clienteCidade;
    private String clienteEmail;
    private String clienteEstado;
    private int clienteNRua;
    private String clienteNm;
    private String clientePais;
    private int clienteRG;
    private String clienteRua;
    private String clienteSnm;
    private long clienteTelefone;
    private int clienteAnonasc;
    private String clienteMesNasc; 
    private int clienteDtnasci; 
    private String clienteSexo;
    
    
    private long acompCPF;
    private String acompEmail;
    private String acompNm;
    private int acompRG;
    private String acompSnm;
    private int acompAnonasc;
    private String acompMesNasc; 
    private int acompDtnasci; 
    private String acompSexo;
    
    
    private int prodAnoConsumo;
    private int prodDtConsumo;
    private String prodMesConsumo;
    private String prodDescricao;
    private String prodNome;
    private double prodPreco;
    private int prodQuant;
    
    
    private String hospCliente;
    private int hospDtEntrada;
    private int hospDtSaida;
    private String hospMesEntrada;
    private String hospMesSaida;
    private int hospAnoEntrada;
    private int hospAnoSaida;
    private String hospDescricao;
    private double hospPrecEstadia;
    private double hospPrecTotal;
    
        
    private String quartoTipo;
    private int quartoAndar;
    private int quartoNum;
    private String quartoDescr;

    public String getClienteBairro() {
        return clienteBairro;
    }

    public void setClienteBairro(String clienteBairro) {
        this.clienteBairro = clienteBairro;
    }

    public long getClienteCPF() {
        return clienteCPF;
    }

    public void setClienteCPF(long clienteCPF) {
        this.clienteCPF = clienteCPF;
    }

    public int getClienteCep() {
        return clienteCep;
    }

    public void setClienteCep(int clienteCep) {
        this.clienteCep = clienteCep;
    }

    public String getClienteCidade() {
        return clienteCidade;
    }

    public void setClienteCidade(String clienteCidade) {
        this.clienteCidade = clienteCidade;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteEstado() {
        return clienteEstado;
    }

    public void setClienteEstado(String clienteEstado) {
        this.clienteEstado = clienteEstado;
    }

    public int getClienteNRua() {
        return clienteNRua;
    }

    public void setClienteNRua(int clienteNRua) {
        this.clienteNRua = clienteNRua;
    }

    public String getClienteNm() {
        return clienteNm;
    }

    public void setClienteNm(String clienteNm) {
        this.clienteNm = clienteNm;
    }

    public String getClientePais() {
        return clientePais;
    }

    public void setClientePais(String clientePais) {
        this.clientePais = clientePais;
    }

    public int getClienteRG() {
        return clienteRG;
    }

    public void setClienteRG(int clienteRG) {
        this.clienteRG = clienteRG;
    }

    public String getClienteRua() {
        return clienteRua;
    }

    public void setClienteRua(String clienteRua) {
        this.clienteRua = clienteRua;
    }

    public String getClienteSnm() {
        return clienteSnm;
    }

    public void setClienteSnm(String clienteSnm) {
        this.clienteSnm = clienteSnm;
    }

    public long getClienteTelefone() {
        return clienteTelefone;
    }

    public void setClienteTelefone(long clienteTelefone) {
        this.clienteTelefone = clienteTelefone;
    }

    public int getClienteAnonasc() {
        return clienteAnonasc;
    }

    public void setClienteAnonasc(int clienteAnonasc) {
        this.clienteAnonasc = clienteAnonasc;
    }

    public String getClienteMesNasc() {
        return clienteMesNasc;
    }

    public void setClienteMesNasc(String clienteMesNasc) {
        this.clienteMesNasc = clienteMesNasc;
    }

    public int getClienteDtnasci() {
        return clienteDtnasci;
    }

    public void setClienteDtnasci(int clienteDtnasci) {
        this.clienteDtnasci = clienteDtnasci;
    }

    public String getClienteSexo() {
        return clienteSexo;
    }

    public void setClienteSexo(String clienteSexo) {
        this.clienteSexo = clienteSexo;
    }

    public long getAcompCPF() {
        return acompCPF;
    }

    public void setAcompCPF(long acompCPF) {
        this.acompCPF = acompCPF;
    }

    public String getAcompEmail() {
        return acompEmail;
    }

    public void setAcompEmail(String acompEmail) {
        this.acompEmail = acompEmail;
    }

    public String getAcompNm() {
        return acompNm;
    }

    public void setAcompNm(String acompNm) {
        this.acompNm = acompNm;
    }

    public int getAcompRG() {
        return acompRG;
    }

    public void setAcompRG(int acompRG) {
        this.acompRG = acompRG;
    }

    public String getAcompSnm() {
        return acompSnm;
    }

    public void setAcompSnm(String acompSnm) {
        this.acompSnm = acompSnm;
    }

    public int getAcompAnonasc() {
        return acompAnonasc;
    }

    public void setAcompAnonasc(int acompAnonasc) {
        this.acompAnonasc = acompAnonasc;
    }

    public String getAcompMesNasc() {
        return acompMesNasc;
    }

    public void setAcompMesNasc(String acompMesNasc) {
        this.acompMesNasc = acompMesNasc;
    }

    public int getAcompDtnasci() {
        return acompDtnasci;
    }

    public void setAcompDtnasci(int acompDtnasci) {
        this.acompDtnasci = acompDtnasci;
    }

    public String getAcompSexo() {
        return acompSexo;
    }

    public void setAcompSexo(String acompSexo) {
        this.acompSexo = acompSexo;
    }

    public int getProdAnoConsumo() {
        return prodAnoConsumo;
    }

    public void setProdAnoConsumo(int prodAnoConsumo) {
        this.prodAnoConsumo = prodAnoConsumo;
    }

    public int getProdDtConsumo() {
        return prodDtConsumo;
    }

    public void setProdDtConsumo(int prodDtConsumo) {
        this.prodDtConsumo = prodDtConsumo;
    }

    public String getProdMesConsumo() {
        return prodMesConsumo;
    }

    public void setProdMesConsumo(String prodMesConsumo) {
        this.prodMesConsumo = prodMesConsumo;
    }

    public String getProdDescricao() {
        return prodDescricao;
    }

    public void setProdDescricao(String prodDescricao) {
        this.prodDescricao = prodDescricao;
    }

    public String getProdNome() {
        return prodNome;
    }

    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    public double getProdPreco() {
        return prodPreco;
    }

    public void setProdPreco(double prodPreco) {
        this.prodPreco = prodPreco;
    }

    public int getProdQuant() {
        return prodQuant;
    }

    public void setProdQuant(int prodQuant) {
        this.prodQuant = prodQuant;
    }

    public String getHospCliente() {
        return hospCliente;
    }

    public void setHospCliente(String hospCliente) {
        this.hospCliente = hospCliente;
    }

    public int getHospDtEntrada() {
        return hospDtEntrada;
    }

    public void setHospDtEntrada(int hospDtEntrada) {
        this.hospDtEntrada = hospDtEntrada;
    }

    public int getHospDtSaida() {
        return hospDtSaida;
    }

    public void setHospDtSaida(int hospDtSaida) {
        this.hospDtSaida = hospDtSaida;
    }

    public String getHospMesEntrada() {
        return hospMesEntrada;
    }

    public void setHospMesEntrada(String hospMesEntrada) {
        this.hospMesEntrada = hospMesEntrada;
    }

    public String getHospMesSaida() {
        return hospMesSaida;
    }

    public void setHospMesSaida(String hospMesSaida) {
        this.hospMesSaida = hospMesSaida;
    }

    public int getHospAnoEntrada() {
        return hospAnoEntrada;
    }

    public void setHospAnoEntrada(int hospAnoEntrada) {
        this.hospAnoEntrada = hospAnoEntrada;
    }

    public int getHospAnoSaida() {
        return hospAnoSaida;
    }

    public void setHospAnoSaida(int hospAnoSaida) {
        this.hospAnoSaida = hospAnoSaida;
    }

    public String getHospDescricao() {
        return hospDescricao;
    }

    public void setHospDescricao(String hospDescricao) {
        this.hospDescricao = hospDescricao;
    }

    public double getHospPrecEstadia() {
        return hospPrecEstadia;
    }

    public void setHospPrecEstadia(double hospPrecEstadia) {
        this.hospPrecEstadia = hospPrecEstadia;
    }

    public double getHospPrecTotal() {
        return hospPrecTotal;
    }

    public void setHospPrecTotal(double hospPrecTotal) {
        this.hospPrecTotal = hospPrecTotal;
    }

    public String getQuartoTipo() {
        return quartoTipo;
    }

    public void setQuartoTipo(String quartoTipo) {
        this.quartoTipo = quartoTipo;
    }

    public int getQuartoAndar() {
        return quartoAndar;
    }

    public void setQuartoAndar(int quartoAndar) {
        this.quartoAndar = quartoAndar;
    }

    public int getQuartoNum() {
        return quartoNum;
    }

    public void setQuartoNum(int quartoNum) {
        this.quartoNum = quartoNum;
    }

    public String getQuartoDescr() {
        return quartoDescr;
    }

    public void setQuartoDescr(String quartoDescr) {
        this.quartoDescr = quartoDescr;
    }
   
    
}    */
