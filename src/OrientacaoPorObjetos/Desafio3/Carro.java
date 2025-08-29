package OrientacaoPorObjetos.Desafio3;

public class Carro {
    private String modelo;
    private double ano1;
    private double ano2;
    private double ano3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPreco(double ano1, double ano2, double ano3) {
        this.ano1 = ano1;
        this.ano2 = ano2;
        this.ano3 = ano3;
    }


    public void exibirFicha() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço ano1: " + ano1);
        System.out.println("Preco ano2: " + ano2);
        System.out.println("Preco ano3: " + ano3);
    }


    private double calcularMenorPreco() {
        double menorPreco = ano1;

        if (ano2 < menorPreco) {
            menorPreco = ano2;
        }

        if (ano3 < menorPreco) {
            menorPreco = ano3;
        }

        return menorPreco;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = ano1;

        if (ano2 > maiorPreco) {
            maiorPreco = ano2;
        }

        if (ano3 > maiorPreco) {
            maiorPreco = ano3;
        }

        return maiorPreco;
    }
}
