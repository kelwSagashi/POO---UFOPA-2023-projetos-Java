package Cadastro_veiculo_proprietario;

public class Vehicle {
    private String tipo;
    private String marca;
    private String ano;
    private String cor;
    private String documento;
    private String chaci;
    private Owner proprietatio;
    public Vehicle (String tipo, String marca, String ano, String cor, String documento, String chaci, Owner proprietario) {
        this.tipo = tipo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.documento = documento;
        this.chaci = chaci;
        this.proprietatio = proprietario;
    }
    public String getAno() {
        return ano;
    }
    public String getChaci() {
        return chaci;
    }
    public String getCor() {
        return cor;
    }
    public String getDocumento() {
        return documento;
    }
    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return tipo;
    }
    public Owner getProprietatio() {
        return proprietatio;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public void setChaci(String chaci) {
        this.chaci = chaci;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setProprietatio(Owner proprietatio) {
        this.proprietatio = proprietatio;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
