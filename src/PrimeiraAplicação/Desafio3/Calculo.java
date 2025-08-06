package PrimeiraAplicação.Desafio3;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("sim: ");

        int calcular = teclado.nextInt();
        switch (calcular) {
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                int lado = teclado.nextInt();
                int resultado = lado * lado;
                System.out.println(resultado);
                break;
            case 2:
                System.out.println("Digite o raio circulo: ");
                double raio = teclado.nextInt();
                double pi = 3.14;
                double raioAoQuadrado = raio * raio;
                double calculo = pi * raioAoQuadrado;
                System.out.println(calculo);
                break;
            default:
                System.out.println("Esse opção não existe");
                break;
        }

    }
}
