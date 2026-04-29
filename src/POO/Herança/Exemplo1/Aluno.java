package POO.Herança.Exemplo1;

public class Aluno extends Pessoa {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, String matricula){
        super(idade, nome);
        this.matricula = matricula;
    }

    public void apresentar(){
        System.out.println("Meu nome é: " + super.getNome());
    }

}
