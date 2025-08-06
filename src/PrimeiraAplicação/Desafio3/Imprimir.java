package PrimeiraAplicação.Desafio3;

import java.util.Scanner;

public class Imprimir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("O primeiro número é maior");
        } else if (n1 < n2 ) {
            System.out.println("O primeiro número é menor");
        } else {
            System.out.println("Os dois números são iguais! ");
        }


    }
}
