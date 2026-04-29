package POO.Polimorfismo.exemplo2;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setSalarioBase(1_680);
        System.out.println("O salario do Funcionário é "+ funcionario.calcularPagamento());

        Funcionario vendedor = new Vendedor(2000d, 3000d);
        System.out.println("O salario do Vendedor é "+ vendedor.calcularPagamento());

        Funcionario gerente = new Gerente();
        gerente.setSalarioBase(10_000d);
        System.out.println("O salario do Gerente é " + gerente.calcularPagamento());
    }
}
