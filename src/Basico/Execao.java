package Basico;

import java.util.Scanner;

public class Execao {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite um número: ");
        num1 = scaner.nextInt();

        System.out.println("Digi outro número: ");
        num2 = scaner.nextInt();

        try{
            double divisão = num1 / num2;
            System.out.println(divisão);
        } catch (ArithmeticException exception) {
            System.out.println("Não pode dividir por zero, burrão");
        }

        //OUTRA MANEIRA
        if (num2 == 0) {
            System.out.println("Não pode dividir por zero, burrão");
        } else {
            System.out.println(num1 / num2);
        }

    }
}
