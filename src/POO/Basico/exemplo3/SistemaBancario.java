package POO.Basico.exemplo3;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(100);

        System.out.println(cb.sacar(20));

        System.out.println(cb.sacar(-50));

        System.out.println(cb.sacar(0));

        System.out.println(cb.sacar(10_000));

        System.out.println(cb.depositar(0););

        System.out.println(cb.depositar(1_000););


    }
}
