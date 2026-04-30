package POO.Abstracao.exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Digite o valor da compra: ");
        double valorDaCompra = scanner.nextDouble();

        System.out.println("Escolha uma forma de pagamento: ");
        System.out.println("[1] - Pix");
        System.out.println("[2] - Boleto");
        System.out.println("[3] - Cartão");
        int formaDePagamento = scanner.nextInt();

        if(formaDePagamento == 1){
            Pagamento pagamento = new Pix(valorDaCompra);
            pagamento.processar();
        } else if (formaDePagamento == 2) {
           Pagamento pagamento = new Boleto(valorDaCompra);
           pagamento.processar();
        } else if (formaDePagamento == 3) {
            Pagamento pagamento = new Cartao(valorDaCompra);
            pagamento.processar();
        } else {
            System.out.println("Melhora ai Nengué ...");
        }
    }
}
