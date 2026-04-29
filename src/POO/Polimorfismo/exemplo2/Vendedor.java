package POO.Polimorfismo.exemplo2;

public class Vendedor extends Funcionario {
    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + comissao;
    }

    public Vendedor(double comissao, double salarioBase) {
        super.setSalarioBase(salarioBase);
        this.comissao = comissao;
    }
}
