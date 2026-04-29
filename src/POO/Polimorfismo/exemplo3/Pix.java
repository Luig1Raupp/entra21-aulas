package POO.Polimorfismo.exemplo3;

public class Pix extends Pagamento{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando a vista com PIX!");
    }
}
