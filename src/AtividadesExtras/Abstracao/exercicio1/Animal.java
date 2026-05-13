package AtividadesExtras.Abstracao.exercicio1;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract String emitirSom();

}
