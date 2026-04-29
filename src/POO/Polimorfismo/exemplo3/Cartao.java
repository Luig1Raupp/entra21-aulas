package POO.Polimorfismo.exemplo3;

public class Cartao extends Pagamento{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando a vista com cartão de crédito... ");
    }
}
