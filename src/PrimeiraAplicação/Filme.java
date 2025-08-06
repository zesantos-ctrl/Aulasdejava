package PrimeiraAplicação;

import java.util.Scanner;

public class Filme {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome do filme: ");
        String filme = teclado.nextLine();
        System.out.println("Ano que lançou: ");
        int anoQueLancou = teclado.nextInt();

        System.out.println("Nome do filme é: " + filme + " - O ano foi: " + anoQueLancou);
    }
}
