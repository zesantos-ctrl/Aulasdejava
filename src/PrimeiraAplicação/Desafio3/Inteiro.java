package PrimeiraAplicação.Desafio3;

import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = teclado.nextInt();

       /* if (numero % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        } */
        String mensagem = (numero % 2 == 0) ? "Número é par" : "Número é ímpar";
        System.out.println(mensagem);
    }
}
