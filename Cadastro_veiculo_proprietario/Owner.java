package Cadastro_veiculo_proprietario;
import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String nome;
    private String identidade;
    private String nascimento;
    private String estadoCivil;
    private List<Vehicle> veiculos = new ArrayList<>();

    public Owner(String nome, String identidade, String nascimento, String estadoCivil){
        this.nome = nome;
        this.identidade = identidade;
        this.nascimento = nascimento;
        this.estadoCivil = estadoCivil;
    }
    public String getNome() {
        return nome;
    }
    public String getNascimento() {
        return nascimento;
    }
    public String getIdentidade() {
        return identidade;
    }
    public Vehicle getVeiculo(int index) {
        return veiculos.get(index);
    }
    public List<Vehicle> getVeiculos() {
        return veiculos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
    public void addVeiculo(String tipo, String marca, String ano, String cor, String documento, String chaci) {
        Vehicle veiculo = new Vehicle(tipo, marca, ano, cor, documento, chaci, this);
        this.veiculos.add(veiculo);
    }
    public void setVeiculo(int index, Vehicle veiculo) {
        this.veiculos.set(index, veiculo);
    }
    public void removeVeiculo(int index) {
        this.veiculos.remove(index);
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    @Override
    public String toString() {
        if (this.veiculos.size() > 1){
            String ret = "";
            String partes[] = nascimento.split("/");
            int idade = 2023 - Integer.parseInt(partes[2]);
            switch (this.veiculos.size()){
                case 2:
                    ret = "dois veiculos";
                    break;
            }
            if (idade >= 40){
                return "O Sr. " + this.nome + " tem " + ret;
            }
        }
        if (this.veiculos.size() <= 1){
            if (this.getVeiculo(0).getTipo() == "Moto"){
                return this.nome + " tem " + "uma moto";
            }
            return this.nome + " tem um " + this.getVeiculo(0).getMarca() + " " + this.getVeiculo(0).getAno().substring(this.getVeiculo(0).getAno().length() - 2);
        }  
        return "";
    }
}
