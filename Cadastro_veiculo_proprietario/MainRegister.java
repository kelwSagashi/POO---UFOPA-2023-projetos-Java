package Cadastro_veiculo_proprietario;

public class MainRegister {
    public static void main(String[] args) {
        Owner mat = new Owner("Matheus Aguiar", "111111111", "10/10/1980", "Solteiro");
        Owner sara = new Owner("Sara Lima", "222222222", "01/01/1997", "Casada");
        Owner augus = new Owner("Augusto Cesar", "333333333", "29/08/1985", "Casado");

        //associando os veiculos ao mateus
        mat.addVeiculo("Carro", "Fiat", "2002", "Preta", "13", "aaaaaaaaaaaaaaa");
        mat.addVeiculo("Carro", "Fiat-uno", "2002", "verde", "14", "aaaaaaaaaaaaaaa");
        
        //associando a moto a sara
        sara.addVeiculo("Moto", "Honda", "2010", "Preta", "11", "aaaaaaaaaaaaaaa");

        //associando o fusca ao augusto
        augus.addVeiculo("Carro", "Fusca", "1996", "Cinza", "12", "aaaaaaaaaaaaaaa");

        System.out.println(mat.toString() + ", " + sara.toString() + " e " + augus.toString());
    }
}
