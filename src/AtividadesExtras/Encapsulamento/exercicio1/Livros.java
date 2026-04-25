package AtividadesExtras.Encapsulamento.exercicio1;

public class Livros {
    private String titulo = "Mauz";
    private String autor = "Art Spiegelman";

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void Apresentar(){
        System.out.println("O titulo deste livro é " + this.titulo);
        System.out.println("E o seu autor é " + this.autor);
    }

}
