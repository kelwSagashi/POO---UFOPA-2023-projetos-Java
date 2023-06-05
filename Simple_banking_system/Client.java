package Simple_banking_system;
public class Client {
    private String cpf;
    private String nome;
    private int sexo;
    private String telefone;
    public Client(String cpf, String nome, int sexo, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone; 
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public int getSexo() {
        return sexo;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return nome;
        //return "Client [cpf=" + cpf + ", nome=" + nome + ", sex="+sexo + ", telefone=" + telefone + "]";
    }
    
}
