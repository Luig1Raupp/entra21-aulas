package POO.Herança.Exemplo3;

public class Produto {
    private String nome;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes(){
        System.out.println("Nome " + this.nome);
        System.out.println("Preço: " + this.preco + "R$");
    }

}
