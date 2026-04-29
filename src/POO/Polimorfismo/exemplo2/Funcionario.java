package POO.Polimorfismo.exemplo2;

public class Funcionario {
    //Encapsulamento
    private double salarioBase;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento(){
        return this.salarioBase;
    }

}
