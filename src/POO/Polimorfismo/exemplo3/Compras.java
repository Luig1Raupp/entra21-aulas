package POO.Polimorfismo.exemplo3;

public class Compras {
    private double valorCompra;

    public Compras(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarCompra(Pagamento pagamento) {
        pagamento.pagarAVista();
        System.out.println("Compra realizada com sucesso!");
    }
}
