package POO.Basico.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Luigi",18);
        //pessoa1.nome = "Luigi";
        //pessoa1.idade= 24;
        //pessoa1.peso= 65;

        Pessoa pessoa2 = new Pessoa();
        //pessoa2.nome = "Fernando";
        //pessoa2.idade= 24;
        //pessoa2.peso=40;

        //pessoa2.apresentar();
        //pessoa1.apresentar();

        Carro carro1 = new Carro();
        carro1.ano = 1994;
        carro1.cor = "Preto";
        carro1.marca = "Mazda";
        carro1.modelo= "Mazda RX-7";
        carro1.dono = pessoa1;

        carro1.ligar();
    }
}
