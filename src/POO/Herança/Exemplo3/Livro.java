package POO.Herança.Exemplo3;

import java.util.SplittableRandom;

public class Livro extends Produto {
    private String autor;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + this.autor);
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
}
