package POO.Basico.exemplo3;


public class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo Inválido");
            throw new IllegalArgumentException();
        }
        this.saldo = saldo;
    }

    void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido");
        } else {
           this.saldo = this.saldo + valor;
            System.out.println("Deposito de " + valor + "feito com sucesso");
        }
    }

    String sacar(double valor){
        if (valor <= 0){
            return "Valor inválido";
        } else if (valor > saldo) {
            return "Saldo insuficiente";
        } else {
            this.saldo = this.saldo - valor;
            return "Saque efetuado, seu novo saldo é " + this.saldo;
        }
    }
}
