package PrimeiraAplicação.Desafio3;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite numero");
        int numero = scanner.nextInt();

        //ternariooooo
//        if (numero > 0) {
//            System.out.println("Numero positivo");
//        } else {
//            System.out.println("Numero negativo");
//        }
        String mensagem = (numero > 0) ? "Número positivo" : " Número negativo";
        System.out.println(mensagem);
    }
}
