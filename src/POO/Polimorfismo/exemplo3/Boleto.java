package POO.Polimorfismo.exemplo3;

public class Boleto extends Pagamento{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando com via boleto... ");
    }
}
