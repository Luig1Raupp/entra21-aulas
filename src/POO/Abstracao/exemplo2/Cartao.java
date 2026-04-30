package POO.Abstracao.exemplo2;

public class Cartao extends Pagamento{

    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Pagamento com Cartão!");
    }
}
