package POO.Basico.exemplo2;

public class Modelagem {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Luigi Raupp";
        aluno1.idade= 24;

        System.out.println("Meu nome é "+ aluno1.nome + " e minha idade é " + aluno1.idade + " e agora eu estou .... ");
        aluno1.estudar();
    }
}
