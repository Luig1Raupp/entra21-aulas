package POO.Herança.Exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Bonequinho de Brinquedo");
        produto.setPreco(200);

        produto.exibirInformacoes();

        System.out.println("============================================");

        Livro livro = new Livro();
        livro.setNome("Mauz");
        livro.setPreco(89.90d);
        livro.setAutor("Art Splilgerman");

        livro.exibirInformacoes();
    }
}
