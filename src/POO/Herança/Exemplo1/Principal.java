package POO.Herança.Exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(24, "Luigi R.");
        Aluno aluno = new Aluno("Luigi R.", 18, "2949");

        aluno.apresentar();
        aluno.getNome();

        System.out.println("Descrição aluno: " + aluno.getNome());
        System.out.println("Descrição aluno: " + aluno.getIdade());
        System.out.println("Descrição aluno: " + aluno.getMatricula());
    }
}
